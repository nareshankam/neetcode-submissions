class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i<t.length(); i++) {
            if (tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }
        if (sMap.size() != tMap.size()) return false;
        for (Character key : sMap.keySet()) {
            if (!tMap.containsKey(key) || !sMap.get(key).equals(tMap.get(key))) {
                return false;
            } 
        }
        return true;
    }
}
