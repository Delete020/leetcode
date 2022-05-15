public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int i = 0;
        while ((xor & 1) == 0) {
            xor = xor >> 1;
            i++;
        }
        int n1 = 0;
        int n2 = 0;

        for (int num : nums) {
            if (((num >> i) & 1) == 1) {
                n1 ^= num;
            } else {
                n2 ^= num;
            }
        }

        return new int[]{n1, n2};
    }
}
