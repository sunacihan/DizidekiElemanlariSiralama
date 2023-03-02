import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int degisken;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz:");
        int n=input.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");

        for (int i=0;i<n;i++){
            System.out.print((i+1)+". Elemanı:");
            arr[i]=input.nextInt();

        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i != j && arr[i] < arr[j]) {
                    degisken = arr[i];
                    arr[i] = arr[j];
                    arr[j] = degisken;
                }
            }
        }
        System.out.println("Küçükten büyüğe sıralanmış hali:");
        System.out.println(Arrays.toString(arr));
    }
}