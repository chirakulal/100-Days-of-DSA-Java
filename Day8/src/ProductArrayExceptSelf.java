public class ProductArrayExceptSelf {

    static int[] productArray(int[] num){
        int n = num.length;
        int result[] = new int[n];

        result[0]=1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1]*num[i-1];

        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i]*suffix;
            suffix = suffix*num[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};

        int[] product = productArray(nums);

        for(int res:product){
            System.out.print(res+" ");
        }

    }
}
