# HW1 Markdown
## A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers. Given a string s, return true if it is a palindrome, or false otherwise.

```
isPalindrome returns boolean
Parameters are text
isPalindrome checks if the text is a palindrome

Method:
    initialize variable start for first index of text and last for last index of text
    while start <= last
        check if first or last index are not numbers or letters
        increment start or decrement last depending on which is true
        check if first and last index of text gives the same thing
        if true increment start and decrement last and continue
        if false return false
    return true


