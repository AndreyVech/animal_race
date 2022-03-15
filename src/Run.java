import java.text.DecimalFormat;

public class Run {
    //переменная для вызова следующего животного
    public static int countOfAnimal = 1;
    //метод запускающий прогресс-бар. На входе скорость
    protected void run(int speed) {
        //метод тупо нашел в интернете. Сложный
        Thread mThread = new Thread(new Runnable() {
        public void run() {
            //старт и финиш дистанции (в метрах)
            int distance = 0;
            double finish = 1000;
            //переменная времени от скорости. Т.к. выводим каждые 100м (1/10), то разделим на 10
            double time = finish / speed / 10;
            do {
                System.out.print(distance + "м... ");
                //идем по дистанции
                distance = distance + 100;
                try {
                    //таймер задержки. Задержка равна переменная времени в секундах
                    Thread.sleep((long) (time * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (distance < finish);

            System.out.println("1000м за " + time * 10 + " сек");
            //считаем животного
            countOfAnimal ++;
            //и зовем следующего
            Main.next(countOfAnimal);
        }
    }
    );
    mThread.start();
}
}
