from typing import Optional, List
from TreeNode import TreeNode


class LeveLOrder:   
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []

        if root is None:
            return result
        queue = []

        queue.append(root)

        while len(queue) > 0: 
            levelSize = len(queue)
            level = []
            for i in range(levelSize):
                node = queue.pop(0)
                level.append(node.val)
                if node.left is not None:
                    queue.append(node.left)
                if node.right is not None:
                    queue.append(node.right)
            result.append(level)
        return result;
        
solution = LeveLOrder()
root = TreeNode(4)
emptyRoot = None
root.left = TreeNode(3)
root.left.left = TreeNode(1)
root.right = TreeNode(8)
root.right.left = TreeNode(5)
root.right.right = TreeNode(9)
temp = solution.levelOrder(root)
print(temp)
tempEmpty = solution.levelOrder(emptyRoot)
print(tempEmpty) 

