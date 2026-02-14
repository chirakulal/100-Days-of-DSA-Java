public class LongestReplacemenLength {

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;

            if (windowSize - maxfreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;
    }

    public static void main(String[] args) {
        String s ="AABABBA";
        int k=1;

        System.out.println(characterReplacement(s,k));
    }
}
