import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class СръбскоUnleashed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> shop = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("-");
            shop.put(input[0], Double.parseDouble(input[1]));
        }

        List<Customer2> allCustomers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of clients")) {
                break;
            }

            String[] data = input.split("[-,]");
            String name = data[0];
            String product = data[1];
            int quantity = Integer.parseInt(data[2]);

            if (!shop.containsKey(product)) {
                continue;
            }

            Customer2 client = allCustomers.stream().filter(s -> s.getName().equals(name)).findFirst()
                    .orElse(Customer2.DEFAULT);

            if (client == null) {
                Customer2 newClient = new Customer2(name);
                newClient.getShopList().put(product, quantity);
                allCustomers.add(newClient);
            } else {
                if (client.getShopList().containsKey(product) == false) {
                    client.getShopList().put(product, quantity);
                } else {
                    int temp = client.getShopList().get(product);
                    client.getShopList().put(product, quantity + temp);
                }
            }
        }

        final double[] total = {0};

        allCustomers
                .stream()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(client -> {
                    System.out.println(client.getName());
                    double bill = 0;

                    for (Map.Entry<String, Integer> order : client.getShopList().entrySet()) {
                        String productName = order.getKey();
                        int quantity = order.getValue();
                        double price = shop.get(productName);

                        System.out.printf("-- %s - %d%n", productName, quantity);
                        bill += quantity * price;
                    }
                    total[0] += bill;
                    System.out.printf("Bill: %.2f%n", bill);
                });
        System.out.printf("Total bill: %.2f%n", total[0]);
    }
}

class Customer2 {
    public static final Customer2 DEFAULT = null;
    private String name;
    private TreeMap<String, Integer> shopList;

    public Customer2(String name) {
        this.name = name;
        this.shopList = new TreeMap<String, Integer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeMap<String, Integer> getShopList() {
        return shopList;
    }

    public void setShopList(TreeMap<String, Integer> shopList) {
        this.shopList = shopList;
    }
}