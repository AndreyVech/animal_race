
public class Animals {
    private String name;
    private int speed;
    protected void addAnimal (String name, int speed, String voice) {
        //получаем набор данных от животных
        this.name = name;
        this.speed = speed;
        //покричим перед стартом
        AnimalInfo(voice);
        //побежали, передавая методу скорость
        Run run = new Run();
        run.run(speed);
    }
    private void AnimalInfo (String voice) {
        System.out.println(this.name + " стартует и кричит: " + voice);
    }
}
