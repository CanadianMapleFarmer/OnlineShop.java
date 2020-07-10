//Gerhard Kloppers
package Controller;

import Model.Products;
import Model.Books;
import Model.DigitalItems;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    int counter = 0;
    ArrayList<Products> ProductArr = new ArrayList<>();

    public ArrayList<Products> ShoppingProducts() {
        try {
            File scFile = new File("Product list.txt");
            String ProductID;
            String ProductName;
            String ProductDescription;
            int ProductPrice;
            String Line = "";
            String PrintLine;

            Scanner scLine = new Scanner(scFile);
            while (scLine.hasNext()) {
                Line = scLine.nextLine();
                Scanner InLine = new Scanner(Line).useDelimiter("#");
                ProductID = InLine.next();
                ProductName = InLine.next();
                ProductPrice = Integer.parseInt(InLine.next());
                ProductDescription = InLine.next();
                ProductArr.add(new Products(ProductID, ProductName, ProductPrice, ProductDescription));
                counter++;
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return ProductArr;
    }

    ArrayList<Books> BookArr = new ArrayList<>();

    public ArrayList<Books> ShoppingBooks() {
        try {
            File scFile = new File("BookList.txt");
            String BookID;
            String BookName;
            String BookDescription;
            int BookPrice;
            String Line = "";
            String PrintLine;

            Scanner scLine = new Scanner(scFile);
            while (scLine.hasNext()) {
                Line = scLine.nextLine();
                Scanner InLine = new Scanner(Line).useDelimiter("#");
                BookID = InLine.next();
                BookName = InLine.next();
                BookPrice = Integer.parseInt(InLine.next());
                BookDescription = InLine.next();
                BookArr.add(new Books(BookID, BookName, BookPrice, BookDescription));
                counter++;
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return BookArr;
    }

    ArrayList<DigitalItems> DigitalItemsArr = new ArrayList<>();

    public ArrayList<DigitalItems> ShoppingDigitalItems() {
        try {
            File scFile = new File("DigitalItems.txt");
            String DigitalItemID;
            String DigitalItemName;
            String DigitalItemDescription;
            int DigitalItemPrice;
            String Line = "";
            String PrintLine;

            Scanner scLine = new Scanner(scFile);
            while (scLine.hasNext()) {
                Line = scLine.nextLine();
                Scanner InLine = new Scanner(Line).useDelimiter("#");
                DigitalItemID = InLine.next();
                DigitalItemName = InLine.next();
                DigitalItemPrice = Integer.parseInt(InLine.next());
                DigitalItemDescription = InLine.next();
                DigitalItemsArr.add(new DigitalItems(DigitalItemID, DigitalItemName, DigitalItemPrice, DigitalItemDescription));
                counter++;
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return DigitalItemsArr;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < counter; i++) {
            temp = temp + ProductArr.get(i) + " ";
        }
        return temp;
    }

}
