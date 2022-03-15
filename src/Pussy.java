import java.util.Scanner;

public class Pussy extends Animals{
    private String voice = "FOR MY PUSSY!!!";
    public Pussy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как зовут это?  ");
        String namePussy = scanner.next();
        System.out.print("Какая скорость у "+ namePussy +" (м/с)?  ");
        int speedPussy = scanner.nextInt();
        super.addAnimal (namePussy, speedPussy, voice);
    }
}
