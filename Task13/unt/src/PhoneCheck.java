
import java.util.Scanner;

public class PhoneCheck {
// старт ( вход)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            String regexNum = "[^0-9]";
            String regexCheck = "[7-8]?[0-9]{10}";


            String phone = input.replaceAll(regexNum, "");
            if ( phone.matches(regexCheck)) {
                if(phone.toCharArray()[0]=='7'||phone.toCharArray()[0]=='8'){
                    System.out.println(phone);
                    return;
                }
                System.out.println( "7"+phone);
                return;
            }
            System.out.println( "Неверный формат номера");

        }
    }

}
