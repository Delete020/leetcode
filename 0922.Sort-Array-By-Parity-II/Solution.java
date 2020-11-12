public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int even = 0;
        int odd = 1;

        while (even < A.length && odd < A.length) {
            swap(A, even, odd);
            while (even < A.length && A[even] % 2 == 0) {
                even += 2;
            }
            while (odd < A.length && A[odd] % 2 != 0) {
                odd += 2;
            }
        }

        return A;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}