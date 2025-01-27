import java.util.*;

import Models.Contacto;
import Utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        //runHashSet();
        //runLinkedHashSet();
        //runTreeSet();
        //runTreeSetComparador();
        runEjercicio();
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

    private static void runEjercicio() {
        /*Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("\nReferencia en memoria: ");
        boolean comparacionReferencia = c1 == c2;
        System.out.println("c1: " +  c1 + " == c2: " + c2 + " = " + comparacionReferencia);

        System.out.println("\nComparacion equals: ");
        boolean comparacionEquals = c1.equals(c2);
        System.out.println("c1: " + c1 + " == c2: " + c2 + " = " + comparacionEquals);

        System.out.println("\nComparacion de HashCode: ");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println("c1: " + c1.hashCode() + " == c2: " + c2.hashCode() + " = " + comparacionHashCode);*/


        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        //Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));

        for (Contacto c : agenda) {
            System.out.println(c);
        }
        
    }
}
