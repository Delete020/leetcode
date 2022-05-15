class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] res = new int[len + 1];

        int index = 0;
        int f = 0;
        int l = len;

        while (index < len) {
            if (s.charAt(index) == 'I') {
                res[index++] = f++;
            } else {
                res[index++] = l--;
            }
        }
        res[index] = l;

        return res;
    }
}