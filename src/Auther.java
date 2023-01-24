import java.util.Scanner;
public class Auther {
    //Attributes
    String name = "";
    String email = "";
    char gender = ' ';
    //Constructor
    public Auther(){

    }
    //Methods
    public void print(String name, String email, char gender){
        System.out.println("Vad är författarens namn? ");
        Scanner scan1 = new Scanner(System.in);
        name = scan1.nextLine();
        System.out.println(name + "@gmail.com");
        gender = 'f';
    }
    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
