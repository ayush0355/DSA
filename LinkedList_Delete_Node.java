Node deleteNode(Node head, int x)
    {   
        Node temp=head;
        Node temp1=null;
        if(x==1){
            temp=temp.next;
            return temp;
        }
            for(int i=1; i<x; i++){
                temp1=temp;
                temp=temp.next;
            }
            if(temp.next==null){
                temp1.next=null;
            }
            else{
             temp1.next=temp.next;
            }
   return head;
    }