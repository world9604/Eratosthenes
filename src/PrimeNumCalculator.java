public class PrimeNumCalculator {
    /**
     * @내용 소수(PrimeNumber)는 양의 약수를 두개만 가지는 자연수
     * 를 의미 한다. 가장 쉽게 판별하는 방법이 아래와 같은 방법이다.
     */
    public static void main(String[] args) {
        System.out.printf("%b", isPrimeNumber(97));
    }

    static boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
