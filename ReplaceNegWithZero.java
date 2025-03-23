public class ReplaceNegWithZero {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, -5, 6, -7, 8, -9, 10 };
        int replaceCount = 0;

        for (int i =0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = replaceCount;
            }
            System.out.println(arr[i]);
        }
    }
}
