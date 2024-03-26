package LAB.LAB4.JavaCode;

public class InverseTree {
	
    public static void main(String[] args) {
        InverseTree test = new InverseTree();

        //Make the Binary Tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        //Print out tree before inversing it
        System.out.println("Before: ");
        print(root);
        
        //Create a TreeNode called Inverted Root and run invertTree on the root
        TreeNode invertedRoot = new TreeNode();
        invertedRoot = test.invertTree(root);
        System.out.println();

        //Print out tree after inversing it
        System.out.println("After: ");
        print(invertedRoot);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){  //If root is null, return root
            return root;
        }
          //If root is not null, swap left and right child
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);  //Swap recursively on the left
        invertTree(root.right); //Swap recursively on the right
        return root;
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
