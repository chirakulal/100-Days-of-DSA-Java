public class MoveZeroes {


    static void moveZeroes(int[] nums){
        int n = nums.length;
        int count =0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[count++] = nums[i];
            }

        }
        while(count<n){
            nums[count++] = 0;
        }

        for(int arr:nums){
            System.out.print(arr+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

    }
}
