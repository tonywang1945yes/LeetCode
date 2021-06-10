package GetTheOffer.Offer32;
import java.util.*;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<TreeNode> nodes=new ArrayList<>();
        nodes.add(root);
        while (nodes.size()>0){
            for (int j=0;j<nodes.size();j++){
                TreeNode node=nodes.get(j);
                res.add(node.val);
                if(node.left!=null){
                    nodes.add(node.left);
                }
                if(node.right!=null){
                    nodes.add(node.right);
                }
                nodes.remove(node);
                j--;
            }
        }

        int[] result=new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}
