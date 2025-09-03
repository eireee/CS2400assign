public class testing {
    public class BrokenCode {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            for (int i = 0; i <= numbers.length; i++) { // Off-by-one error
                System.out.println(numbers[i]);
            }
        }
    }
}
