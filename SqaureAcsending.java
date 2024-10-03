import java.util.Arrays;

public class SqaureAcsending{
  public static void main(String...args){
            int [] numbers = {2, 1, 4, 3, 5, 9, 7, 6, 8};
            int [] sortnum = getSquared(numbers);
            getsorted(sortnum);
           System.out.println(Arrays.toString(sortnum));
}


public static int[] getSquared(int [] integers){
      int [] square = new int[integers.length];
    for( int run = 0; run < integers.length; run++){
          square[run] = integers[run] * integers[run];
 
         }
         return square;
           

   

}



public static void getsorted(int [] number){

	int length = number.length;

	for(int race = 0; race < length; race++){
		
	  for(int pick = 1; pick < length; pick++){

 	      if(number[pick - 1] > number[pick]){

	        int newsort =  number[pick - 1];

		number[pick - 1] = number[pick];

		number[pick] = newsort;



                     }

              }
  
        }
    
    }
    
}