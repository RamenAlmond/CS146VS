# HW2 Markdown
## You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad. Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad. You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.



```
firstBadVersion returns int
Parameters are version
firstBadVersion returns when the first bad version of a product occurs

Method:
    initialize a variable for start to 0 and a variable end to version
    initialize a variable, firstbad, to keep track of the first bad version to -1
    while start is less than or equal to end
        mid = (start + end)/2
        if(isBadVersion(mid))
            firstbad = mid
            end = mid - 1
        else
            start = mid + 1
    return firstbad 