public class ABCThread extends Thread{
    final boolean kleinbuchstaben;
    private static boolean istKleinDran = false;

    ABCThread(Boolean kleinbuchstaben) {
        this.kleinbuchstaben = kleinbuchstaben;
    }

    @Override
    public void run() {
        super.run();
        for (char alphabet = ((kleinbuchstaben) ? 'a' : 'A'); alphabet <= ((kleinbuchstaben) ? 'z' : 'Z'); alphabet++) {
            while (istKleinDran != kleinbuchstaben) Thread.yield();
            System.out.println(alphabet);
            istKleinDran = !istKleinDran;
            Thread.yield();
        }
    }
}
