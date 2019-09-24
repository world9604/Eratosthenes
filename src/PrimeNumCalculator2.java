public class PrimeNumCalculator2 {
    /**
     * @내용 소수(Prime Number) 판별은 8는 2 * 4 = 4 * 2 와 같이
     * 대칭을 이루므로 제곱근까지만 계산을 해도 소수 인지 판별 할수 있다.
     */
    public static void main(String[] args) {
        System.out.printf("%b", isPrimeNumber(97));
    }

    static boolean isPrimeNumber(int x) {
        int end = (int) Math.sqrt(x);
        for (int i = 2; i < end; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
