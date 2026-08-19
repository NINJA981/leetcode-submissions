class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        long maxSum = Long.MIN_VALUE;

        int answer = 1;
        int level = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            long sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                sum += node.val;

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                answer = level;
            }

            level++;
        }

        return answer;
    }
}