/**
 * Print a repeated message
 */

class Message {
    public static void main(String[] args) {
        nPrintln("Hello, world!", 10);
    }

    /**
     * Print a message n times
     */
    public static void nPrintln(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}