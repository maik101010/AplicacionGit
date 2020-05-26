package algoritmos.algoritmos;

public class FindNumbersArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6};
        System.out.println(findNumber(arr));
    }

    private static int findNumber(int[] arr) {
        int res = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (i != arr[i - 1]) {
                res = i;
                break;
            }
        }
        return res;
    }
}
