/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

/**
 *
 * @author villa_xaz9a7o
 */
public class Tareas1 {

    static int nTareas = 5;
    static int nTrabajadores = 5;

    public static void main(String[] args) {
        // Tabla tareas
//int[][] tablaTareas = {
//{10,15, 7,20,12},
//{ 3, 4, 5, 8, 9},
//{10,12,11,17,21},
//{11,15,23,10, 4},
//{ 3, 8,21,31, 4}
//};
        int[][] tablaTareas = {{100,250,230,210,230}, {500,400,150,255,80}, {150,100,245,430,210}, {300,200,270,130,110}, {200,100,310,100,40}};
        // *** Heurística 1 ***
// Tabla donde se asignan tareas a trabajador
        int[][] tablaTareasAsignadas = new int[nTrabajadores][3];
// se inicializa tabla en -1
        inicializaArray(tablaTareasAsignadas);
        System.out.println("");
        System.out.println("*** Heurística 1 ***");
// asignar tareas a trabajadores
        asignaTareas(tablaTareasAsignadas, tablaTareas);
// imprimir tabla de tareas asignadas a los trabajadores
        imprimeArrayTareas(tablaTareasAsignadas);
//*** Heurística 2 ***
// Tabla donde se asignan trabajadores a tareas
        int[][] tablaTrabajadoresAsignados = new int[nTareas][3];
// se inicializa tabla en -1
        inicializaArray(tablaTrabajadoresAsignados);
        System.out.println("");
        System.out.println("*** Heurística 2 ***");
// Asignar trabajadores a Tareas
        asignaTrabajadores(tablaTrabajadoresAsignados, tablaTareas);
// imprimir tabla de trabajadores asignados a tareas
        imprimeArrayTrabajadores(tablaTrabajadoresAsignados);
    }

    // *** HEURISTICA 1 ***
    public static void asignaTareas(int[][] tablaTareasAsignadas, int[][] tablaTareas) {
        int mejorTarea = -1;
        for (int trabajador = 0; trabajador < nTrabajadores; trabajador++) {
            mejorTarea = asignaTarea(trabajador, tablaTareasAsignadas, tablaTareas);
            tablaTareasAsignadas[trabajador][0] = trabajador;
            tablaTareasAsignadas[trabajador][1] = mejorTarea;
            tablaTareasAsignadas[trabajador][2] = calculaCostoTareas(tablaTareasAsignadas, tablaTareas);
        }
    }

    public static void imprimeArrayTareas(int[][] tablaTareasAsignadas) {
        String salidasTXT = "Tareas (Trabajador) = (";
        System.out.println("Trabajador\tTarea\tCoste Ac");
        for (int i = 0; i < nTrabajadores; i++) {
            System.out.println(" " + (tablaTareasAsignadas[i][0] + 1) + "\t\t  " + (tablaTareasAsignadas[i][1] + 1) + "\t  " + tablaTareasAsignadas[i][2]);
            salidasTXT += tablaTareasAsignadas[i][1] + 1;
            if (i < nTrabajadores - 1) {
                salidasTXT += ", ";
            }
        }
        salidasTXT += ")\nCosto = " + tablaTareasAsignadas[nTrabajadores - 1][2];
        System.out.println("");
        System.out.println(salidasTXT);
    }

    public static int asignaTarea(int trabajador, int[][] tablaTareasAsignadas, int[][] tablaTareas) {
        int min = 1000;
        int mejorTarea = -1;
        for (int tarea = 0; tarea < nTareas; tarea++) {
            if (!yaAsignada(tarea, tablaTareasAsignadas)) {
                if (costo(trabajador, tarea, tablaTareas) < min) {
                    min = costo(trabajador, tarea, tablaTareas);
                    mejorTarea = tarea;
                }
            }
        }
        return mejorTarea;
    }

