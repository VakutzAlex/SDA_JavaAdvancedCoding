package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        //display all products
        Statement statement;

        {
            try {
                statement = DataBaseConnection.getConnection().createStatement();
                ResultSet productSet = statement.executeQuery("SELECT * FROM product");
                int rowsCount = statement.executeUpdate("insert into product (name, type, price, quantity) values ('Ivy', 'flower', 20.5, 100)");

                while (productSet.next()){
                    System.out.print("Product " + productSet.getString(2));
                    System.out.print(" with price " + productSet.getString(4));
                    System.out.println(" and quantity " + productSet.getString(5));
                }

                ResultSet mostExpensiveProduct = statement.executeQuery("Select * from product where price = (select max(price) from product)");
                mostExpensiveProduct.next();
                System.out.println("Most expensive product is " + mostExpensiveProduct.getString(2)
                        + " with a price of " + mostExpensiveProduct.getString(4));

                System.out.println("Row count = " + rowsCount);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void displayAllProductsFrom(String supplierName){
        try {
            Statement statement = DataBaseConnection.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("Select * from supplier join product on supplier.id = product.supplier_id" +
                    " join ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
