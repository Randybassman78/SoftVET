import java.io.*;
import java.util.*;



public class Test {



    public static void main(String[] args) {
        // generate some simple output

		
	System.out.println(Utils.header("Products"));
    // Leer el argumento de entrada
	
     String indice=args[0];
     System.out.println("Indice: "+ indice);
	 int index= Integer.parseInt(indice);
	 System.out.println("<pre>");
	 Vector<ProductDataMockup> productList = ProductDataMockup.getProductList();
     ProductDataMockup product = productList.elementAt(index);
	 
		
		System.out.println("Product id: " + product.productId ); 
		System.out.println("Product name: " + product.productName ); 
		System.out.println("Company name: " + product.companyName );
 		
		System.out.println("Product unit price: " + product.unitPrice ); 
		
		System.out.println("</pre>");
		
		
		//Utils.footer("Products");
    }
}

     
