public class MaxConsecutiveOnes {


        public static int findMaxConsecutiveOnes(int[] nums) {

            int count = 0;
            int max = 0;

            for (int num : nums) {

                if (num == 1) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }

            return max;
        }

    public static void main(String[] args) {
        int[] num ={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(num));
    }
}
