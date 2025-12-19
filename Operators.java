public class Operators {
  public static void main(String[]args) {
    //Arithmatic Operators 
    int x = 10;
    int y = 5;
    System.out.println(x + y); //Addition operator
    System.out.println(x - y); //Substraction operator
    System.out.println(x * y); //Multiplication Operator
    System.out.println(x / y); // Division operator
    System.out.println(x % y); // Modulo operator

    int z = 8;
    ++z;  // increament operator 
    System.out.println(z);
    --z;  // decreament operator
    System.out.println(z);

    //Assignment operators
    int number = 4; // assigning value to variable using '=' operator
    number += 4; // number = number + 4
    number -= 2;
    number *= 5;
    number /= 2;
    number ^= 6;

    // Comparison Operators

    int a = 9;
    int b = 8;
    System.out.println(a > b); 
    System.out.println(a >= b);
    System.out.println(a < b); 
    System.out.println(a <= b); 
    System.out.println(a == b); 
    System.out.println(a != b); 

    //Logical Operators
    int num = 6;
     System.out.println(num1 > 5 && num < 7 ); // return 'True' when both condition are true else return 'False'
     System.out.println(num > 5 || num < 10); // return 'false' when both condition are false else return 'True'
     System.out.println(!(num == 10));  // Reverse the result
    
  }
}
