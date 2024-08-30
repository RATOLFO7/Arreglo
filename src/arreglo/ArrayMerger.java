/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;

/**
 *
 * @author yursd
 */
public class ArrayMerger {

    public static int[] mergeAndSort(int[] nums1, int[] nums2) {
        // Crear un nuevo arreglo con el tamaño combinado de ambos arreglos
        int[] mergedArray = new int[nums1.length + nums2.length];

        // Copiar ambos arreglos en el nuevo arreglo
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        // Ordenar el arreglo combinado
        java.util.Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] result = mergeAndSort(nums1, nums2);

        // Imprimir el arreglo resultante
        System.out.println(java.util.Arrays.toString(result));  // Salida: [1, 2, 3, 4, 5, 6]
    }
}
