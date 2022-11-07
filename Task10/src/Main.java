import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String AI = keyboard.nextLine();

        String[] parts = AI.split(" ");
        int i = Integer.parseInt(parts[1]);
        int A = Integer.parseInt(parts[0]);
        int i1 = i != 0 ? A & -(1 << i) : A;
        System.out.println(i1);
    }
}
