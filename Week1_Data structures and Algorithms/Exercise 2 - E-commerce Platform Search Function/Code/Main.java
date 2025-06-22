package com.ecommercesearch;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Headphones", "Electronics")
        };

       
        Product result1 = SearchEngine.linearSearch(products, "Phone");
        if (result1 != null) {
            System.out.println("Linear Search Result:");
            System.out.println(result1);
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        
        SearchEngine.sortProducts(products);
        Product result2 = SearchEngine.binarySearch(products, "Phone");
        if (result2 != null) {
            System.out.println("\nBinary Search Result:");
            System.out.println(result2);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
