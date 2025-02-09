class Zoo {
    String name;
    String[] enclosures;

    public Zoo(String name, String[] enclosures) {
        this.name = name;
        this.enclosures = enclosures;
    }

    public void display() {
        System.out.println("Zoo Name: " + name);
        for (String enclosure : enclosures) {
            System.out.println("Enclosure: " + enclosure);
        }
    }

    class Enclosure {
        String name;
        String type;
        String[] animals;

        public Enclosure(String name, String type, String[] animals) {
            this.name = name;
            this.type = type;
            this.animals = animals;
        }

        public void displayEnclosure() {
            System.out.println("Enclosure Name: " + name + ", Type: " + type);
            for (String animal : animals) {
                System.out.println("Animal: " + animal);
            }
        }
    }

    static class ZooInfo {
        String address;
        String phone;

        public ZooInfo(String address, String phone) {
            this.address = address;
            this.phone = phone;
        }

        public void displayInfo() {
            System.out.println("Zoo Address: " + address + ", Phone: " + phone);
        }
    }
}

public class ZooDemo {
    public static void main(String[] args) {
        String[] enclosures = {"Ava1", "Area2", "Area3"};
        String[] animals = {"Zebra", "Giraffe"};

        Zoo zoo = new Zoo("TVM Zoo", enclosures);
        Zoo.Enclosure enclosure = zoo.new Enclosure("Grassland", "Outdoor", animals);
        Zoo.ZooInfo info = new Zoo.ZooInfo("ABC", "920786550");

        zoo.display();
        enclosure.displayEnclosure();
        info.displayInfo();
    }
}
