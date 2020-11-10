import java.awt.event.KeyEvent;
import java.util.Scanner;

public class KillerThread extends Thread{
    ABCThread alphabet1, alphabet2;

    public KillerThread(ABCThread alphabet1, ABCThread alphabet2) {
        super();
        this.alphabet1 = alphabet1;
        this.alphabet2 = alphabet2;
    }

    @Override
    public void run() {
        super.run();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //this.alphabet1.stop();
        //this.alphabet2.stop();
        while(!this.alphabet1.isInterrupted())
            this.alphabet1.interrupt();
        while(! this.alphabet2.isInterrupted())
            this.alphabet2.interrupt();

        System.out.println("Ende Killer");
    }
}