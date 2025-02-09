import java.util.Scanner;

class CPU {
    int price;

    public CPU() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price: ");
        price = sc.nextInt();
    }

    class Processor {
        int cores;
        String manufacturer;

        public Processor() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter No. of Cores: ");
            cores = sc.nextInt();
            System.out.print("Enter the Manufacturer: ");
            manufacturer = sc.next();
        }

        public void showProcessor() {
            System.out.println("Cores = " + cores + "\nManufacturer = " + manufacturer + "\nPrice = " + price);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        public RAM() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Memory Size: ");
            memory = sc.nextInt();
            System.out.print("Enter the Ram Manufacturer: ");
            manufacturer = sc.next();
        }

        public void showRAM() {
            System.out.println("Memory = " + memory + "\nRam Manufacturer = " + manufacturer);
        }
    }
}

public class CPUDemo {
    public static void main(String[] args) {
        CPU c = new CPU();
        CPU.Processor p = c.new Processor();
        CPU.RAM r = new CPU.RAM();

        p.showProcessor();
        r.showRAM();
    }
}
