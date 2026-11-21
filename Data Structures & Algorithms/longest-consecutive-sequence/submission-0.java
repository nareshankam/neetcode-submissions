class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        int l = 0;
        for (Integer num : set) {
            if (!set.contains(num-1)) {
                int i = 1;
                while(set.contains(num + i)) {
                    i++;
                }
                if (i > l) {
                    l = i;
                }
            }
        }
        return l;
    }
}
