package Controller;

import Model.Products;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Klopp
 */
    
public class Shopping {
    
    
    int counter = 0;
    Products[] ProductArr = new Products[4];
    public Products[] ShoppingProducts() {
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
                ProductPrice =  Integer.parseInt(InLine.next());
                ProductDescription = InLine.next();
                ProductArr[counter] = new Products(ProductID,ProductName,ProductPrice,ProductDescription);
                counter++;  
            }
                
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        }
        return ProductArr;
        
    }  

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < counter; i++) {
            temp = temp + ProductArr[i] + " ";
        }
        return temp;
    }
    
}

    

