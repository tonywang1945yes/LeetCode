package previous.q2;

public class answer2 {
    public static void main(String args[]){
        System.out.println("hi");
        answer2 ans=new answer2();
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        ListNode l3=ans.addTwoNumbers(l1,l2);
        while(l3.next!=null){
            System.out.println(l3.val);
            l3=l3.next;
        }
        System.out.println(l3.val);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int r0=0;
            ListNode listNode=new ListNode(-1);
            ListNode l5 =new ListNode(-2);
            while(l1.next!=null && l2.next!=null){
                int r1=l1.val+l2.val+r0;
                if(r1>=10){
                    r0=1;
                }else{
                    r0=0;
                }
                int r2=r1%10;
                listNode.next=new ListNode(r2);
                listNode=listNode.next;
                l1=l1.next;
                l2=l2.next;
            }
            if(l1.next==null&&l2.next==null){
                int r1=l1.val+l2.val+r0;
                if(r1>=10){
                    r0=1;
                }else{
                    r0=0;
                }
                int r2=r1%10;
                listNode.next=new ListNode(r2);
                listNode=listNode.next;
                if(r0==1){
                    listNode.next=new ListNode(1);
                    listNode=listNode.next;
                }
            }else if(l1.next==null && l2.next!=null){
            int r1=l1.val+l2.val+r0;
            if(r1>=10){
                r0=1;
            }else{
                r0=0;
            }
            int r2=r1%10;
            listNode.next=new ListNode(r2);
                listNode=listNode.next;
            l2=l2.next;
            while (l2.next!=null){
                int r3=l2.val+r0;
                if(r3>=10){
                    r0=1;
                }else{
                    r0=0;
                }
                listNode.next=new ListNode(r3);
                listNode=listNode.next;
                l2=l2.next;
            }
            int r3=l2.val+r0;
                listNode.next=new ListNode(r3);
                listNode=listNode.next;
            if(r3>=10){
                listNode.next=new ListNode(1);
                listNode=listNode.next;
            }


        }else if(l2.next==null&&l1.next!=null){
            int r1=l1.val+l2.val+r0;
            if(r1>=10){
                r0=1;
            }else{
                r0=0;
            }
            int r2=r1%10;
            listNode.next=new ListNode(r2);
                listNode=listNode.next;
            l1=l1.next;
            while (l1.next!=null){
                int r3=l1.val+r0;
                if(r3>=10){
                    r0=1;
                }else{
                    r0=0;
                }
                listNode.next=new ListNode(r3);
                listNode=listNode.next;
                l1=l1.next;
            }
            int r3=l1.val+r0;
                listNode.next=new ListNode(r3);
                listNode=listNode.next;
            if(r3>=10){
                listNode.next=new ListNode(1);
                listNode=listNode.next;
            }


        }
        listNode=l5.next;
            return listNode.next;
    }
}
