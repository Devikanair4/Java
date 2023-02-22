public class EvenPositionElements { //initializing class
    
    public static void main(String[] args) { //main class
        
        int originalArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //creating an array
        
        for (int i = 0; i < originalArray.length; i++) {  //traversing through the array
            if (i % 2 == 0) {                          //even position
                System.out.println(originalArray[i]); //printing the numbers in the even position
            }
        }
    }
    
}
