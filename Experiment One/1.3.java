class Fibonacci {
    public static void main(String[] args) {
        int first, second, third, n;
        first = 0;
        second = 1;
        n = 10;
        System.out.println(first);
        for (int i = 0; i <= n; i++) {
            third = second + first;
            System.out.println(third);
            first = second;
            second = third;
        }
    }

}
