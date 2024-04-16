# Lab6 Markdown
## Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
We will be solving another problem on graphs together! Here's the problem statement:

There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

Return true if you can finish all courses. Otherwise, return false.

Contraints:

* 1 <= numCourses <= 2000
* 0 <= prerequisites.length <= 5000
* prerequisites[i].length == 2
* 0 <= ai, bi < numCourses
* All the pairs prerequisites[i] are unique.

```
canFinish returns boolean
Parameters are numCourses and Prerequisites
canFinish creates an adjacency list and checks if there are any cycles using Kahn's algorithm. It returns true when a cycle is found.

Method:
Creates an adjacency list with size of numCourses, (adjacents)
a list to store indegrees with size of numCourses, (indegree)
and an empty temporary arraylist to store courses taken (temp)

Then it constructs the list by initializing a course everytime a course is introduced. We then use kahn's algorithm.
First we create a queue. If the course has no prerequisites it automatically adds that into the queue.

While the queue isn't empty
    We add the courses already in the queue into temp and then we check the courses that are adjacent to it throught the adjacency list
    if(courses next to current is not null)
        for each course next to current 
        decrement the courses next to current
            if(indegrees of courses next to are equal to 0)
                offer courses next to to queue
returns temp == numCourses 

