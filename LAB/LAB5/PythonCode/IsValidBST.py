import TreeNode
tree = TreeNode

class IsValidBST:
    def isValidBST(self, root):
        if root is None:
            return True
        if root.left is not None:
            if root.left.val > root.val:
                return False
        if root.right is not None:
            if root.right.val < root.val:
                return False
        self.isValidBST(root.left)
        self.isValidBST(root.right)
        return True
    
    def printTree(self, root):
        if root is None:
            return
        self.printTree(root.left)
        print(root.val, end=' ')
        self.printTree(root.right)

isValid = IsValidBST()
root = tree.TreeNode(4)
root.left = tree.TreeNode(3)
root.left.left = tree.TreeNode(1)
root.right = tree.TreeNode(8)
root.right.left = tree.TreeNode(5)
root.right.right = tree.TreeNode(9)

isValid.printTree(root)
print("Valid BST: " + str(isValid.isValidBST(root)))

root2 = tree.TreeNode(1)
root2.left = tree.TreeNode(2)
root2.left.left = tree.TreeNode(3)
root2.left.right = tree.TreeNode(4)
root2.right = tree.TreeNode(8)
root2.right.left = tree.TreeNode(5)
root2.right.right = tree.TreeNode(6)
isValid.printTree(root2);
print("Valid BST: " + str(isValid.isValidBST(root2)))