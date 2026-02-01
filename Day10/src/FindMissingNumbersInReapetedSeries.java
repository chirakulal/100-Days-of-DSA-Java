import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbersInReapetedSeries {


    static List<Integer> FindDisplacedNumber(int[] nums){

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }

        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;



    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,7,8,2,3};
        List<Integer> list = FindDisplacedNumber(arr);

        for(Integer lists:list){
            System.out.print(lists+ " ");
        }
    }
}
