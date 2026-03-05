public class AlternatingBinaryString {

        public static int minOperations(String s) {

            int count = 0;

            for(int i = 0; i < s.length(); i++){

                char expected = (i % 2 == 0) ? '0' : '1';

                if(s.charAt(i) != expected){
                    count++;
                }
            }

            return Math.min(count, s.length() - count);
        }

    public static void main(String[] args) {
        String s ="1010";
        System.out.println(minOperations(s));
    }
}
