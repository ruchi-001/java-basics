public class DataTypes {
  public static void main(String[]args) {
    //Numbers
    int myNum = 6; //Integer data type can store whole numbers from -2147483648 to 2147483647.
    System.out.println(myNum);

    byte myNum = 100;  // byte data type can store whole numbers from -128 to 127.
    System.out.println(myNum);

    short myNum = 5000;  //short data type can store whole numbers from -32768 to 32767
    System.out.println(myNum);

    long myNum = 15000000000L;  //long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 
    System.out.println(myNum);

    // Floating Data Types(numbers with decimal)
    float myNum = 5.75f;  //float and double data types can store fractional numbers.you should end the value with an "f" for floats a 
    float f1 = 42e2;
    System.out.println(myNum);
    System.out.println(f1);

    double myNum = 19.99d;  //Double
    double d1 = 19e3; // 'e' to indicate power of 10
    System.out.println(myNum);
    System.out.println(d1);


  // Character Data Types
    char myGrade = 'B';
    System.out.println(myGrade);
    char myVar1 = 65, myVar2 = 66;
    System.out.println(myVar1);
    System.out.println(myVar2);

    // Strings
    String greeting = "Hello World";
    System.out.println(greeting);

    // Boolean Data Types (return True and False)
    int x = 10;
    int y = 9;
    int z = 8;
    System.out.println(x > y ); // true
    System.out.println(y < z);  // false
    
  
