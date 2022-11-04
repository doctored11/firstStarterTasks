public class Main {
    public static void main(String[] args) {
        String alf = "абвгдеёжзийклмнопрстуфхцчшщьъэюя";
        char[] array = (alf + alf.toUpperCase()).toCharArray();


        for (int i = 0, n = Character.MAX_VALUE; i < n; ++i) {
            char c = (char) i;


            for (int l = 0, m = array.length; l < m; ++l) {
                if (c == array[l]) {
                    System.out.println("" + i + "   " + c);
                }
            }
        }


    }
}