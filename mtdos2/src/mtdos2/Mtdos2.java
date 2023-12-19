/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtdos2;

/**
 *
 * @author villa
 */
public class Mtdos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, l;

        int a[][] = {{2, 2, 3,2}, {1, 3, 2,2},{2,1,3,2}};
        int b[][] = {{1,2,1}, {3,1,2}, {2,1,3},{2,1,2}};
        int c[][] = new int[3][3];

        n = 3;
        m = 4;
        l = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i][0]+" "+c[i][1]+" "+c[i][2]);
        }
    }

}
