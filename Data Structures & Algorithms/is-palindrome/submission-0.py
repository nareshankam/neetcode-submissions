class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = ""
        for c in s:
            if 'A' <= c <= 'Z':
                st += c.lower()
            elif 'a' <= c <= 'z' or '0' <= c <= '9':
                st += c

        i = 0
        j = len(st) - 1
        while i <= j:
            if st[i] != st[j]:
                return False
            i += 1
            j -= 1
        return True
