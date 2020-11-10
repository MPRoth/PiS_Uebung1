public class Main {
    public static void main(String[] args) {

        //Aufgabe 1
        ABCThread alphabet1 = new ABCThread(true);
        ABCThread alphabet2 = new ABCThread(false);

        alphabet1.start();
        //alphabet1.join();
        alphabet2.start();

        //Aufgabe 2
        //new Thread(new ABCPrinter(true)).start();
        //new Thread(new ABCPrinter(false)).start();
    }
}
