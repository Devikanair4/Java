public class OddPositionElements { //initializing class 
    
    public static void main(String[] args) {
        
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //defining array
        
        for (int i = 0; i < originalArray.length; i++) {
            if (i % 2 != 0) { //for odd positions
                System.out.println(originalArray[i]); //printing numbers in the odd position            }
        }
        
    }
    
}
