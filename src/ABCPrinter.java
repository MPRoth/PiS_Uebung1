public class ABCPrinter implements Runnable {

    final boolean kleinbuchstaben;

    ABCPrinter(boolean kleinbuchstaben) {
        this.kleinbuchstaben = kleinbuchstaben;
    }

    @Override
    public void run() {
        for(char alphabet = ((kleinbuchstaben)?'a':'A'); alphabet <= ((kleinbuchstaben)?'z':'Z'); alphabet++) {
            System.out.println(alphabet);
        }
    }
}
