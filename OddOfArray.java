public class OddOfArray {
    public static void main(String[] args) {
        int[] array = { 81, 62, 34, 41, 15, 62, 73, 28, 19 };

        for ( int i =0; i < array.length; i++ ) {
            if ( array[i] % 2 != 0 ) {
                System.out.println( array[i] );
            }
        }
    }
}
