import java.util.Scanner;

public class Horse extends Animals{
    private String voice = "IGOGOGOGOGOOO!!!";
    public Horse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как зовут лошадь?  ");
        String nameHorse = scanner.next();
        System.out.print("Какая скорость у "+ nameHorse +" (м/с)?  ");
        int speedHorse = scanner.nextInt();
        super.addAnimal (nameHorse, speedHorse, voice);
    }
}