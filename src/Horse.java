//классы животных однотипны и создаются ctrl+c - ctrl+v
import java.util.Scanner;

public class Horse extends Animals  implements AnimalVoice{
    private String voice = "igogogo!!";

    public void voice() {
        voice(voice);
    }


    public Horse(String nameAnimal, int speedAnimal) {
        super(nameAnimal, speedAnimal);
        super.run(nameAnimal, speedAnimal);
    }


}