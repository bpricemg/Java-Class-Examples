class CharClass {
    public static void main(String[] args) {
        char ch = 'j';

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is an lowercase letter");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " a numeric character");
        } else {
            System.out.println(ch + " is neither a letter or a numeric character");
        }
    }
}