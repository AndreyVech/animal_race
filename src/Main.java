public class Main {
    public static void main(String[] args) {
        //первого персонажа создадим здесь
        Animals cat = new Cat();
    }
    //для остальных отдельный метод. На входе - порядковый номер персонажа
    public static void next(int x) {
        if (Run.countOfAnimal == 2) {
            Animals horse = new Horse();
        }
//        if (Run.countOfAnimal == 3) {
//            Animals dog = new Dog();
//        }
//        if (Run.countOfAnimal == 4) {
//            Animals pussy = new Pussy();
//        }
    }

}
