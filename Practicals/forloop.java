import java.util.Scanner;

public class forloop {
    public void calcTable(int number) {
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table: ");
        int number = sc.nextInt();
        forloop fl = new forloop();
        fl.calcTable(number);
    }
}