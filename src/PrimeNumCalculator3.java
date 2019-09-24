public class PrimeNumCalculator3 {
    /**
     * @내용 대량의 소수를 한꺼번에 판별하는경우
     * 아래와 같이 에라토스테네스의 체를 사용 한다.
     *
     */
    public static void main(String[] args) {
        isPrimeNumber(100000);
    }

    static void isPrimeNumber(int x) {
        int[] arr = new int[x];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if (cur == 0 || cur == 1) continue;
            for (int k = cur + cur; k < arr.length; k += cur) {
                arr[k] = 0;
            }
        }

        for (int i : arr) {
            if (i != 0) System.out.printf("%d ", i);
        }
    }
}
