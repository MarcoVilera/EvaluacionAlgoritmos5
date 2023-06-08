package app1;

//@author MarcoVilera
import java.math.BigInteger;

public class Operaciones {

    public static int[][] genRandMatriz(int n) {//Genera una matriz de tamaño nxn con valores aleatorios entre -999 hasta 999
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * (999 * 2 + 1) - 999);
            }
        }
        return matriz;
    }

    public static int[] vectorMatriz(int matriz[][], int n) { //Transformar matriz en Vector
        int num = 0;
        int vector[] = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vector[num] = matriz[i][j];
                num++;
            }
        }
        return vector;
    }

    public static String vectorMayorMenor(int vector[]) {//Utiliza el metodo de la burbuja para ordenar el vector de mayor a menor
        int temp = 0;
        String conc = "";
        String conctemp = "";
        for (int i = 0; i < vector.length; i++) {
            for (int j = 1; j < (vector.length - i); j++) {
                if (vector[j - 1] < vector[j]) {
                    temp = vector[j - 1];
                    vector[j - 1] = vector[j];
                    vector[j] = temp;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            conctemp = Integer.toString(vector[i]);
            conc = conc + conctemp + " ";
        }
        return conc;
    }

    public static String multColumna(int matriz[][]) {//Multiplica la primera columna de la matriz
        long mult = 1;
        int temp = 0;
        String conc = "";
        String conctemp = "";
        String result = "";
        for (int i = 0; i < matriz[0].length; i++) {
            temp = matriz[i][0];
            mult = mult * temp;
        }
        for (int i = 0; i < matriz[0].length; i++) {
            conctemp = Integer.toString(matriz[i][0]);
            if (i == (matriz[0].length - 1)) {
                conc = conc + conctemp + " ";
            } else {
                conc = conc + conctemp + " * ";
            }
        }
        result = conc + "= " + mult;
        return result;
    }

    public static int multColumnaint(int matriz[][]) {//Multiplica la primera columna de la matriz en un valor entero
        int mult = 1;
        int temp = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            temp = matriz[i][0];
            mult = mult * temp;
        }
        return mult;
    }

    public static String retornaInv(int[][] matriz) {
    int resultado = 1;
    for (int i = 0; i < matriz.length; i++) {
        resultado *= matriz[i][0];
    }
    String resultadoString = Integer.toString(resultado);
    String resultadoInvertido = new StringBuilder(resultadoString).reverse().toString();
    return resultadoInvertido;
}

    public static String diagonalSecProm(int matriz[][]) {//Obtiene la diagonal secundaria de una matriz y el promedio de la misma
        int suma = 0;
        String conc = "";
        String conctemp = "";
        String result = "";
        double prom = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[matriz.length - 1 - i][i];
        }
        for (int i = 0; i < matriz.length; i++) {
            conctemp = Integer.toString(matriz[matriz.length - 1 - i][i]);
            if (i == (matriz.length - 1)) {
                conc = conc + conctemp + " ";
            } else {
                conc = conc + conctemp + " + ";
            }
        }
        prom = (double) suma / matriz.length;
        result = conc + " = " + Integer.toString(suma) + "/ " + Integer.toString(matriz.length) + " = " + Double.toString(prom);
        return result;
    }

    public static String potenciaMenorMayor(int matriz[][]) {//Potencia entre el menor elemento elevado al mayor elemento
        int mayor, menor;
        mayor = 0;
        menor = 999;
        String result = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] > 0 && matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }        
        BigInteger menorb = BigInteger.valueOf(menor);
        BigInteger pot = menorb.pow(mayor);
        result = Integer.toString(menor) + "^" + Integer.toString(mayor) + " = " + pot;
        return result;
    }

}
