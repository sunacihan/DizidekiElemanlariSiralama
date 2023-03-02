import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int degisken;

        int[] arr = {4, 3, 7, 5, 9, 2, 8, 1, 6};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] < arr[j]) {
                    degisken = arr[i];
                    arr[i] = arr[j];
                    arr[j] = degisken;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }}