class Char {
    public static void main(String[] args) {
        char ch = '6';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " a numeric character");
        } else {
            System.out.println(ch + " is neither a letter or a numeric character");
        }
    }
}