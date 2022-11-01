public class Computer {

    final String vendor;
    final String name;
    Memory memory;
    Processor processor;
    RAM ram;
    Screen screen;

    Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }


//   private l
//   private l
//   private l
//   private l
//   private l
//   private l

    public void setProcessor(int frequency, int coresNum, String vendor, int weight) {
        processor = new Processor(frequency, coresNum, vendor, weight);
    }

    public void setRAM(int volume, String type, int weight) {

        ram = new RAM(volume, type, weight);
    }

    public void setMemory(int volume, String type, int weight) {
        type = type.toUpperCase();
        if (type != "HDD" || type != "SSD") type = "HDD";
        memory = new Memory(volume, type, weight);
    }

    public void setScreen(double diagonal, String type, int weight) {
        type = type.toUpperCase();
        if(type !="TN" || type!="VA") type ="IPS";
        screen = new Screen(diagonal, type, weight);
    }

    public void setKeyboard(boolean illumination, String type, int weight) {
        keyboard = new Keyboard(illumination, type, weight);
    }

    //
    public String getProcessor() {
        return ("Процессор \n производитель: " + processor.vendor + "\n кол-во ядер: " + processor.coresNum + "\n частота: " + processor.frequency + "\n вес камня: " + processor.weight);

//
    }

    public String getRAM() {
        return ("RAM \n тип памяти: " + ram.type + "\n объем модуля: " + ram.volume + "\n вес плашки: " + ram.weight);

    }

    public String getMemory() {
        return ("Память \n тип памяти: " + memory.type + "\n объем памяти: " + memory.volume + "\n вес диска: " + memory.weight);
    }

    public String getScreen() {
        return ("Монитор \n тип матрицы: " + screen.type + "\n диагональ экрана: " + screen.diagonal + "\n вес монитора: " + screen.weight);

    }

    public String getKeyboard() {
        return ("Клавиатура \n тип клавиатуры: " + keyboard.type + "\n подсветка " + keyboard.illumination + "\n вес клавиатуры: " + keyboard.weight);


    }

    class Processor {

        private final int frequency;
        private final int coresNum;
        private final String vendor;
        private final int weight;

        public Processor(int frequency, int coresNum, String vendor, int weight) {
            this.frequency = frequency;
            this.coresNum = coresNum;
            this.vendor = vendor;
            this.weight = weight;
        }
    }

    class RAM {
        private final int volume;
        private final String type;
        private final int weight;

        public RAM(int volume, String type, int weight) {
            this.volume = volume;
            this.type = type;
            this.weight = weight;
        }
    }

    class Memory {
        private final int volume;
        private final String type;
        private final int weight;

        public Memory(int volume, String type, int weight) {
            this.volume = volume;
            this.type = type;
            this.weight = weight;
        }
    }

    class Screen {
        private final double diagonal;
        private final String type;
        private final int weight;

        public Screen(double diagonal, String type, int weight) {
            this.diagonal = diagonal;
            this.type = type;
            this.weight = weight;
        }
    }

    class Keyboard {
        private final boolean illumination;
        private final String type;
        private final int weight;

        public Keyboard(boolean illumination, String type, int weight) {
            this.illumination = illumination;
            this.type = type;
            this.weight = weight;
        }
    }


    //
    public String getMass() {
        return ("Масса компьютера: "+ (memory.weight + ram.weight + processor.weight+ keyboard.weight + screen.weight));
    }
    public String toString(){
        return (this.name +"\n" +this.vendor+"\n ======--property--======\n"+
                "\n"+ this.getProcessor() +"\n" +this.getMemory()+"\n"+ this.getRAM()+
                "\n"+this.getScreen()+"\n"+this.getKeyboard()+"\n"+ this.getMass())+"\n _____\n\n";
    }

}
