package FourthModuleHomeWork.FourthModuleHomeWork1;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Counter object = new Counter();
        for (int i = 0; i < 10; i++) {

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        object.increment();
                    }
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        object.increment();
                    }
                }
            });

            thread1.start();
            thread2.start();
            Thread.sleep(500);
            System.out.println(object.getValue());
            object.count = 0;
            /*При каждой итерации цикла получаются разные значения,
             так как два потока могут одновременно обратиться к одному полю
             и выполнять действия одновременно,как будто действие было выпоолнено
             один раз, а не два раза*/
        }
    }
}
