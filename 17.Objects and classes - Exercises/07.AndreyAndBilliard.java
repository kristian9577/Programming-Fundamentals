
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;

public class AndreyAndBilliard {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int entities = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, BigDecimal> products = new LinkedHashMap<>();
        for (int i = 0; i < entities; i++) {
            String[] entitiesTokens = reader.readLine().split("-");
            products.putIfAbsent(entitiesTokens[0], new BigDecimal(entitiesTokens[1]));
            if (products.containsKey(entitiesTokens[0])) {
                BigDecimal bigdec = new BigDecimal(entitiesTokens[1]);
//               if ((bigdec.compareTo(products.get(entitiesTokens[0])))==1){
                products.put(entitiesTokens[0], bigdec);
//               }
            }
        }
        List<Customer> customers = new ArrayList<>();
        String inputOfPeopleAndOrders = reader.readLine();
        List<String> names = new LinkedList<>();
        while (!inputOfPeopleAndOrders.equals("end of clients")) {
            String[] peopleOrders = inputOfPeopleAndOrders.split("[-,]");
            if (products.containsKey(peopleOrders[1])) {
                Customer customer = new Customer();
                if (names.contains(peopleOrders[0])) {
                    if (customers.get(names.indexOf(peopleOrders[0])).boughtProducts.containsKey(peopleOrders[1])) {
                        customers.get(names.indexOf(peopleOrders[0])).boughtProducts.put(peopleOrders[1], customers.get(names.indexOf(peopleOrders[0])).boughtProducts.get(peopleOrders[1]) + Integer.parseInt(peopleOrders[2]));
                        customers.get(names.indexOf(peopleOrders[0])).Bill=customers.get(names.indexOf(peopleOrders[0])).Bill.add(products.get(peopleOrders[1]).multiply(new BigDecimal(Integer.parseInt(peopleOrders[2]))));
                    }
                    else{
                        customers.get(names.indexOf(peopleOrders[0])).boughtProducts.putIfAbsent(peopleOrders[1], Integer.parseInt(peopleOrders[2]));
                        customers.get(names.indexOf(peopleOrders[0])).Bill=customers.get(names.indexOf(peopleOrders[0])).Bill.add(products.get(peopleOrders[1]).multiply(new BigDecimal(Integer.parseInt(peopleOrders[2]))));
                    }


                    inputOfPeopleAndOrders = reader.readLine();
                    continue;

                }
                customer.Name = peopleOrders[0];
                customer.boughtProducts = new LinkedHashMap<>();
                customer.boughtProducts.put(peopleOrders[1], Integer.parseInt(peopleOrders[2]));
                customer.Bill = (products.get(peopleOrders[1]).multiply(new BigDecimal(Integer.parseInt(peopleOrders[2]))));
                customers.add(customer);
                names.add(peopleOrders[0]);

            }
            inputOfPeopleAndOrders = reader.readLine();
        }

        customers.sort((c1, c2) ->
                c1.Name.compareTo(c2.Name));
        BigDecimal sum = new BigDecimal(0);
        for (Customer customer : customers) {
            System.out.println(customer.Name);

            customer.boughtProducts.entrySet().stream().forEach(cust -> {
                System.out.print("-- " + cust.getKey() + " - " + cust.getValue());
                System.out.println();
            });
            System.out.printf("Bill: %.2f\n", customer.Bill);
            sum = sum.add(customer.Bill);
        }
        System.out.println("Total bill: " + sum);
    }
}

class Customer {
    public String Name;
    public LinkedHashMap<String, Integer> boughtProducts;
    public BigDecimal Bill;
}