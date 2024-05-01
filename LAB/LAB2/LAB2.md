# Lab2 Markdown
## Given two strings s and t, return true if t is an anagram of s, and false otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


```
isAnagram returns boolean
Paramters are string s and string t
isAnagram checks if two strings are an anagram of each other

Method:
    create an Arraylist of characters, T
    create an Arraylist of characters, S
    convert both s and t into lowercase
    if the length of s and t are not equal
        return false
    add all characters of t into T
    add all characters of s into S
    sort both T and S
    for all characters in T
        if T at index i is not equal to S at index i
            return false
    return true