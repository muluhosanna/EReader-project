package com.ereader.classes;

import java.util.ArrayList;

public class ProjectSampleReceipt {
    private float total = 0.0f;
    ArrayList<EReaderInterface> cartList;

    public ProjectSampleReceipt(ArrayList<EReaderInterface> eReaderList) {
        cartList = eReaderList;
        showTitle();
        showColumnHeader();
        showCart();
    }
    private void showTitle() {
        String company = String.format("%30s", "Retail Application");
        String address = String.format("%33s", "1401 Main st,city, St, zip");
        String phone = String.format("%27s", "(000)-000-0000");
        System.out.println(company.toUpperCase());
       // System.out.println(company);
        System.out.println(address);
        System.out.println(phone);
        showStars();
        String cash = String.format("%25s", "MONEY RECEIPT");
        System.out.println(cash);
        showStars();
    }

    private void showColumnHeader() {
        String price = String.format("%23s |", "price");
        System.out.print("|Description |");
        System.out.println(price);
    }

    private void showCart() {
        float total = 0.0f;
        float ship = 15.85f;
        for (EReaderInterface eReader : cartList) {
            System.out.println(eReader);
            System.out.println();
            total += eReader.getPrice();
        }
            showStars();
            System.out.print("Sub Total");
            System.out.printf("%31s%n", "$" + total);
            System.out.print("Shipping cost");
            System.out.printf("%27s%n", "$" + ship);
            System.out.print("Total");
            float totalTax = total + ship;
            System.out.printf("%35s%n", "$" + totalTax);




    }

    private void showStars() {
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


}
