/* 
    Java Multi Dimensional Arrays are basically array of arrays. A multidimensional array is
    a nested array, an array-within-an-array.

    Example:
            int[][] intArray = new int[10][20]; //a 2D array or matrix
*/

class TwoDimensionalArray {
    public static void main(String args[]) {
    
        // declaring and initializing 2D array
        int arr[][] = {{2, 7, 9},
                       {3, 6, 1},
                       {7, 4, 2} };
        
        // printing 2D array
        for (int rows = 0; rows < arr.length ; rows++) {
            for (int cols = 0; cols < arr[rows].length ; cols++){

                System.out.print(arr[rows][cols] + " ");
            }

            System.out.println();// printing a new line
        }
    }
}