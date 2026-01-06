class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;
        int xr = 0;
        
        for (int i = 0; i < k; i++) xr ^= arr[i];
        
        int max = xr;
        
        for (int i = k; i < n; i++) {
            xr ^= arr[i - k];
            xr ^= arr[i];
            if (xr > max) max = xr;
        }
        
        return max;
    }
}
