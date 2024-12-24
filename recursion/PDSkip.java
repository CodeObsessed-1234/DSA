class PdSkip{
    public static void main(String[] args) {
        skipRecursion(5);
    }
    private static void skipRecursion(int n){
        if(n==0) return;
        if (n%2!=0)
            System.out.println(n);
        skipRecursion(n-1);
        if (n%2==0)
            System.out.println(n);
    }
}