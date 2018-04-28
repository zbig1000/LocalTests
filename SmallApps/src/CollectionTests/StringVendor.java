package CollectionTests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

class StringVendor {
    ArrayList<String> books = null;
    ArrayList<String> authors = null;
    Random randomGenerator = null;

    public StringVendor() {
        randomGenerator = new Random();

        books = new ArrayList<String>();

        books.add("50 shades of Grey");
        books.add("Sherlock Holmes");
        books.add("The Last Mohikan");
        books.add("The infinity");
        books.add("Better Call Soul");
        books.add("A Journey Into the Earth");
        books.add("Binary Death");
        books.add("Breaking Bad");
        books.add("50000 miles undersea journey");
        books.add("the Titanfall");
        books.add("Coma");
        books.add("People and Ants");
        books.add("To understand the Woman");
        books.add("Neverending Story");
        books.add("Book of Jungle");

        authors = new ArrayList<String>();

        authors.add("Joseph Conrad");
        authors.add("Henryk Sienkiewicz");
        authors.add("Ian Flemming");
        authors.add("Wladyslaw Reymont");
        authors.add("Jack London");
        authors.add("Umerto Eco");
        authors.add("Adam Mickiewicz");
        authors.add("Juliusz Slowacki");
        authors.add("Ignacy Krasicki");
        authors.add("Tadeusz Borowski");
        authors.add("Arthur Conan Doyle");
        authors.add("Mark Twain");
        authors.add("Ernest Hemingway");
        authors.add("Fyodor Dostoyewsky");
        authors.add("George Orwell");

    }
    public static void print(ArrayList<String> as){
        System.out.println("array size: " + as.size());
        Iterator it = as.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public String getRandomAuthor() {
        return authors.get(randomGenerator.nextInt(15)) ;
    }

    public String getRandomTitle() {
        return books.get(randomGenerator.nextInt(15)) ;
    }

    public int getRandomYear() {
        return (1600 + randomGenerator.nextInt(418)) ;
    }


}