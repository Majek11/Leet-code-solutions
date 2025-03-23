public class ReverseArray {
    public static void main(String[] args) {
        int[] array = { 81, 62, 34, 41, 15 };

        for ( int i = array.length - 1; i >= 0; i-- ) {
            System.out.print(array[i] + " ");
        }
    }
}
