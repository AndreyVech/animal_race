//классы животных однотипны и создаются ctrl+c - ctrl+v
import java.util.Scanner;

public class Dog extends Animals implements AnimalVoice{
    private String voice = "Doooooooog!!";

    public void voice() {
        voice(voice);
    }


    public Dog(String nameAnimal, int speedAnimal) {
        super(nameAnimal, speedAnimal);
        voice();
        super.run(nameAnimal, speedAnimal);
    }


}
