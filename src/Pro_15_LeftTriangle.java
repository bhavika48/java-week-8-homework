/*15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
*/
public class Pro_15_LeftTriangle {
    public static void main(String args[]) {
        int rows = 5;

        for (int x = 1; x <= rows; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
