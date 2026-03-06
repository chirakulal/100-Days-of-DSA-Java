public class OneSegmentOfOnes {


        public static boolean checkOnesSegment(String s) {

            boolean zeroFound = false;

            for (char c : s.toCharArray()) {

                if (c == '0') {
                    zeroFound = true;
                }

                if (c == '1' && zeroFound) {
                    return false;
                }
            }

            return true;
        }

    public static void main(String[] args) {
        String s = "101";
        System.out.println(checkOnesSegment(s));
    }
    }


