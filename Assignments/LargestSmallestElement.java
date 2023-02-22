public class LargestSmallestElement {
    
    public static void main(String[] args) {
        
        int[] originalArray = {5, 2, 9, 3, 6, 1, 8, 4, 7};
        
        int smallest = originalArray[0];
        int largest = originalArray[0];
        
        for (int i = 1; i < originalArray.length; i++) {
            if (originalArray[i] < smallest) {
                smallest = originalArray[i];
            }
            if (originalArray[i] > largest) {
                largest = originalArray[i];
            }
        }
        
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
        
    }
    
}
