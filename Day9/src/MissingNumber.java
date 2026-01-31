public class MissingNumber {

    public static int missingNumber(int[] num){
        int n = num.length;
        int expectedSum = (n*(n+1)/2);
        int actualSum =0;

        for(int i=0;i<n;i++){
            actualSum +=num[i];

        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};

        System.out.println(missingNumber(arr));
    }
}
