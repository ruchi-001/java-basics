class Variables {
  public static void main(String[]args) {
    int number = 14;       
    System.out.println(number);
    
    //one value to multiple variables
    int x, y, z;
    x = y = z = 50;
    System.out.println(x + y + z); 
    
    //String Variable (stores text, written inside double quotes)
    String name = "John";
    System.out.println(name);
    // Concatenation of Strings
    String firstName = "Alexander";
    String lastName = "Wang"
    String fullName = firstName + " " + lastName;    
    System.out.println(fullName);
    // with Number
    int age = 28;
    System.out.println("My name is" + firstName + "and I am " + age + " years old!");
    //Assign new value to same variable 
    int myNum = 9;
    myNum = 12;  // myNum is now 12
    System.out.println(myNum);

    // Final(keyword) variables
    final int fixedValue = 10;
    //fixedValue = 8; //will generate an error: cannot assign a new value to a final variables.
    System.out.println(fixedValue);
    
  }
  
}
