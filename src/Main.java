public class Main {
    public static void main(String[] args) {
        //первого персонажа создадим здесь
        next(0);
    }

    //для остальных отдельный метод. На входе - порядковый номер персонажа
    public static void next(int x) {
        switch (x) {
            case 0:
                Animals cat = new Cat(utilInput.inputName("Cat"), utilInput.inputSpeed());
                break;
            case 1:
                Animals horse = new Horse(utilInput.inputName("Horse"), utilInput.inputSpeed());
                break;
            case 2:
                Animals dog = new Dog(utilInput.inputName("Dog"), utilInput.inputSpeed());
                break;
            case 3:
                Animals pussy = new Pussy(utilInput.inputName("Pussy"), utilInput.inputSpeed());
                break;
        }
    }

}
