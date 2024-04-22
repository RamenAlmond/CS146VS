class Palindrome:
    def isPalindrome(self, text):
        start = 0
        last = len(text) - 1
        while start <= last:
            currFirst = text[start]
            currLast = text[last]
            if not currFirst.isalnum():
                start += 1
            elif not currLast.isalnum():
                last -= 1
            else:
                if currFirst.lower() != currLast.lower():
                    return False
            start += 1
            last -= 1
        return True

test = Palindrome()
a = "Testtset"
b = "Test"
TestA = test.isPalindrome(a)
TestB = test.isPalindrome(b)
print(TestA)
print(TestB)