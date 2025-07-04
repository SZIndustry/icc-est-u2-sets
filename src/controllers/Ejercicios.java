package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {
    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));

        System.out.println("Ejercicio 2");
        System.out.println(isIsogram("murcielago"));
        System.out.println(isIsogram("camaleon"));

        System.out.println("Ejercicio 3");
        System.out.println(contarPalabrasUnicas("""
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
            """));
        
        System.out.println("Ejercicio 4");
        compararTextos("¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.",
                       "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.");
    }

    public boolean tieneDuplicados(int[] numeros) {

        Set<Integer> conjunto = new HashSet<>();
        for (int numero : numeros) {
            if (!conjunto.add(numero)) {
                return false;
            }
        }
        return true;
        
    }

    public boolean isIsogram(String palabra) {
        Set<Character> palabras = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!palabras.add(c)) {
                return false;
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        Set<String> palabras = new HashSet<>();
        String[] palabrasArray = frase.split(" ");
        for (String palabra : palabrasArray) {
            palabras.add(palabra);
        }

        return palabras.size();
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabrasTexto1 = new HashSet<>();
        Set<String> palabrasTexto2 = new HashSet<>();

        for (String palabra : texto1.split(" ")) {
            palabrasTexto1.add(palabra);

        }

        for (String palabra : texto2.split(" ")) {
            palabrasTexto2.add(palabra);
        }

        Set<String> interseccion = new HashSet<>(palabrasTexto1);
        interseccion.retainAll(palabrasTexto2);

        System.out.println("Texto 1: " + contarPalabrasUnicas(texto1) + " palabras únicas");
        System.out.println("Texto 2: " + contarPalabrasUnicas(texto2) + " palabras únicas");
        
        System.out.println("Palabras comunes: " + interseccion.size());

        System.out.println("Concidencia léxica: " + (interseccion.size() * 100 / Math.min(palabrasTexto1.size(), palabrasTexto2.size())) + "%");
        System.out.println("Palabras comunes 1: "+ interseccion);
        System.out.println("Palabras comunes 2: " + interseccion);

    }

}
