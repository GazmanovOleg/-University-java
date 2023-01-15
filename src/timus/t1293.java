package timus;

import java.util.Scanner;

public class t1293 {
    /*Now in all this turmoil it is discovered that corvette’s thermopanels again need an urgent processing with thorium sulphide.
     It is known that the processing of the one square meter of the panel needs 1 nanogramm of sulphide.
      In general, it is needed to process N rectangular panels, which dimensions are A by B meters.
      It is necessary to calculate as fast as possible, how much sulphide is needed in general for the processing of all panels of “Eniya”.
    Moreover, do not forget, that the panels need processing of both sides.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A*B*2*N);
    }
}
