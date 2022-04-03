public interface AnimalVoice {
    default void voice(String voice) {
        System.out.println("стартует и кричит: " + voice);
    }

    void voice();
}
