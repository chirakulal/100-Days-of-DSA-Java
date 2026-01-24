public class MaximumSubArray {

    public static int maxArray(int[] arr){
        int sum = arr[0];
        int maxsum = arr[0];
        for(int i=1;i<arr.length;i++) {

            maxsum = Math.max(maxsum + arr[i], arr[i]);

            sum = Math.max(sum, maxsum);
        }


        return sum;
    }

    public static void main(String[] args) {
        int[] arr ={ -2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxArray(arr));
    }
}
