

public class buy_sell_stocks {
    public static void stocks(int arr[]){

        int buy_price = Integer.MAX_VALUE ;
        int maxProfit = 0 ;
        for(int i  = 0 ; i < arr.length ; i ++){

            if(buy_price < arr[i]){
                int profit = arr[i] - buy_price ; // todays profit
                maxProfit = Math.max(maxProfit , profit) ;  // calculating max profit 
            }
            else{
                buy_price = arr[i] ; 
            }
        }
        System.out.println("The Max Profit You can gain is = " + maxProfit + " rs");
        System.err.println("The Least Price to buy stock is : " + buy_price + " rS");
    }

    // main function
    public static void main(String[] args) {
        
        int prices[] = {7, 1 , 5, 3 , 6 ,4} ;
        stocks(prices);
    }
}
