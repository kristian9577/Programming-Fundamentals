import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookLibrary {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Library library = new Library();
        library.Books = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            Bookk bookk = new Bookk();
            String[] bookTokens = reader.readLine().split("\\s+");
            bookk.Title = bookTokens[0];
            bookk.Author = bookTokens[1];
            bookk.Publisher = bookTokens[2];
            bookk.ReleaseDate = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).parse(bookTokens[3]);
            bookk.ISBN = bookTokens[4];
            bookk.Price = new BigDecimal(bookTokens[5]);
            library.Books.add(bookk);
        }

        LinkedHashMap<String, BigDecimal> authors = new LinkedHashMap<>();
        for (Bookk book : library.Books) {
            if (authors.containsKey(book.Author)) {
                authors.put(book.Author, authors.get(book.Author).add(book.Price));
            } else {
                authors.put(book.Author, book.Price);
            }
        }

        authors.entrySet().stream()
                .sorted((c1, c2) -> {
                    int res = c2.getValue().compareTo(c1.getValue());
                    if (res == 0) {
                        res = c1.getKey().compareTo(c2.getKey());
                    }
                    return res;
                })
                .forEach(author -> {
                    System.out.println(author.getKey() + " -> " + String.format("%.2f", author.getValue()));
                });
    }
}

class Bookk {
    public String Title;
    public String Author;
    public String Publisher;
    public Date ReleaseDate;
    public String ISBN;
    public BigDecimal Price;

}

class Library {
    public String Name;
    public List<Bookk> Books;


}