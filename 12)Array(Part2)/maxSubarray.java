// brute force simplest but time complexity is O(n^3) which is very bad
public class maxSubarray {
    public static int maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        System.out.println("Max Sum of Sub Array: " + maxSubarraySum(arr)); 
    }
}
