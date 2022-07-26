import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1;
        int i = 0, k = 0;
        int ekokk = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz: ");
        n1 = inp.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        n2 = inp.nextInt();

        while (i <= n2) {
            i++;
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
        }
        while (k <= n1 * n2) {
            k++;
            if ((k % n1 == 0) && (k % n2 == 0)) {
                ekokk = k;
                break;
            }
        }
        System.out.println("EBOB(" + n1 + "," + n2 + ")= " + ebob);
        System.out.println("EKOK(" + n1 + "," + n2 + ")= " + ekokk);

        int ekok = n1 * n2 / ebob;
        System.out.println("EKOK(" + n1 + "," + n2 + ")= " + ekok);

    }
}