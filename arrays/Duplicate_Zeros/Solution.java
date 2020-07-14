class Solution {
    int[] shiftRight(int[] a, int pos) {
         for (int i = a.length - 2; i >= pos; i--) {
            a[i + 1] = a[i]; 
         } return a;
    }
    
    public void duplicateZeros(int[] arr) {
        if(arr.length >= 1 && arr.length <= 10000){
            for(int i = 0; i < arr.length-1; i++) {
                if(arr[i] >= 0 && arr[i] <= 9){
                    if(arr[i] == 0){
                        arr = shiftRight(arr, ++i);
                        arr[i] = 0;
                        }
                    }
                }
            }
        }
}
