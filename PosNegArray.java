public class PosNegArray {
    public static void main(String[] args) {
        int[] array = {-2,3,-6,7,8,99,-60};
        int postiveCount = 0, negativeCount = 0;

        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] < 0 ) {
                negativeCount++;
            } else {
                postiveCount++;
            }
        }
        System.out.println("Number of positive number is: " + postiveCount + "\nNumber of negative number is: " + negativeCount);
    }
}
