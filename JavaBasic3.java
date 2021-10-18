import java.util.Scanner;

public class JavaBasic3 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int x = 9;
        System.out.println("Segitiga");
        menu.close();

        for (int i = 1; i <= x; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('0');
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print('0');
            }
            System.out.println();
        }
    }

}