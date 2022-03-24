import java.util.Scanner;

public class utilInput {
    Scanner scanner = new Scanner(System.in);
    public static String inputName(String person) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как назовем " + person + " ? " );
        String nameAnimal = scanner.next();
        return nameAnimal;
    }
    public static int inputSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("какая скорость в м/с? ");
        int speedAnimal;
        if(scanner.hasNextInt()){
            speedAnimal = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            speedAnimal = inputSpeed();
        }
        return speedAnimal;
    }
}
