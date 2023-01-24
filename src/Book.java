import java.util.ArrayList;
import java.util.Scanner;
public class Book {
    //Attributes
    String name = "";
    Auther auther;
    double price = 0;
    int qty = 0;
    //Constructor
    public Book(){
        printer();
    }
    //Methods
     public String getName(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Vad är bokens namn? ");
         name = scanner.nextLine();
         return name;
     }
     public Auther getAuther(){
         Auther newAuther = new Auther();
         newAuther.print(newAuther.name, newAuther.email, newAuther.gender);
         return auther;
     }
     public double getPrice(){
         price = 200;
         return price;
     }
     public void setPrice(){
         System.out.println("Hur mycket ska boken kosta?");
         Scanner scanner = new Scanner(System.in);
         price = scanner.nextDouble();
     }
     public int getQty(){
        qty = 100;
         return qty;
     }
     public void setQty(){
         System.out.println("Hur många exemplar? ");
         Scanner scanner = new Scanner(System.in);
         qty = scanner.nextInt();
     }
     public String toString(){
         return toString();
     }
     public void printer(){
        for(int i = 0; i<=1; i++){
            getAuther();
            System.out.println("Författarens information: " + auther);
        }
        getName();
         getPrice();
         setPrice();
         getQty();
         setQty();
         printer();
         System.out.println("Bokens namn är " + name.toString());
         System.out.println("Priset är: " + price);
         System.out.println("Mängden är " + qty);

     }
    //Getters and setters
}
