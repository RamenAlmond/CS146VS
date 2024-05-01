class Anagram:
    def isAnagram(self, t: str, s: str):
        T = []
        S = []
        ts = t.lower()
        ss = s.lower()
        length = len(t)
        if len(t) != len(s):
            return False
        for x in range(0,length):
            temp1 = ts[x]
            T.append(temp1)
        for x in range(0,length):
            temp2 = ss[x]
            S.append(temp2)
        T.sort();
        S.sort();
        for x in range(0, length):
            temp1 = T[x]
            temp2 = S[x]
            if temp1 != temp2:
                return False
        return True
test = Anagram()
t = "God"
s = "god"
print(test.isAnagram(t,s))
