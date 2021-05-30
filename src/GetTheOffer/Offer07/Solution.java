package GetTheOffer.Offer07;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public static void main(String args[]){
        int x[]={3,9,20,15,7};
        int y[]={9,3,15,20,7};
        Solution solution=new Solution();
        TreeNode father = solution.buildTree(x,y);
        System.out.println(father.left.val);
        System.out.println(father.right.val);
    }
    int ptr=0;//这里可以使用全局变量，是因为处理完左子树会自然地开始处理右子树。
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        return subTreeCalc(preorder,inorder,0,preorder.length-1);
    }

    public TreeNode subTreeCalc(int[] preorder, int[] inorder,int begin,int end){
        TreeNode father=new TreeNode(preorder[ptr]);
        if (begin==end){
            father.left=null;
            father.right=null;
            return father;
        }
        for (int i=begin;i<=end;i++){
            if(inorder[i]==preorder[ptr]){
                if(i==begin){
                    father.left=null;
                    ptr++;
                    father.right=subTreeCalc(preorder,inorder,begin+1,end);
                }else if(i==end){
                    father.right=null;
                    ptr++;
                    father.left=subTreeCalc(preorder,inorder,begin,end-1);
                }else{
                    ptr++;

                    father.left=subTreeCalc(preorder,inorder,begin,i-1);
                    ptr++;
                    father.right=subTreeCalc(preorder,inorder,i+1,end);
                }
                break;
            }
        }
        return father;
    }
}
