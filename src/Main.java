import publisher.Publisher;
import subscriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("Eduardo");

        Publisher publisher1 = new Publisher(subscriber1);
        Publisher publisher2 = new Publisher(subscriber1);

        Thread t1 = new Thread(publisher1);
        Thread t2 = new Thread(publisher2);

        t1.start();
        t2.start();



    }
}