public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {12,20};
        int sum = 0;
        for ( int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        System.out.println("Total Sum: " + sum);
    }
}
