import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookLibraryModification {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Library library=new Library();
        library.Books=new ArrayList<>();
        int n=Integer.parseInt(reader.readLine());

        for (int i = 0; i <n ; i++) {
            Bookk bookk=new Bookk();
            String[] bookTokens=reader.readLine().split("\\s+");
            bookk.Title=bookTokens[0];
            bookk.Author=bookTokens[1];
            bookk.Publisher=bookTokens[2];
            bookk.ReleaseDate=new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).parse(bookTokens[3]);
            bookk.ISBN=bookTokens[4];
            bookk.Price= new BigDecimal(bookTokens[5]);
            library.Books.add(bookk);
        }
        Date givenDate=new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).parse(reader.readLine());

        LinkedHashMap<String,Date> titles=new LinkedHashMap<>();
        for(Bookk book : library.Books)
        {
            if(book.ReleaseDate.compareTo(givenDate)>0)
            {
                titles.put(book.Title,book.ReleaseDate);
            }
        }

        titles.entrySet().stream()
                .sorted((c1, c2) -> {
                    int res=c1.getValue().compareTo(c2.getValue());
                    if (res == 0) {
                        res=c1.getKey().compareTo(c2.getKey());
                    }
                    return res;
                })
                .forEach(title -> {
                    System.out.println(title.getKey()+" -> " +new SimpleDateFormat("dd.MM.yyyy").format(title.getValue()));

                });
    }
}
