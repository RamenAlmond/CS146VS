from collections import deque

class CourseCompletion:
    def canFinish(numCourses, prerequisites):
        adjacents = [[] for _ in range(numCourses)]
        indegree = [0] * numCourses
        temp = []

        for pair in prerequisites:
            course = pair[0]
            prerequisite = pair[1]
            adjacents[prerequisite].append(course)
            indegree[course] += 1

        queue = deque()
        for i in range(numCourses):
            if indegree[i] == 0:
                queue.append(i)

        while queue:
            current = queue.popleft()
            temp.append(current)
            for next_course in adjacents[current]:
                indegree[next_course] -= 1
                if indegree[next_course] == 0:
                    queue.append(next_course)

        return len(temp) == numCourses

sol = CourseCompletion
numCourses = 2
prereqs = [[0,1]]
test = sol.canFinish(numCourses,prereqs)
print("Can you finish the courses?:")
print(test)

