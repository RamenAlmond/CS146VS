import TreeNode
tree = TreeNode

class InverseTree:
    def invertTree(self, root):
        if root is None:
            return root
        temp = root.left
        root.left = root.right
        root.right = temp
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root
    
    def printTree(self, root):
        if root is None:
            return
        self.printTree(root.left)
        print(root.val, end=' ')
        self.printTree(root.right)


inverse = InverseTree()
root = tree.TreeNode(1)
root.left = tree.TreeNode(2)
root.left.left = tree.TreeNode(3)
root.left.right = tree.TreeNode(4)
root.right = tree.TreeNode(8)
root.right.left = tree.TreeNode(5)
root.right.right = tree.TreeNode(6)

inverse.printTree(root)
temp = inverse.invertTree(root)
print('\n')
inverse.printTree(temp)