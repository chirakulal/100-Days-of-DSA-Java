import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {

     static int maxProfit(int[] price) {

//         int n =price.length;
//         int res =0;
//         int profit =0;
//
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(price[i]<price[j]){
//                     profit = price[j]-price[i];
//                     if(profit>res){
//                         res = profit;
//                     }
//                 }
//
//             }
//         }
//         return res;


         //optimized solution
         //time complexity : O(n);
         //space complexity : O(1);
         int minPrice = Integer.MAX_VALUE;
         int max = 0;

         for( int i=0;i<price.length;i++){
             if(price[i]<minPrice){
                 minPrice = price[i]; //buy the stock if the price is less
             }else{
                 max = Math.max(max, price[i]-minPrice); // sell the stock
             }
         }
         return max;

    }
    public static void main(String[] args) {

           // int[] price ={7,6,4,3,1};
        int[] price ={7,1,5,3,6,4};
            System.out.print(maxProfit(price));
        }
    }

