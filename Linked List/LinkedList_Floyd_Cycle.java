public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(head==null||head.next==null){
            return null;
        }
        ListNode s,f;
        s=f=head;
        while( f!=null && f.next!=null ){
            
            f=f.next.next;
            s=s.next;
            if(s==f){
                break;
            }
             if(f==null||f.next==null){
            return null;
        }
        }
       
        s=head;
        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return s;
    }
}