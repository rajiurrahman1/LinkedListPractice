/* 
  class Node {
     int data;
     Node next;
  }
*/

int CompareLists(Node headA, Node headB) {
    int compFlag = 1;
    if(headA == null && headB == null){
        return 1;
    }
    else if(headA == null && headB != null){
        return 0;
    }
    else if(headA != null && headB == null){
        return 0;
    }
    else{        
        while(true){
            if(headA == null || headB == null){
                break;
            }
            int valA = headA.data;
            int valB = headB.data;
            if(valA != valB){
                compFlag = 0;
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }
        if(compFlag == 0){
            return 0;
        }
        else{
            if(headA != null || headB != null){
                return 0;
            }
            else{
                return 1;
            }
        }
    }
}
