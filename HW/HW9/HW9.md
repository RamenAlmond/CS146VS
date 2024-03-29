# HW9 Markdown
## Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

Constraints:

* The number of nodes in the tree is in the range [2, 105].
* -109 <= Node.val <= 109
* all values are unique.
* p != q
* p and q will exist in the BST.

```
lowestCommonAncestor returns TreeNode
Parameters are root, p, and q
LCA recursively traverses through the binary tree until the current node are within the values of p and q

Method:
    Base Case: If root is null, return null
    If current node is greater than p and q, traverse to the left child recursively with lowestCommonAncestor
    If current node is less than p and q, traverse to the right child recursively with lowestCommonAncestor
    return root (Method should still function if p or q is the LCA)

