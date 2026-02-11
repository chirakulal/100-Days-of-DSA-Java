public class ValidAnagaram {

    public static boolean validate(String s,String t){
        if(s.length()!=t.length()) return false;

        int[] count = new int[26];

        for( int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int c: count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="listen";
        String t ="silen";

        System.out.println(validate(s,t));  //false
    }
}
