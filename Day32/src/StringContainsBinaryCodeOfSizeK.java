import java.util.HashSet;

public class StringContainsBinaryCodeOfSizeK {


        public static boolean hasAllCodes(String s, int k) {

            int required = 1 << k;
            HashSet<String> set = new HashSet<>();

            for (int i = 0; i <= s.length() - k; i++) {
                String sub = s.substring(i, i + k);
                set.add(sub);

                if (set.size() == required) {
                    return true;
                }
            }

            return false;
        }

    public static void main(String[] args) {
        String s ="00111";
        int k=2;

        System.out.println(hasAllCodes(s,k));
    }
    }

