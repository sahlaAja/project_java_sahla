package tugasweek5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *	Wildcard Arguments With An Unknown Type
 *	@author javaguides.net
 **/

public class WildCardSimpleExample {
    public static void printCollection(Collection<?> c){ //method dengan wildcard <?> agar Collection bisa menerima berbagai tipe data
        for(Object e : c){ //perulangan untuk mengambil setiap elemen dari coolection
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("ArrayList Collection");
        printCollection(collection);

        Collection<String> collection2 = new LinkedList<>();
        collection2.add("LinkedList Collection");
        printCollection(collection2);

        Collection<String> collection3 = new HashSet<>();
        collection3.add("HashSet Collection");
        printCollection(collection3);
    }
}
