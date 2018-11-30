import java.util.Arrays;

/**
 * A simple driver class that implements and tests bubble sort for ints
 *
 * @author (Argenis Lamadrid)
 * @version (1.0)
 */
public class Driver{
    public static void main(String[] args){
        Driver Test = new Driver();
    }
   
    
    public Driver(){
        int [] testArr = new int[] {1,5,6,9,5,1,1,5,84,6,1,5,8,2,6,1,7,9,9,9,9,8,7,75,3,5,4,};
        System.out.println(Arrays.toString(BubbleSort(testArr)));
    }
    
    
    /*
     * Time complexity = O(n) best, O(n^2) average, O(n^2) worst.
     * Space complexity, O(1) worst.
     */
    public static int[] BubbleSort(int arr[]){
        int temp;
 
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    // If arr[j] is bigger than [j+1], switch the numbers.
                    // To reverse order of list, swap comparison
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
