package pers.gxy.leetcode.n938;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        traversingPre(root,L,R);
        return sum;
    }
    void traversingPre(TreeNode root, int L, int R){
        if (root==null)return;
        System.out.printf("%d,",root==null?null:root.val);
        if(root.val>=L&&root.val<=R){
            sum=sum+root.val;
        }
        traversingPre(root.left,L,R);
         
        traversingPre(root.right,L,R);
        
    }
    

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}