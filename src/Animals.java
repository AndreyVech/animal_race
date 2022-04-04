import java.util.ArrayList;

abstract public class Animals implements AnimalVoice {
    private String nameAnimal;
    private int speedAnimal;
    private static int countOfAnimals;

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
        this.countOfAnimals++;
    }

    public void run(String name, int speed) {
        //старт и финиш дистанции (в метрах)
        int distance = 0;
        double finish = 1000;
        double time = finish / speed;
        String result = String.format("%s пробегает 1000м за %.2f сек, со скоростью %s м/с", getNameAnimal(), time, getSpeedAnimal());
        System.out.println(result);
        //и зовем следующего

        Main.next(countOfAnimals);
    }
//    public void addRunner(String nameAnimal){
//        runners[runners.length+1] = nameAnimal;
//        System.out.println(runners.length);
//    }
}

