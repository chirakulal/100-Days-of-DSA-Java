public class RemoveDuplicate {

    static int removeDuplicate(int[] num){
        int n= num.length;
        if(n<=1){
            return n;
        }

        int idx =1;
        for(int i=1;i<n;i++){
           if(num[i]!=num[i-1]){
               num[idx++]=num[i];
           }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
       int size=  removeDuplicate(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
