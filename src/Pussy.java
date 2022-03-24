import java.util.Scanner;

public class Pussy extends Animals implements AnimalVoice {
    private String voice = "pusssssyyyyyyyy!!!";

    @Override
    public void voice() {
        voice(voice);
    }


    public Pussy(String nameAnimal, int speedAnimal) {
        super(nameAnimal, speedAnimal);
        super.run(nameAnimal, speedAnimal);
    }

}