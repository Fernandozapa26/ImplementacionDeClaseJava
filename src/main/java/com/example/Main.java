package main.java.com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId("2611");
        product1.setName("Susy");
        product1.setPrice(1200.0);
        product1.setStock(50);

        System.out.println(product1.toString());
        System.out.println("El nombre del  producto es: " + product1.getName() );
        System.out.println("El precio del  producto es: " + product1.getPrice() );


        Product product2 = new Product();
        product2.setName("Samara");
        product2.setId("0520");
        product2.setStock(50);
        product2.setPrice(1800.0);

        System.out.println("El precio del  producto es: " + product2.getPrice() );
        System.out.println("El stock es: " + product2.getStock() );

    }
}