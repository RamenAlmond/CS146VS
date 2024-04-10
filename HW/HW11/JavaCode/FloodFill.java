package HW.HW11.JavaCode;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill{
    public static void main(String[] args) {
        FloodFill solution = new FloodFill();
        int[][] image = {{0,0,0},
                         {0,0,0},
                         };

        // Print Before
        System.out.println("Before:");
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sr = 0;
        int sc = 0;
        int color = 0;

        int[][] result = solution.floodFill(image, sr, sc, color);

        // Print the result
        System.out.println("After");
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{sr, sc});
            image[sr][sc] = color;

            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                for (int[] dir : directions) {
                    int nr = current[0] + dir[0];
                    int nc = current[1] + dir[1];
                    if (nr >= 0 && nr < image.length && nc >= 0 && nc < image[0].length && image[nr][nc] == originalColor) {
                        image[nr][nc] = color;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }
        return image;
    }
}