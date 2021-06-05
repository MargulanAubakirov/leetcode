package fb.rangeSumBST_938;

public class Solution {
    int sum =0;

    public int rangeSumBST(Tree root, int low, int high){

        if(root == null)
        return  sum;

        calculate(root, low, high);
        return sum;
    }

    private void calculate(Tree root, int low, int high) {
        if (root == null)
            return;

        if (root.val > low)
            calculate(root.left, low, high);

        if (root.val >= low && root.val <= high){
            sum +=root.val;
        }
        if (high>root.val)
            calculate(root.right, low, high);
    }
}
