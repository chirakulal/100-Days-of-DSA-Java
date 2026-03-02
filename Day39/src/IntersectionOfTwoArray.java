import java.util.HashSet;

public class IntersectionOfTwoArray {


        public static int[] intersection(int[] nums1, int[] nums2) {

            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> resultSet = new HashSet<>();

            for (int num : nums1) {
                set1.add(num);
            }

            for (int num : nums2) {
                if (set1.contains(num)) {
                    resultSet.add(num);
                }
            }

            int[] result = new int[resultSet.size()];
            int index = 0;

            for (int num : resultSet) {
                result[index++] = num;
            }

            return result;
        }

    public static void main(String[] args) {
        int[] num = {1,2,4,3,5,3};
        int[] num1 = {2,4,5,6};

       int[] arr = intersection(num,num1);
       for(int ar: arr)
        System.out.println(ar);
    }
    }

