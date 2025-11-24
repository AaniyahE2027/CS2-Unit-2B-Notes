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

      //LOOP & STRINGS
      // Use a loop to iterate through each character
      //in a String object (TRAVERSAL)

      // Use a FOR loop to "visit every char"
      String name = "aaniyah";
      int finalIndex = name.length() - 1;
      System.out.println("Final index: " + finalIndex);

      // Build a reverse String using loop
      String reversed = "";
      for (int i = finalIndex; i >= 0; i--){
         System.out.println("Current Index: " + i);
         String currentLetter = name.substring(i, i+1);
         System.out.println("Current Letter: " + currentLetter);
         reversed += currentLetter; // add char to reversed name
      }
      System.out.println("Your name backwards: " + reversed);

      // WHILE loops can handle tasks other than when you know
      // how many times to iterate
      // EX) Find & replace characters until all are replaced



   } // END: Main method
} // END: Class
