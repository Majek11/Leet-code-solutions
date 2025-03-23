public class MinOfArray {
    public static void main(String[] args) {
        int[] array = { 81, 62, 34, 41, 15 };
        int min = array[0];

        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

}
