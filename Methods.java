public class Methods {
  
    //methods is a block of code which runs only when it is called.
    // method without return type (void) with return type (int , String, Boolean, etc).

  
    public static int addNumber(int a, int b) {  // addNumber takes two parameter | return int value
      retun a + b;
    }

  public static void printName( String name) {  // name is parameter
    System.out.println("My name is: " + name);
  }

  // with if...else
  public static void checkAge(int age){

    if(age < 18) {
      System.out.printn( "Access denied - you can't vote!");
    } else {
      System.out.printn( "Access granted - you can vote!");
    }
  }


  // method overloading | resolved at compile time
  
  static int plusMethod(int x, int y) {  
    return x + y;
  }
  
  static double plusMethod(double x, double y) {  // method overloading with different data type parameter.
    return x + y;
  }

  public static void main(String args[]) {

    int result = addNumber(5, 6);  //method called |  value is pass during method call.
    
    System.out.println(result);

    printName("Shiv"); // method print the given name.

    checkAge(22);

    System.out.println("int: " + plusMethod(4, 5));
    System.out.println("int: " + plusMethod(7, 8));

  }
}
