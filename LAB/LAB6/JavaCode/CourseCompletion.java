package LAB.LAB6.JavaCode;

import java.util.*;

public class CourseCompletion {

    public static void main(String[] args) {
        CourseCompletion test = new CourseCompletion();
        int numCourses = 3;
        int[][] prerequisites = {{1,0}};
        System.out.print("Prerequisites: ");
        for (int[] row : prerequisites) {
            System.out.print("{" + row[0] + "," + row[1] + "} ");
        }
        System.out.println();
        System.out.println("Can you finish the courses?:\n" + test.canFinish(numCourses, prerequisites));
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adjacents = new List[numCourses];
        int[] indegree = new int[numCourses];
        List<Integer> temp = new ArrayList<>();

        for (int[] coursePair : prerequisites) {
            int course = coursePair[0];
            int prereq = coursePair[1];
            if (adjacents[prereq] == null) {
                adjacents[prereq] = new ArrayList<>();
            }
            adjacents[prereq].add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            temp.add(current);
            if (adjacents[current] != null) {
                for (int next : adjacents[current]) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
        }
        return temp.size() == numCourses;
    }
}
