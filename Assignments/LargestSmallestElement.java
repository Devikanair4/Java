public class LargestSmallestElement { //class initialization
    
    public static void main(String[] args) { //main class
        
        int originalArray[] = {5, 2, 9, 3, 6, 1, 8, 4, 7}; //array formation
        
        int smallest = originalArray[0]; //initializing variable smallest
        int largest = originalArray[0];  //initializing variable largest
        
        for (int i = 1; i < originalArray.length; i++) { //traversing through the array
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
