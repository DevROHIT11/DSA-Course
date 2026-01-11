public class Continue{
    public static void main(String[] args){
       
        int i = 0;
        do { 
            i++ ;
            if(i == 5){
                continue;
            }
            System.out.println(i);
            
            
        } while(i<10);

        // for( int i = 0 ; i < 10 ; i++){
        //     if(i == 5){
        //         continue;
        //     }
        //     System.out.println(i);
            
        // }
    }
}