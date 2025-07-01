import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        runHashSet(sets);

        Sets sets2 = new Sets();
        runLinkedHashSet(sets2);

        Sets sets3 = new Sets();
        runTreeHashSet(sets3);

        Sets sets4 = new Sets();
        runTreeSetConComparador(sets4);

        Sets sets5 = new Sets();
        runConstruirTreeSetConComparadorDescendente(sets5);
        
    }

    public static void runHashSet(Sets sets) {
        System.out.println("HashSet:");
        for (String palabra : sets.construirHashSet()) {
            System.out.println(palabra);
        }
    }

    public static void runLinkedHashSet(Sets sets) {
        System.out.println("\nLinkedHashSet:");
        for (String palabra : sets.construirLinkedHashSet()) {
            System.out.println(palabra);
        }
    }

    public static void runTreeHashSet(Sets sets) {
        System.out.println("\nTreeSet:");
        for (String palabra : sets.construirTreeSet()) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSetConComparador(Sets sets) {
        System.out.println("\nTreeSet con Comparador:");
        for (String palabra : sets.construirTreeSetConComparador()) {
            System.out.println(palabra);
        }
    }

    public static void runConstruirTreeSetConComparadorDescendente(Sets sets) {
        System.out.println("\nTreeSet con Comparador Descendente:");
        for (String palabra : sets.construirTreeSetConComparadorDescendente()) {
            System.out.println(palabra);
        }
    }
}
