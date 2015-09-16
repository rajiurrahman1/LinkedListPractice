Node SortedInsert(Node head, int data) {
    Node temp = new Node();
    temp.data = data;
    if(head == null){ //list is empty
        temp.next = null;
        temp.prev = null;
        return temp;
    }
    else{
        Node current = head;
        if(data < current.data && current.next == null){ //insert at the begining 
            temp.prev = null;
            temp.next = current;
            current.prev = temp;
            return temp; // temp poitns at the next element, temp is the head, return
        }
        else{
            while(current.data < data && current.next != null){
                current = current.next; 
            }   // if data is in the middle, current current will point at the next element (Oka??)
            if(current.next == null){ // list is traversed and all the elmetns are smaller than data //insert at the end
                temp.prev = current;
                temp.next = null;
                current.next = temp;
            }
            else{ // insert at the middle of two elemtns
                Node toBeNextElement = current;
                Node toBePreviousElement = current.prev;
                temp.next = toBeNextElement;
                temp.prev = toBePreviousElement;
                toBeNextElement.prev = temp;
                toBePreviousElement.next = temp;
            }
            return head;        
        }
    }    
}
