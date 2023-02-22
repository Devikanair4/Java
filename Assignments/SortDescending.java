import java.util.Arrays; //importing for sorting
import java.util.Collections;

public class SortDescending {
    
    public static void main(String[] args) {
        
        Integer[] originalArray = {5, 2, 9, 3, 6, 1, 8, 4, 7}; //defining array
        
        Arrays.sort(originalArray, Collections.reverseOrder()); //sorting array in descending order
        
        System.out.println(Arrays.toString(originalArray)); //printing the sorted array
        
    }
    
}
