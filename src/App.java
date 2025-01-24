import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetComparador();
    }

    public static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("------HashSet------");
        System.out.println("Elementos del HashSet (no garantiza el orden):");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("------LinkedHashSet---------");
        System.out.println("Elementos del LinkedHashSet (respeta el orden de insercion):");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("--------TreeSet---------");
        System.out.println("Elementos del TreeSet (orden alfabetico):");
        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparador() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetComparador = sets.construirTreeSetConComparador();
        System.out.println("--------TreeSetComparador---------");
        System.out.println("Elementos del TreeSetComparador (orden alfabetico por longitud):");
        for (String elemento : ejemploTreeSetComparador) {
            System.out.println(elemento);
        }
    }
}
