package LAB.LAB4.JavaCode;

public class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   
   TreeNode() {
   }

   TreeNode(int var1) {
      this.val = var1;
   }

   TreeNode(int var1, TreeNode var2, TreeNode var3) {
      this.val = var1;
      this.left = var2;
      this.right = var3;
   }
}