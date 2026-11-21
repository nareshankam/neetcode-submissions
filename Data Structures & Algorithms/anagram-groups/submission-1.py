class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m = {}
        for s in strs:
            t = [0]*26
            for c in s:
                t[ord(c)-ord('a')] += 1
            t = tuple(t)
            if t in m:
                m[t].append(s)
            else:
                m[t] = [s]
        res = []
        for v in m.values():
            res.append(v)
        return res
