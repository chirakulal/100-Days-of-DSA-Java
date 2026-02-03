public class SquareOfASortedArray {

    public static int[] sortedArray(int[] nums){
        int n=nums.length;
        int[] result = new int[n];

        int left =0;
        int right =n-1;
        int pos =n-1;

        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[pos] = nums[left]*nums[left];
                left++;
            }else{
                result[pos] = nums[right]*nums[right];
                right--;
            }
            pos--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num ={-4,-1,0,3,10};
        int[] array = sortedArray(num);

        for(int arr : array){
            System.out.println(arr+" ");
        }
    }
}
