import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Magazine {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //1 2 3 4 5 6 7 8 9 10

        Map<String ,Product> products = new LinkedHashMap<>();

        while (true){
            String[] productInfo = reader.readLine().split(" ");
            if("stocked".equals(productInfo[0]))
                break;

            String productName = productInfo[0];
            double productPrice = Double.parseDouble(productInfo[1]);
            int productQuantity = Integer.parseInt(productInfo[2]);

            if(!products.containsKey(productName)){
                Product currentProduct = new Product(productName,productPrice,productQuantity);
                products.put(productName,currentProduct);
            }else {
                products.get(productName).setPrice(productPrice);
                products.get(productName).setQuantity(products.get(productName).getQuantity() + productQuantity);
            }
        }

        double totalPrice = 0;

        products.entrySet().stream()
                .sorted((product1,product2) -> {
                    int result = Integer.compare(product2.getValue().getQuantity(),product1.getValue().getQuantity());
                    if(result == 0){
                        return Double.compare(product1.getValue().getPrice(),product2.getValue().getPrice());
                    }
                    return result;
                })
                .forEach(product -> {
                    System.out.printf("%s: $%.2f * %d = $%.2f\n",product.getKey()
                            ,product.getValue().getPrice(),product.getValue().getQuantity()
                            ,product.getValue().getPrice()*product.getValue().getQuantity());
                });

        for (Product product : products.values()) {
            totalPrice += product.getPrice() * product.getQuantity();
        }

        System.out.printf("------------------------------\n" +
                "Grand Total: $%.2f\n",totalPrice);



    }

    public static class Product{

        public String name;
        public double price;
        public int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}