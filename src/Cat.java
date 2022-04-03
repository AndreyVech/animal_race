//классы животных однотипны и создаются ctrl+c - ctrl+v

public class Cat extends Animals implements AnimalVoice {
    private String voice = "Meeeooww";

    public void voice() {
        voice(voice);
    }

    public Cat(String nameAnimal, int speedAnimal) {
        super(nameAnimal, speedAnimal);
        voice();
        super.run(nameAnimal, speedAnimal);
    }
}





