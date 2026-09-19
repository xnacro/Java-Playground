
public class maxSubarrayKadanes {

    // i loop gives us start and j loop gives us end.
    public static int maxSubarrayKadanes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            cs += arr[i];

            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    public static void main(String[] args) {
       int arr[] = {2,4,6,8,10};
       System.out.println("Max Sum of Sub Array: "+maxSubarrayKadanes(arr)); 
    }
}