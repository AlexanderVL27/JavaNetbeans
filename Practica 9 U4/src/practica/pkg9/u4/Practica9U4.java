package practica.pkg9.u4;
public class Practica9U4 {

    public static void main(String[] args) {
        int [][]arrb = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Arreglo bidimensional ");
        for (int i = 0; i < arrb.length; i++) {
            for (int j = 0; j < arrb[0].length; j++) {
                System.out.print(arrb[i][j]);
            }
            System.out.println("");
        }
        sumadiag(arrb);
        for (int i = 0; i < arrb.length; i++) {
            for (int j = 0; j < arrb[0].length; j++) {
                if (i==j) {
                    arrb[i][j]=5;
                }
            }
        }
        arrgmod(arrb);
    }

    public static void sumadiag(int[][] arrb) {
        int sumad=0;
        for (int i = 0; i < arrb.length; i++) {
            for (int j = 0; j < arrb[0].length; j++) {
                if (i==j) {
                    sumad=sumad+arrb[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es "+sumad);
        System.out.println("================================================");
    }

    public static void arrgmod(int[][] arrb) {
        for (int i = 0; i < arrb.length; i++) {
            for (int j = 0; j < arrb[0].length; j++) {
                System.out.print(arrb[i][j]);
            }
            System.out.println("");
        }
    }
    
}
