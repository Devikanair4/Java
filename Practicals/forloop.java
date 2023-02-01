import java.util.Scanner;

public class Forloop {
    public void calcTable(int number) {
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table: ");
        int number = sc.nextInt();
        Forloop fl = new Forloop();
        fl.calcTable(number);
    }
}