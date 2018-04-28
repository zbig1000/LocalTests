package CollectionTests;

import java.util.HashMap;
import java.util.LinkedList;

class Kodilla {
    public static void main (String[] args) {

        // TODO Auto-generated method stub
        LinkedList<Book> library = new LinkedList<Book>();
        StringVendor stringVendor = new StringVendor();


        for (int i=0; i<400001; i++) {
            library.add(new Book(stringVendor.getRandomAuthor(), stringVendor.getRandomTitle(), stringVendor.getRandomYear()));
        }


        // LinkedList Tests
        long begin = System.nanoTime();
        library.remove(library.getFirst());
        long end = System.nanoTime();
        //--------------------Removing -------------------------

        System.out.println("Removing FIRST element of the LinkedList has lasted: " + (end - begin) + "ns");

        begin = System.nanoTime();
        library.remove(library.getLast());
        end = System.nanoTime();

        System.out.println("Removing LAST element of the LinkedList has lasted: " + (end - begin) + "ns");
//--------------------Adding ------------------------
        Book book = new Book(stringVendor.getRandomAuthor(), stringVendor.getRandomTitle(), stringVendor.getRandomYear());
        begin = System.nanoTime();
        library.addFirst(book);
        end = System.nanoTime();

        System.out.println("Adding FIRST element of the LinkedList has lasted: " + (end - begin) + "ns");

        book = new Book(stringVendor.getRandomAuthor(), stringVendor.getRandomTitle(), stringVendor.getRandomYear());
        begin = System.nanoTime();
        library.addLast(book);
        end = System.nanoTime();

        System.out.println("Adding LAST element of the LinkedList has lasted: " + (end - begin) + "ns");
        //--------------------Finding -------------------------
        begin = System.nanoTime();
        book = library.get(0);
        end = System.nanoTime();
        System.out.println("Finding Fist element of the LinkedList has lasted: " + (end - begin) + "ns");

        begin = System.nanoTime();
        book = library.get(library.size()-1);
        end = System.nanoTime();
        System.out.println("Finding Last element of the LinkedList has lasted: " + (end - begin) + "ns");

        System.out.println("FINAL SIZE: " + library.size());
        //----------------------------------------------
        System.out.println();
/**
 Stwórz program, który zmierzy czas operacji wyszukiwania po kluczu, a także czas dodawania i usuwania obiektu
 z mapy HashMap liczącej kilka milionów obiektów
 **/
        HashMap<WarehouseNumber, Book> whouse = new HashMap<WarehouseNumber, Book>();

        for (int i=0; i<400001; i++) {
            whouse.put(new WarehouseNumber(i), new Book(stringVendor.getRandomAuthor(), stringVendor.getRandomTitle(), stringVendor.getRandomYear()));
        }
        //--------------------Removing -------------------------

        WarehouseNumber firstWH = new WarehouseNumber(0);
        begin = System.nanoTime();
        whouse.remove(firstWH);
        end = System.nanoTime();
        System.out.println("Removing FIRST element of the HashMap has lasted: " + (end - begin) + "ns");

        WarehouseNumber lastWH = new WarehouseNumber(whouse.size());
        begin = System.nanoTime();
        whouse.remove(lastWH);
        end = System.nanoTime();
        System.out.println("Removing LAST element of the HashMap has lasted: " + (end - begin) + "ns");


        //--------------------Adding ------------------------
        firstWH = new WarehouseNumber(0);
        book = new Book(stringVendor.getRandomAuthor(), stringVendor.getRandomTitle(), stringVendor.getRandomYear());

        begin = System.nanoTime();
        whouse.put(firstWH, book);
        end = System.nanoTime();
        System.out.println("Adding FIRST element of the HashMap has lasted: " + (end - begin) + "ns");

        lastWH = new WarehouseNumber(whouse.size());
        book = new Book(stringVendor.getRandomAuthor(), stringVendor.getRandomTitle(), stringVendor.getRandomYear());

        begin = System.nanoTime();
        whouse.put(lastWH, book);
        end = System.nanoTime();

        System.out.println("Adding LAST element of the HashMap has lasted: " + (end - begin) + "ns");
        //--------------------Finding -------------------------
        begin = System.nanoTime();
        book = whouse.get(firstWH);
        end = System.nanoTime();
        System.out.println("Finding FIRST element of the HashMap has lasted: " + (end - begin) + "ns");


        lastWH = new WarehouseNumber(whouse.size() -1);

        begin = System.nanoTime();
        book = whouse.get(lastWH);
        end = System.nanoTime();
        System.out.println("Finding LAST element of the HashMap has lasted: " + (end - begin) + "ns");

        System.out.println("FINAL SIZE: " + whouse.size());
    }
}