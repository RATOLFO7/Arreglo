/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;

/**
 *
 * @author yursd
 */
public class SentenceReorder {

    public static String reorderSentence(String[] words) {
        // Ordenar las palabras según los números al final
        java.util.Arrays.sort(words, (a, b) -> {
            int numA = Integer.parseInt(a.replaceAll("\\D+", ""));
            int numB = Integer.parseInt(b.replaceAll("\\D+", ""));
            return Integer.compare(numA, numB);
        });

        // Construir la oración eliminando los números
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.replaceAll("\\d+", "")).append(" ");
        }

        // Devolver la oración sin el último espacio
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String[] words = {"esta2", "bien4", "muy3", "esto1"};
        String result = reorderSentence(words);
        System.out.println(result);  // Salida: "esto esta muy bien"
    }
}
