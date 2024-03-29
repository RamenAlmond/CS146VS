package HW.HW10.JavaCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public static void main(String[] args) {
        LevelOrder test = new LevelOrder();
        TreeNode root = new TreeNode(4);
        TreeNode emptyRoot = null;
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        /*            4
         *           / \
         *          3   8
         *         /   / \
         *        1   5   9
         */       

        List<List<Integer>> temp = test.levelOrder(root);
        List<List<Integer>> tempEmpty = test.levelOrder(emptyRoot);
        
        System.out.println("Order: " + temp);
        System.out.println("Order: " + tempEmpty);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }

}
