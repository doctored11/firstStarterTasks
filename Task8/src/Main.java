public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("производитель", "ПК");
        comp.setMemory(1024, "memory", 320);
        comp.setRAM(5000, "DDR4", 110);
        comp.setProcessor(1000, 4, "maker", 65);
        comp.setScreen(15.6, "IPS", 2800);
        comp.setKeyboard(true, "butch", 480);

        Computer comp2 = new Computer("производитель крутой", "крутой ПК");
        comp2.setMemory(512, "memory", 120);
        comp2.setRAM(5000, "DDR5", 100);
        comp2.setProcessor(4800, 8, "new maker", 90);
        comp2.setScreen(24, "TN", 3120);
        comp2.setKeyboard(true, "butch", 470);

        System.out.println(comp.toString());
        System.out.println(comp2.toString());

    }
}