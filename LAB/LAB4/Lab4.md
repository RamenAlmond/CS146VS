# Lab4 Markdown
## Given the root of a binary tree, invert the tree, and return its root.


```
invertTree returns TreeNode
Paramters are root
LCA recursively traverses through the binary tree and swaps the left and right child

Method:
    Base Case: If root is null, return root
    Make a temp variable and swap the left and right variable
    Recursively call invertTree on left child
    Recursively call invertTree on right child
    return root 