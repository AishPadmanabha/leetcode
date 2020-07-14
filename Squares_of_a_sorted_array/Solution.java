import java.util.Arrays;

class Solution {
    
    public int[] sortedSquares(int[] A) {
        if(A.length >= 1 && A.length <= 10000) {
            for(int i = 0; i < A.length; i++) {
                if(A[i] <= 10000 && A[i] >= -10000) {
                    A[i] = Math.abs(A[i] * A[i]);
                }
            }
        } Arrays.sort(A);
        return A;
    }
}
