package Controller;

import Model.Products;
import Model.Books;
import Model.DigitalItems;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Shopping class is the controller class of the project. Shopping class is
 * used to retrieve data from persistent storage (.txt) and assign that data to
 * the objects in the model package.
 *
 * @author Gerhard Kloppers
 * @version 1.15.0 8/12/2020
 * @see java.lang.System
*
 */
public class Shopping {

    /**
     * Shopping class uses ArrayList<> to make an Array to allow storage of
     * scanned data. This data is added using Arr.add and adding that data
     * through params to object characteristics using constructor.
     *
     * @param args Constructor in object classes.
     * @return Data from persistent storage, and assigns to object
     * characteristics.
     *
     *
     */
    int counter = 0;
    ArrayList<Products> ProductArr = new ArrayList<>();
//  ArrayList created too store data read by scanner from .txt file

    public ArrayList<Products> ShoppingProducts() {
//  Try Catch used to catch potential errors like Exceptions
        try {
            File scFile = new File("Product list.txt");
            String ProductID;
            String ProductName;
            String ProductDescription;
            int ProductPrice;
            String Line = "";
            String PrintLine;
//  Scanner created to scan .txt file
            Scanner scLine = new Scanner(scFile);
            while (scLine.hasNext()) {
                Line = scLine.nextLine();
                Scanner InLine = new Scanner(Line).useDelimiter("#");
                ProductID = InLine.next();
                ProductName = InLine.next();
                ProductPrice = Integer.parseInt(InLine.next());
                ProductDescription = InLine.next();
                ProductArr.add(new Products(ProductID, ProductName, ProductPrice, ProductDescription)); // Scanned items are added to the (Product)attribute characteristics
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
