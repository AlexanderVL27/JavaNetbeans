/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

/**
 *
 * @author villa_xaz9a7o
 */
public class Mochila {

    public static int n = 5;

    public static void main(String[] args) {
        //int W = 100; // WMAX
        //Objetos
        //double[] pesos = {10, 35, 30, 80, 50}; // Pesos
        //double[] valores = {10, 30, 60, 80, 100}; // Valores
        // Peso máximo
        int W = 600; // WMAX
//Objetos
        double[] pesos = {150, 100, 150, 400, 250}; // Pesos
        double[] valores = {30, 24, 50, 40, 50}; // Valores

// Guarda orden que se seleccionaron los objetos
        int[] ordenSeleccion = new int[n];
// Vector de resultados
        double[] x;
// H1, H2, H3
        int H = 0;
        System.out.println("Heurísticas voraces\n");
// H1
        H = 1;
        System.out.println("H1: seleccionar el objeto más ligero");
// Inicializa vector que guarda orden que se seleccionaron los objetos
        inicializaVectorOrdenSeleccion(ordenSeleccion);
// Método voraz
        x = mochilaVoraz(pesos, valores, W, H, ordenSeleccion);
// Impresion de solucion en tabla texto
        imprimeSolicion(x, pesos, valores, ordenSeleccion);

// H2
        H = 2;
        System.out.println("\n------------------");
        System.out.println("H2: Seleccionar el objeto más valioso");
// Inicializa vector que guarda orden que se seleccionaron los objetos
        inicializaVectorOrdenSeleccion(ordenSeleccion);
// Método voraz
        x = mochilaVoraz(pesos, valores, W, H, ordenSeleccion);
// Impresion de solucion en tabla texto
        imprimeSolicion(x, pesos, valores, ordenSeleccion);

// H3
        H = 3;
        System.out.println("\n------------------");
        System.out.println("H3: Seleccionar el objeto con mayor relación valor/peso");
// Inicializa vector que guarda orden que se seleccionaron los objetos
        inicializaVectorOrdenSeleccion(ordenSeleccion);
// Método voraz
        x = mochilaVoraz(pesos, valores, W, H, ordenSeleccion);
// Impresion de solucion en tabla texto
        imprimeSolicion(x, pesos, valores, ordenSeleccion);
    }

    public static void imprimeSolicion(double[] x, double[] pesos, double[] valores, int[] ordenSeleccion) {
        double peso = 0;
        double valor = 0;
        String tabla_res = "Objeto(i)\t| Peso Ac\t| Valor Ac\t| Xi\n";
        String sol_x = "Solucion: x = (";
        int indice = -1;
        for (int i = 0; i < n; i++) {
            indice = ordenSeleccion[i];
            sol_x += "" + x[i];
            if (i < (n - 1)) {
                sol_x += ", ";
            }
            if (indice != -1) {
                if (x[indice] > 0) {
                    peso += (pesos[indice] * x[indice]);
                    valor += (valores[indice] * x[indice]);
                    tabla_res += "   " + (indice + 1) + "\t\t| " + peso + "\t\t| " + valor + "\t\t| " + x[indice] + "\n";
                }
            }
        }
        sol_x += ")";
        System.out.println("");
        System.out.println(sol_x);
        System.out.println("peso = " + peso + " valor: " + valor);
        System.out.println("");
        System.out.println(tabla_res);
    }

    public static double[] mochilaVoraz(double[] pesos, double[] valores, int w, int H, int[] ordenSeleccion) {
        double suma = 0;
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = 0;
        }
        int i = -1;
        int s = 0;
        while (suma < w) {
            i = seleccionVoraz(x, pesos, valores, H);
            if (i == -1) {
                break;
            }
            if ((suma + pesos[i]) <= w) {
                x[i] = 1;
                suma = suma + pesos[i];
                ordenSeleccion[s++] = i;
            } else {
                x[i] = (w - suma) / pesos[i];
                ordenSeleccion[s++] = i;
                suma = w;
            }
        }
        return x;
    }

    public static int seleccionVoraz(double[] x, double[] pesos, double[] valores, int H) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (x[i] == 0) {
                if (index < 0) {
                    index = i;
                } else {
                    switch (H) {
                        case 1:
                            if (pesos[i] < pesos[index]) {
                                index = i;
                            }
                            break;
                        case 2:
                            if (valores[i] > valores[index]) {
                                index = i;
                            }
                            break;
                        case 3:
                            if ((valores[i] / pesos[i]) > (valores[index] / pesos[index])) {
                                index = i;
                            }
                            break;
                        default:
                            System.out.println("No existe H" + H + "... ");
                    }
                }
            }
        }
        return index;
    }

    public static void inicializaVectorOrdenSeleccion(int[] v) {
        for (int i = 0; i < n; i++) {
            v[i] = -1;
        }
    }
}
