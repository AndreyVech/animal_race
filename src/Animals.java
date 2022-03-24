import java.util.Scanner;

abstract public class Animals implements AnimalVoice{
    private String nameAnimal;
    private int speedAnimal;
    private int countOfAnimal = 1;

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getSpeedAnimal() {
        return speedAnimal;
    }

    public void setSpeedAnimal(int speedAnimal) {
        this.speedAnimal = speedAnimal;
    }

    public Animals(String nameAnimal, int speedAnimal) {
        this.nameAnimal = nameAnimal;
        this.speedAnimal = speedAnimal;
    }

    public void run(String name, int speed) {
        //старт и финиш дистанции (в метрах)
        int distance = 0;
        double finish = 1000;
        double time = finish / speed ;
        String result = String.format("%s пробегает 1000м за %.2f сек, со скоростью %s м/с",getNameAnimal(), time, getSpeedAnimal());
        System.out.println(result);
        //считаем животного
        countOfAnimal ++;
        //и зовем следующего
        Main.next(countOfAnimal);
    }

    public abstract void voice();
}

