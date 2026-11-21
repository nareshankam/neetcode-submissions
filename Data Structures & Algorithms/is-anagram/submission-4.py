class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        smap = {}
        tmap = {}
        for c in s:
            if c in smap:
                smap[c] = smap[c] + 1
            else:
                smap[c] = 1
        for c in t:
            if c in tmap:
                tmap[c] = tmap[c] + 1
            else:
                tmap[c] = 1
        for c in s:
            if c not in tmap or smap[c] != tmap[c]:
                return False
        return True