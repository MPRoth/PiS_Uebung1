public class ABCThread extends Thread{
    final boolean kleinbuchstaben;
    private static boolean istKleinDran = false;

    ABCThread(Boolean kleinbuchstaben) {
        this.kleinbuchstaben = kleinbuchstaben;
    }

    @Override
    public void run() {
        super.run();
        while(!isInterrupted()) {
            for (char alphabet = ((kleinbuchstaben) ? 'a' : 'A'); alphabet <= ((kleinbuchstaben) ? 'z' : 'Z'); alphabet++) {
                while (istKleinDran != kleinbuchstaben) Thread.yield();
                if (isInterrupted()){
                    System.out.println("Ende ABCThread" + kleinbuchstaben);
                    istKleinDran = !istKleinDran;
                    break;
                }
                System.out.println(alphabet);
                istKleinDran = !istKleinDran;
                /*try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        }
    }
}
