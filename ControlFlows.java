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
      break;
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
    



    
  }
}
