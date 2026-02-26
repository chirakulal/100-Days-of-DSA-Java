public class KokoEatingBanana {


    public static int minEatingSpeed(int[] piles,int h){
        int left =1;
        int right =0;

        for(int pile:piles){
            right = Math.max(right,pile);
        }
        int answer = right;

        while(left <=right){
            int mid = left+(right-left)/2;

            long hours =0;

            for(int pile:piles){
                hours += (pile+mid-1)/mid;
            }

            if(hours <=h){
                answer=mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] piles ={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
