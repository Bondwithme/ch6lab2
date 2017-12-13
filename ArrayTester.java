
/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTester
{
    public static void main(String[] args) {
        int[][] arr1 = {{1, 1, 1,},
                          {1, 1, 1}
                        };
        int[][] arr2 = {{1, 1, 1,},
                          {1, 1, 1}
                        };
        
        ArrayCalculation ac = new ArrayCalculation();
        double avg = ac.averageArray(arr1);
        System.out.println("Average is " + avg);
        
        for(int thing : result) {
         System.out.print(thing + ",");   
        }
        
        int[][] squared = ac.squareArray(arr2);
        System.out.println();
        for(int[] row : squared) {
            for(int num : row) {
                System.out.print(num + "' ");
            }
            System.out.println();
        }
    }
}
