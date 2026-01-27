public class RotateArray {


    static void rotate(int[] num,int k){
        int n=num.length;

        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);
    }

    static void reverse(int[] num,int start, int end){
        while (start<end){
            int temp = num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotate(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
