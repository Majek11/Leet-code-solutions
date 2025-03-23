public class FindElement {
    public static void main(String[] args) {
        int[] array = { 81, 62, 34, 41, 15 };
        int target = 8;
        boolean found = false;

        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] == target ) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        if ( found ) {
            System.out.println("Found Element");
        } else {
            System.out.println("Not Found Element");
        }
    }
}
