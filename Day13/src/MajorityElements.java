public class MajorityElements {

    static int majorityElements(int[] num){
        int candidate = num[0];
        int count =1;

        for(int i=1;i<num.length;i++){
            if(num[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate =num[i];
                count=1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,1,1,2,2};
        System.out.println(majorityElements(arr));
    }
}
