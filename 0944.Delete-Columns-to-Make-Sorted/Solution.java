class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        int length = strs[0].length();

        for (int i  = 0; i < length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j - 1].charAt(i) > strs[j].charAt(i)) {
                    res += 1;
                    break;
                }
            }
        }

        return res;
    }
}