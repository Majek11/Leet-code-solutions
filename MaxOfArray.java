public class MaxOfArray {
    public static void main(String[] args) {
        int[] array = { 81, 62, 34, 41, 15 };
        int max = array[0];

        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
