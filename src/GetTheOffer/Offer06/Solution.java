package GetTheOffer.Offer06;


import java.util.ArrayList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

/**
 * 使用栈来解答
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer>  arrayList=new ArrayList<>();
        if(head==null){
            return new int[0];
        }else{
            do{
                arrayList.add(head.val);
                head=head.next;
            }while (head!=null);
            int x[]=new int[arrayList.size()];
            for(int i=0;i<arrayList.size();i++){
                x[i]=arrayList.get(arrayList.size()-i-1);
            }
            return x;
        }

    }
}