    public static boolean yaAsignada(int tarea, int[][] tablaTareasAsignadas) {
        boolean asignada = false;
        for (int trabajador = 0; trabajador < nTrabajadores; trabajador++) {
            if (tablaTareasAsignadas[trabajador][1] == tarea) {
                return true;
            }
        }
        return asignada;
    }

    public static int calculaCostoTareas(int[][] tablaTareasAsignadas, int[][] tablaTareas) {
        int suma = 0;
        int tarea = -1;
        for (int trabajador = 0; trabajador < nTrabajadores; trabajador++) {
            tarea = tablaTareasAsignadas[trabajador][1];
            if (tarea != -1) {
                suma = suma + costo(trabajador, tarea, tablaTareas);
            }
        }
        return suma;
    }

    // *** HEURISTICA 2 ***
    public static void imprimeArrayTrabajadores(int[][] tablaTrabajadoresAsignados) {
        String salidasTXT = "Trabajador (Tareas) = (";
        System.out.println("Tarea\tTrabajador\tCoste Ac");
        for (int i = 0; i < nTrabajadores; i++) {
            System.out.println(" " + (tablaTrabajadoresAsignados[i][0] + 1) + "\t   " + (tablaTrabajadoresAsignados[i][1] + 1) + "\t\t  " + tablaTrabajadoresAsignados[i][2]);
            salidasTXT += tablaTrabajadoresAsignados[i][1] + 1;
            if (i < nTrabajadores - 1) {
                salidasTXT += ", ";
            }
        }
        salidasTXT += ")\nCosto  =  " + tablaTrabajadoresAsignados[nTrabajadores - 1][2];
        System.out.println("");
        System.out.println(salidasTXT);
    }

    public static void asignaTrabajadores(int[][] tablaTrabajadoresAsignados, int[][] tablaTareas) {
        int mejorTrabajador = -1;
        for (int tarea = 0; tarea < nTareas; tarea++) {
            mejorTrabajador = asignaTrabajador(tarea, tablaTrabajadoresAsignados, tablaTareas);
            tablaTrabajadoresAsignados[tarea][0] = tarea;
            tablaTrabajadoresAsignados[tarea][1] = mejorTrabajador;
            tablaTrabajadoresAsignados[tarea][2] = calculaCostoTrabajadores(tablaTrabajadoresAsignados, tablaTareas);
        }
    }

    public static int asignaTrabajador(int tarea, int[][] tablaTrabajadoresAsignados, int[][] tablaTareas) {
        int min = 1000;
        int mejorTrabajador = -1;
        for (int trabajador = 0; trabajador < nTrabajadores; trabajador++) {
            if (!yaAsignado(trabajador, tablaTrabajadoresAsignados)) {
                if (costo(trabajador, tarea, tablaTareas) <= min) {
                    min = costo(trabajador, tarea, tablaTareas);
                    mejorTrabajador = trabajador;
                }
            }
        }
        return mejorTrabajador;
    }

    public static boolean yaAsignado(int trabajador, int[][] tablaTrabajadoresAsignados) {
        boolean asignado = false;
        for (int tarea = 0; tarea < nTareas; tarea++) {
            if (tablaTrabajadoresAsignados[tarea][1] == trabajador) {
                return true;
            }
        }
        return asignado;
    }

    public static int calculaCostoTrabajadores(int[][] tablaTrabajadoresAsignados, int[][] tablaTareas) {
        int suma = 0;
        int trabajador = -1;
        for (int tarea = 0; tarea < nTareas; tarea++) {
            trabajador = tablaTrabajadoresAsignados[tarea][1];
            if (trabajador != -1) {
                suma = suma + costo(trabajador, tarea, tablaTareas);
            }
        }
        return suma;
    }

    // Comun H1, H2 
    public static int costo(int trabajador, int tarea, int[][] tablaTareas) {
        return tablaTareas[trabajador][tarea];
    }

    public static void inicializaArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = -1;
            }
        }
    }
}
