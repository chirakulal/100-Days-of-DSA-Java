public class PrimeNumOfSetBits {

    public static int countPrimeSetBits(int left, int right) {
        int count =0;

        for(int n=left; n<=right;n++){
            int setBits = Integer.bitCount(n);

            if(isPrime(setBits)){
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num){
        if(num<2) return false;

        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 110;
        int right =115;

        System.out.println(countPrimeSetBits(left,right));
    }
}
