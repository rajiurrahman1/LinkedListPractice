/*
  class Node {
     int data;
     Node next;
  }
*/

Node Reverse(Node head) {
    if(head == null){
        return null;
    }
    if(head.next == null){
        return head;
    }
    else{
        Node secondElement = head.next;
        head.next = null;
        Node reverseHead = Reverse(secondElement);
        secondElement.next = head;        
        return reverseHead;
    }
}