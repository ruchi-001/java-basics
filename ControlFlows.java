public class ConntrolFlows {
  public static void main(String[]args){
    //if Statement
    if (20 > 18) { // block of code to be executed when if condition is 'True'
       System.out.println("20 is greater than 18");
    }

    //if-else
    int x = 5; 
    int y = 4;
    if( x > y){
       System.out.println("x is greater than y");
      
    }else{   //block of code to be executed when if condition is 'False'
      
      System.out.println("y is greater than x");
      
    }
    //else-if
    int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

    if (weather == 1) {  //condition 1
       System.out.println("Bring an umbrella.");
    } else if (weather == 2) {  // when condition 1 false then condition2 executed
       System.out.println("Wear sunglasses.");
    } else {   // when both condition is false this block executed
       System.out.println("Just go outside normally.");
    }

   //Nested(statements inside statement)

    int age = 22;
    if( age >= 20){
      System.out.println("can vote!");
    }else if(age > 18 && age < 20){
      System.out.println("you can vote!");
    }else {
      System.out.println("you can't vote!");
    }

     //Switch Statement
     int day = 4;
     switch (day) {
      case 1:
       System.out.println("Monday");
       break;    // Break :used to immediately exit a loop or switch statement when a specific condition is met.
      case 2:
       System.out.println("Tuesday");
       break;
      case 3:
       System.out.println("Wednesday");
       break;
     case 4:
       System.out.println("Thursday");
       break;
     case 5:
      System.out.println("Friday");
      break;
     case 6:
      System.out.println("Saturday");
      break;
     case 7:
     System.out.println("Sunday");
      break;
   }
    //output is thursday


    //Loops
    //while loop ( block of executed when condition is true )
     int i = 0;
     while (i < 5) {
       System.out.println(i);
       i++;
     }

    //Do-while loop ( execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.)
    int a = 0;
    do {
      System.out.println(a);
      a++;
    }
     while(a < 5);

    //For loop
    for (int i = 0; i < 5; i++) {  //int i = 1; start the loop | i < 5 ; loop runs while this is true | i++ ; increase the value after each iteration.
       System.out.println(i);
    }


  // Nested loop (for table)
    for (int i = 1; i <= 3; i++) {            // 1 2 3    
      for (int j = 1; j <= 3; j++) {          // 2 4 6    |output
        System.out.print(i * j + " ");        // 3 6 9
      }
      System.out.println();
   }

    // Continue Statement ( used to skip the current iteration of a loop ans move to the next.

    for(int i = 1; i <= 5 ; i++) {
      if(i == 3) {
        continue;
      }
      System.out.println(i);
    }


    
  }
  
}
