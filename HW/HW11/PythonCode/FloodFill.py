from collections import deque

class FloodFill:
    def floodFill(self, image, sr, sc, color):
        originalColor = image[sr][sc]
        
        if originalColor != color:
            queue = deque([(sr, sc)])
            image[sr][sc] = color

            directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
            while queue:
                r, c = queue.pop()
                
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < len(image) and 0 <= nc < len(image[0]) and image[nr][nc] == originalColor:
                        image[nr][nc] = color
                        queue.append((nr, nc))
        return image

solution = FloodFill()
image = [[0,1,0],
         [1,1,0],
         [0,0,0]]
print("Before: ")
for row in image:
    print(row)
print("\n")
sr = 0
sc = 0
color = 2
result = solution.floodFill(image, sr, sc, color)
print("After: ")
for row in result:
    print(row)