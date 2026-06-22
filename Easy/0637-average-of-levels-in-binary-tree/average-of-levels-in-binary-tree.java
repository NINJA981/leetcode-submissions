/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null){
            q.offer(root);
        }
        List<Double> result = new ArrayList<>();
        while(!q.isEmpty()){
            int size= q.size();
            long sum=0;
            for (int i= 0 ; i<size ; i++){
                TreeNode node = q.poll();
                sum +=node.val;
                if(node.right != null){
                    q.offer(node.right);
                }
                if (node.left != null){
                    q.offer(node.left);
                }

            }
double avg = (double) sum / size;
            result.add(avg);

        }
        return result;
    }
}