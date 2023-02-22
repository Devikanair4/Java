public class EvenPositionElements {
    
    public static void main(String[] args) {
        
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i = 0; i < originalArray.length; i++) {
            if (i % 2 == 0) {
                System.out.println(originalArray[i]);
            }
        }
        
    }
    
}
