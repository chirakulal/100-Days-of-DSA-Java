public class BinaryGap {

        public static int binaryGap(int n) {
            int lastPos = -1;
            int pos = 0;
            int maxGap = 0;

            while (n > 0) {
                if ((n & 1) == 1) {
                    if (lastPos != -1) {
                        maxGap = Math.max(maxGap, pos - lastPos);
                    }
                    lastPos = pos;
                }
                pos++;
                n >>= 1;
            }
            return maxGap;
        }


    public static void main(String[] args) {
        int n = 22;
        System.out.println(binaryGap(n));
    }

}
