import java.util.Scanner;

public class LabProgram {

   public static void sortArray(int[] myArr, int arrSize) {
      
    int n = arrSize;
    int temp = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++) {

            if (myArr[j - 1] < myArr[j]) {
                temp = myArr[j - 1];
                myArr[j - 1] = myArr[j];
                myArr[j] = temp;
            }

        }
    }
    
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int vals = 0;
      vals = scnr.nextInt();
      
      int array[] = new int[vals];
      
      for(int i = 0; i < array.length; i++) {
         array[i] = scnr.nextInt();
      }
      
      sortArray(array, array.length);
      
      for(int i = 0; i < array.length; i++)
      {
         System.out.print(array[i] + ",");
      }
      
      System.out.println();

   }
}
