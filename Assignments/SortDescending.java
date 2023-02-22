import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    
    public static void main(String[] args) {
        
        Integer[] originalArray = {5, 2, 9, 3, 6, 1, 8, 4, 7};
        
        Arrays.sort(originalArray, Collections.reverseOrder());
        
        System.out.println(Arrays.toString(originalArray));
        
    }
    
}