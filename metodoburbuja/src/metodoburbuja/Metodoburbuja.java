/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbuja;

/**
 *
 * @author hecto
 */
public class Metodoburbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("--- PRUEBA: BURBUJA NORMAL ---");
        System.out.print("Estado Inicial: ");
        imprimirArreglo(arreglo1);
        
        burbuja.ordenamientoBurbuja(arreglo1);
        
        System.out.print("Resultado Final:  ");
        imprimirArreglo(arreglo1);

        
        // Prueba 2: Arreglo parcialmente ordenado para Burbuja Mejorado
        int[] arreglo2 = {111, 12, 22, 25, 34, 64, 90};
        System.out.println("--- PRUEBA: BURBUJA MEJORADO ---");
        System.out.print("Estado Inicial: ");
        imprimirArreglo(arreglo2);
        
        burbuja.ordenamientoBurbujaMejorado(arreglo2);
        
        System.out.print("Resultado Final:  ");
        imprimirArreglo(arreglo2);
    }
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
