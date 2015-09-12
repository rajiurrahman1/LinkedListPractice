/*
  class Node {
     int data;
     Node next;
  }
*/

Node Reverse(Node head) {    
    if(head == null){ return null;}
    else if(head.next == null){ return head;}
    else{
        Node current = head;
        Node rev = new Node();
        rev = null;
        while(current != null){                           
            Node n = new Node();
            n.data = current.data;
            n.next = rev;
            rev = n;
            current = current.next;
        }
        return rev;
    }            
}