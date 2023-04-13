
class TestRecursiveSum {
    long sum(int n) {
        if (n==1) return 1;
        else return n+sum(n-1);
    }

    public static void main (String[] args) {
        TestRecursiveSum s = new TestRecursiveSum();
        System.out.println(s.sum(100));
    }
}