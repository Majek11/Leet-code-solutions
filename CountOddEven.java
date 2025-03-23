public class CountOddEven {
    public static void main(String[] args) {
        int[] array = { 81, 62, 34, 41, 15 };
        int evenCount = 0, oddCount = 0;

        for ( int i = array.length - 1; i >= 0; i-- ) {
            if ( array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println( "Total Odd Numbers: " + oddCount +  "\nTotal Even Numbers: "  + evenCount);
    }
}
