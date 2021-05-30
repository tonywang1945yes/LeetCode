package GetTheOffer.Offer03;
import javax.sound.midi.Soundbank;
import java.util.*;
class Solution {

    public static void main(String args[]){
        Solution sol=new Solution();
        int x[]={2, 3, 1, 0, 2, 5, 3};
        System.out.println(sol.findRepeatNumber(x));
    }
    /**
     *如果第i个位置是i，则继续循环。
     * 如果第i个位置是j，则把j放到第j个位置去，把第j个位置的元素放到第i个位置。
     * 如果第j个位置上已经是j了，则返回
     */
    public int findRepeatNumber(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i] != i){
                if (swap(nums,i,nums[i])){
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public boolean swap(int nums[], int a,int b){
        if (nums[a]==nums[b]){
            return true;
        }else {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            return false;
        }
    }
}
