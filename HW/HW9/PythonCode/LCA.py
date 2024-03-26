import TreeNode
tree = TreeNode

class LCA:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root is None or p is None or q is None:
            return None
        if p.val < root.val and q.val < root.val:
            return self.lowestCommonAncestor(root.left, p, q)
        elif p.val > root.val and q.val > root.val:
            return self.lowestCommonAncestor(root.right, p, q)
        return root

lca = LCA()
root = tree.TreeNode(4)
root.left = tree.TreeNode(3)
root.left.left = tree.TreeNode(1)
root.right = tree.TreeNode(8)
root.right.left = tree.TreeNode(5)
root.right.right = tree.TreeNode(9)
p = root
q = root.right
test = lca.lowestCommonAncestor(root, p, q)
print(test.val)