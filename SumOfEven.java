public class SumOfEven {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] % 2 == 0 ) {
                sumOfEven += array[i];
            } else {
                if ( array[i] % 2 != 0 ) {
                    sumOfOdd += array[i];
                }
            }
        }
        System.out.println("Sum of Odd Numbers: " + sumOfOdd);
        System.out.println("Sum of Even Numbers: " + sumOfEven);
    }
}
