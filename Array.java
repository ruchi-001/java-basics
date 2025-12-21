public class Array {
  public static void main(String args[]) {
     //To declare an array, define the variable type with square brackets [ ]

     int[] number = {10, 20, 30, 40, 50};
     System.out.println(number);
    

      //To access the element
    System.out.println(number[2]); // 30 at index 2 

    // change element
    number[1] = 15;
    System.out.println(number);
    System.out.println(number[1]);

    // find lenght of array
    System.out.println(number.length); //5

    // Loop through an Array
    for( int i=0; i < numbers.length; i++) {
      System.out.println(number[i]);
    }


    //Calculate the som of array
    int[] arr = {1, 2, 3, 4, 5};
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("Sum is :" + sum);


    // Multi-dimentional Array
    int[][] matrix = { {1,2,3,4},
                      {5,6,7},
                      {8,9,10} };
    //Aceessing element
    System.out.println("Element at[0][1]:" + matrix[0][1]);
    
    //Traversing a 2D array using nested loops
    for(int i = 0; i < matrix.length; i++) {        //outer loop ( rows )
      for(int j= 0; j < matrix.length; j++) {      //Inner loop ( coluumn )
        System.out.println(matrix[i][j] + " ");
      }
      System.out.println(); //next line 
    }
    


    
  }
}
