/*
    Jagged array in java is a 2D array such that member arrays can be of different sizes.
    Example:
            {{ 0, 1, 2}
             { 3, 4}
            }
*/
class JaggedArray {
    public static void main(String[] args) {
        
        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][];
        
        // First row has 3 columns (Look Example)
        arr[0] = new int[3];
        
        // Second row has 2 columns
        arr[1] = new int[2];
        
        // Initializing array
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = count++;
            }
        }

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array are: ");
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                
                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }
    }
}