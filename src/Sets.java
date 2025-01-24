import java.util.*;

public class Sets {
    Sets() {

    }

    public Set<String> construirHashSet() {
        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Pera");

        return miHashSet;

    }

    public Set<String>  construirLinkedHashSet() {
        Set<String> miLinkedHashSet = new LinkedHashSet<>();

        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocoton");
        miLinkedHashSet.add("Melon");
        miLinkedHashSet.add("Pera");

        return miLinkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melon");
        miTreeSet.add("Pera");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        // Implementacion de Comparator para ordenar por longitud y luego alfabeticamente
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Primero comparamos la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                // Si tienen la misma longitud, comparamos alfabeticamente
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);

        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Pera");

        return miTreeSetComparador;
    }
    
    
}