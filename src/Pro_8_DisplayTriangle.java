import java.util.Scanner;

/*8. Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@ */
public class Pro_8_DisplayTriangle {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter right Angle Triangle pattern rows : ");

        int rows = sc.nextInt();
        System.out.println("Printing Right Angled Triangle @ Pattern : ");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();

        }
        // closing scanner object
        sc.close();

    }
}
