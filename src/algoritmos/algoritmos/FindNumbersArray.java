package algoritmos.algoritmos;

public class FindNumbersArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 1; i <= arr.length; i++) {
            if (i != arr[i - 1]) {
                System.out.println(i);
                break;
            }
        }
    }
}
