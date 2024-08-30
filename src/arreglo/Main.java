/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;

/**
 *
 * @author yursd
 */
public class Main {

    public static void main(String[] args) {
        // Problema 1: Reordenar palabras en una oración
        String[] words = {"esta2", "bien4", "muy3", "esto1"};
        String reorderedSentence = SentenceReorder.reorderSentence(words);
        System.out.println("Oración reordenada: " + reorderedSentence);

        // Problema 2: Fusionar y ordenar dos arreglos
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] mergedAndSortedArray = ArrayMerger.mergeAndSort(nums1, nums2);
        System.out.println("Arreglo fusionado y ordenado: " + java.util.Arrays.toString(mergedAndSortedArray));
    }
}
