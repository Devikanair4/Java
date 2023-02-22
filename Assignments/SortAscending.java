import java.util.Arrays; //imporing arrays for sorting

public class SortAscending {
    
    public static void main(String[] args) {
        
        int[] originalArray = {5, 2, 9, 3, 6, 1, 8, 4, 7}; //defining the array
        
        Arrays.sort(originalArray); //sorting into ascending order
        
        System.out.println(Arrays.toString(originalArray)); //printing sorted array
        
    }
    
}
