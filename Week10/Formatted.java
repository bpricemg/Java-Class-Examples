class Formatted {
    public static void main(String[] args) {
        int n = 7;
        String day = "Thursday";
        double temp = 42.1542995;

        System.out.printf("\tToday is %s and there are %d students present\n", day, n + 1);
        System.out.printf("The temperature today is %f\n", temp);
        System.out.printf("The temperature today is %.7f\n", temp);
        System.out.printf("The temperature today is %.1f\n", temp);
        System.out.printf("The temperature today is %5f\n", temp);
    }
}