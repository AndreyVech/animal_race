import java.util.Scanner;

public class Dog extends Animals{
    private String voice = "ZA STALINA!!";
    public Dog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как зовут собаку?  ");
        String nameDog = scanner.next();
        System.out.print("Какая скорость у "+ nameDog +" (м/с)?  ");
        int speedDog = scanner.nextInt();
        super.addAnimal (nameDog, speedDog, voice);
    }
}