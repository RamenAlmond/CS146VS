# Lab5 Markdown
## Given the root of a binary tree, determine if it is a valid binary search tree (BST).


```
isValidBST returns boolean
Paramters are root
LCA recursively traverses through the binary tree and checks if BST is valid

Method:
    Base Case: If root is null, return true
    if left child isn't null check if value of left child is greater than value of root
        return false if so
    if right child isn't null check if value of right child is less than value of root
        return false if so
    Recursively call isValidBST on left child
    Recursively call isValidBST on right child
    return true