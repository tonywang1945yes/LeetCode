package GetTheOffer.Offer29;

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0){
            return new int[0];
        }else{
            int l=matrix.length*matrix[0].length;
            int[] res=new int[l];
            int k=0,i=0,j=0;
            //
            Walker w=new Walker(matrix[0].length-1,matrix.length-1);
            while (k<l){
                i=w.get_i();
                j=w.get_j();
                res[k]=matrix[i][j];
                w.next();
                k++;
            }
            return res;
        }
    }
}

class Walker{
    private int i=0;
    private int j=0;
    private int up=0;
    private int down=0;
    private int right=0;
    private int left =0;
    public Walker(int rgt, int dwn){
        right=rgt;
        down=dwn;
    }
    public int direct=0;//0 向右；1向下；2向左；3向上
    public void next(){
        if(direct==0){
            if(j+1>right){
                change_direct();
                up++;
                i++;
            }else{
                j++;
            }
        }else if(direct==1){
            if(i+1>down){
                change_direct();
                right--;
                j--;
            }else{
                i++;
            }
        }else if(direct==2){
            if(j-1<left){
                change_direct();
                down--;
                i--;
            }else{
                j--;
            }
        }else{
            if(i-1<up){
                change_direct();
                left++;
                j++;
            }else{
                i--;
            }
        }
    }

    private void change_direct(){
        direct=(direct+1)%4;
    }

    public int get_i(){
        return i;
    }

    public int get_j(){
        return j;
    }
}