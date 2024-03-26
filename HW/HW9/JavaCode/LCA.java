package HW.HW9.JavaCode;

public class LCA {
    public static void main(String[] args) {
        LCA test = new LCA();
        //Make the tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        //Initiate p and q with values of the tree
        TreeNode p = root;
        TreeNode q = root.right;
        //Run lowestCommonAncestor on the root, p and q
        TreeNode answer = test.lowestCommonAncestor(root, p, q);
        //Print out given value
        System.out.println(answer.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){ //If root is null, return null
            return null;
        }
        if((p.val < root.val) && (q.val < root.val)){ //if p and q are great than root
            return lowestCommonAncestor(root.left, p, q); //run recursively on the left with root.left as root
        }
        else if((p.val > root.val) && (q.val > root.val)){//if p and q are greater than root
            return lowestCommonAncestor(root.right, p, q);//run recursively on the right with root.right as root
        }
        return root; //return root
     }
}
