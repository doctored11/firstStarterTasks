

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxes = scanner.nextInt();
        int j = 0;
        int k = 0;
        for (int i = 0; i < boxes; ++i) {
            if (j % 12 == 0) {
                System.out.println("Грузовик: " + (k + 1));
                k++;
            }
            if (i % 27 == 0) {
                System.out.println("\tКонтейнер: " + (j + 1));
                j++;
            }
            System.out.println("\t\tЯщик: " + (i + 1));
        }
        System.out.println(System.lineSeparator());
        System.out.println("Необходимо:");
        System.out.println(System.lineSeparator());
        System.out.println("грузовиков - "+ (k + 1) +"шт");
        System.out.println("контейнеров - "+ (j + 1) +"шт");


    }

}
