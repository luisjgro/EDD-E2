package eva2_8_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author invitado
 */
public class EVA2_8_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int double boolean char
        //LinkedList --> lista doblemente enlazada
        LinkedList<String> miLista = new LinkedList<String>();
        miLista.add("Hola");
        miLista.add("");
        miLista.add("Mundo");
        miLista.add("");
        miLista.add("Cruel");
        miLista.add("!!!!");
        System.out.println(miLista);
        System.out.println(miLista.size());
        miLista.remove(0);
        System.out.println(miLista.size());
        System.out.println(miLista.size());
        //ARRAYLIST 
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(100);
        miArrayList.add(200);
        miArrayList.add(300);
        miArrayList.add(400);
        miArrayList.add(500);
        System.out.println(miArrayList);
        miArrayList.remove(0);
        System.out.println(miArrayList);
        System.out.println(miArrayList.size());
        //CONJUNTOS
        TreeSet<Integer> miConjunto = new TreeSet<Integer>();
        miConjunto.add(100);
        miConjunto.add(200);
        miConjunto.add(300);
        miConjunto.add(300);
        System.out.println(miConjunto);
        System.out.println(miConjunto.size());
    }
    
}