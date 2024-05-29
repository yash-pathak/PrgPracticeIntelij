package Basic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product product = new Product("1","jeans",50);
        Product product1 = new Product("2","shirt",100);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);

        System.out.println(productList);
        productList.stream().filter(prod->prod.getProductCode().equals("1")).forEach(prod->prod.setProductPrice(1200));

        System.out.println(productList);

    }




}
