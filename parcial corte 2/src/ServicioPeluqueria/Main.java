package ServicioPeluqueria;

public class Main {
    public static void main(String[] args) {
        for (Hairsalon hs : Hairsalon.values()) {
            System.out.println("Name: " + hs.getName());
            System.out.println("Description: " + hs.getDescription());
            System.out.println("Price: " + hs.getPrice());
            System.out.println("Service Description: " + hs.showServiceDescription());
        }
    }
}

