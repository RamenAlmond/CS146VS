package LAB.LAB5.JavaCode;

public class IsValidBST {
    
    public static void main(String[] args) {
        IsValidBST test = new IsValidBST();

        //Make the Binary Tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
        //Print out the tree
        print(root);
        //Print if tree is valid: Should say True
        System.out.println("Valid BST?: " + test.isValidBST(root));

        //Make the Binary Tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(8);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(6);
        //Print out the tree
        print(root2);
        //Print if tree is valid: Should say False
        System.out.println("Valid BST?: " + test.isValidBST(root2));
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null){ //if root is null return true
            return true;
        }
        if(root.left != null){//Check if left child of the root is null
            if(root.left.val > root.val){//If the value of left child is > than root return false
                return false;
            }
        }
        if(root.right != null){//Check if right child of the root is null
            if(root.right.val < root.val){//If the value of right child is < than root return false
                return false;
            }
        }
        isValidBST(root.left); //Check recursively on the left
        isValidBST(root.right);//Check recurseively on the right
        return true; 
    }
    //Used to print the tree
    public static void print(TreeNode node) {
        if (node == null) {
            return;
        }
        
        print(node.left);
        System.out.print(node.val + " ");
        print(node.right);
    }
}
