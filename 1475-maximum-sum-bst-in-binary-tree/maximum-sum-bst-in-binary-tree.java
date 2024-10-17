class Solution {
    
    class Pair{
        boolean isBST;
        int sum;
        int max;
        int min;
        Pair(boolean _isBST,int _sum,int _max,int _min){
            isBST=_isBST;
            sum=_sum;
            max=_max;
            min=_min;
        }
        Pair(){
            isBST=false;
            sum=0;
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
        }
    }
    
    int res=0;
    public int maxSumBST(TreeNode root) {
        helper(root);
        return res;
    }
    
    private Pair helper(TreeNode root){
        if(root==null){
            return new Pair(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        
        Pair l=helper(root.left);
        Pair r=helper(root.right);
        
        Pair ansret=new Pair();
        
        if(root.val>l.max && root.val<r.min && l.isBST && r.isBST){
            ansret.isBST=true;
            ansret.sum=l.sum+r.sum+root.val;
            ansret.min=Math.min(root.val,l.min);
            ansret.max=Math.max(root.val,r.max);
            res=Math.max(res,ansret.sum);
        }
        
        else{
            ansret.isBST=false;
            ansret.sum=0;
            ansret.max=Integer.MAX_VALUE;
            ansret.min=Integer.MIN_VALUE;
        }
        return ansret;
    }
}