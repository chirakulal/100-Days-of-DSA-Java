public class ValidatePalindrome {

    public static boolean isPalindrome(String s){
        String word = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left =0;
        int right = word.length()-1;

        while(left<right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;

    }


    public static void main(String[] args) {
        String s  = "madaam";

        System.out.println(isPalindrome(s));


    }
}
