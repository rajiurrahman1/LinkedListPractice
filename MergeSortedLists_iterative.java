/*
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
    if(headA == null){return headB;}
    if(headB == null){return headA;}
    
    Node head = new Node();  //setting up the head noede of the merged list
    if(headA.data < headB.data){
        head = headA;
        headA = headA.next;
    }
    else{
        head = headB;
        headB = headB.next;
    }
    Node current = head;
    while(headA != null && headB != null){
        if(headA.data < headB.data){
            current.next = headA;
            current = current.next;
            headA = headA.next;
        }
        else{
            current.next = headB;
            current = current.next;
            headB = headB.next;
        }
    }
    if(headA == null){current.next = headB;}
    if(headB == null){current.next = headA;}
    return head;
}