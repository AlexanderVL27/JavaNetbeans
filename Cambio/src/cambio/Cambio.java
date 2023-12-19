/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;

/**
 *
 * @author villa_xaz9a7o
 */
public class Cambio {

    static final int max = 100;
    static int[] ans = new int[max];

    public static int findMinCoins(int coins[], int size, int value) {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            while (value >= coins[i]) {
                value -= coins[i];
                ans[count] = coins[i];
                count++;
            }
            if (value == 0) {
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int coins[] = { 20,10,5,3, 2,1};
        int value = 57;
        int i;
        int size = coins.length;
        int MinCount = findMinCoins(coins, size, value);
        System.out.println("\nCantidad: " + value + "\n");
        System.out.println("Total de monedas necesarias = " + MinCount);
        System.out.print("Las monedas son: ");
        for (i = 0; i < MinCount; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("\n\n");
    }
}
