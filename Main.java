public class Main {

   public static void main(String []args) {
      
      //WHILE loops repeat instructions in the long body
      // as long as certain CONDITION is TRUE

      // COUNTER-CONTROLLED while loop
      // STEP #1: Initialize control varible 
      int count = 2; 
      // STEP #2: Test a condition
      while (count <= 10){
         // Loop body executes while (count <= 5) is TRUE
         System.out.println(count);

         //STEP #3: Change the varibles
         // (do this after the statment you want to repeat)
         count ++;
      }

      //FOR LOOPS: when you know HOW MANY TIMES to iterate
      // for (initislize; test condition; change)
      for (int i = 5; i <= 27; i++){
         System.out.println(i);
      }
      // Modify the CHANGE step to skip certain number
      for (int i = 0; i<= 10; i+=2){
         System.out.println(i);
      }
      //Watch your INITIAL values and your OPERATOR
      for (int i=0; i < 11; i += 2){
         System.out.println(i);
      }// this loop did the SAME THING as the one above

      for (int i = 10; i > 0; i--){
         System.out.println(i);
         // Print a special message when i is 1
         if (i == 1){
            System.out.println("Blast off!!");
         }
      }



   } // END: Main method
} // END: Class
