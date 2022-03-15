import java.util.Scanner;
//классы животных однотипны и создаются ctrl+c - ctrl+v
public class Cat extends Animals{
    private String voice = "Meeeooww";
    public Cat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как зовут кота?  ");
        String nameCat = scanner.next();
        System.out.print("Какая скорость у "+ nameCat +" (м/с)?  ");
        int speedCat = scanner.nextInt();
        //задали вопросы, всё узнали. Отправим в класс создания персонажа.
        super.addAnimal (nameCat, speedCat, voice);
    }
}

