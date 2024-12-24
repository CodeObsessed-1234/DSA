class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    private static int power(int n, int e) {
        if (e == 1) return n;
        return n * power(n, e - 1);
    }
}