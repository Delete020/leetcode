class Solution {
    public int add(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;

        return carry != 0 ? add(sum, carry) : sum;
    }
}