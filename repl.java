//Question_20
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3,sum;
        
        System.out.println("Enter 3 numbers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        sum = num1+num2+num3;

        System.out.println("Sum of numbers: "+sum);
   
  }
}
//Question_21
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3,sum;
        
        System.out.println("Enter 3 numbers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        sum = num1+num2+num3;

        System.out.println("Sum of numbers: "+sum);

  }
}
//Question_22
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;

        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();

        totalPrice = price1+price2+price3;
        report = "Item1: "+item1+" Price: "+price1+", "+"Item2: "+item2+" Price: "+price2+", "+"Item3: "+item3+" Price: "+price3;
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);
  }
}
//Question_23
import java.util.Scanner ; 

public class Main {
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int areaCode, localNumber;

    areaCode = scan.nextInt();
    localNumber = scan.nextInt();
    String phoneNumber = "("+areaCode+")"+"-"+localNumber;
    System.out.println("Calling number "+phoneNumber);
    
  }
}
//Question_24
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
        String firstName, lastName, fullName, email, street, state,
                city, address, contacts;
        int age, zipcode;
        double height, weight;
        boolean isMarried ;
        long workPhoneNumber, personalPhoneNumber;

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println();
        System.out.println("Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
        lastName = scan.next();

        System.out.println("Enter your e-mail");
        email = scan.next();

        System.out.println("Enter your street");
        street = scan.next();

        System.out.println("Enter your city");
        city = scan.next();

        System.out.println("Enter your state");
        state = scan.next();

        System.out.println("Enter your zipcode");
        zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height = scan.nextDouble();;

        System.out.println("Enter your weight");
        weight = scan.nextDouble();

        System.out.println("Are you married");
        isMarried = scan.nextBoolean();

        String contactTerminal = "work phone number - "+workPhoneNumber+", "+"personal phone number - "+
                            personalPhoneNumber+", "+"email: "+email;
        String fullNameTerminal = "Full name: "+firstName+", "+lastName;
        String adressTerminal = "Adress: "+street+", "+city+", "+state+", "+zipcode;

        System.out.println("Patient personal information");
        System.out.println(fullNameTerminal);
        System.out.println(adressTerminal);
        System.out.println(contactTerminal);
        System.out.println("Age: "+age+"\n"+ "Height: "+height+"\n"+ "Weight: "+weight+"\n" +"Married ?: "+isMarried);

  }
}
//Question_25
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    
 if (a > b){
            System.out.println(a+" is greater");
        }else {
            System.out.println(b+" is greater");
        }

  }
}
//Question_26
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

     if (num < 0 ){
            System.out.println("negative");
        }else if (num >0){
            System.out.println("positive");
        }else{
            System.out.println("zero");
        }
   
  }
}
//Question_27
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     String subject1, subject2, subject3, subject4, subject5, summary;
        double grade1, grade2, grade3, grade4, grade5, average;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1 = scan.next(); grade1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2 = scan.next(); grade2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3 = scan.next(); grade3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        subject4 = scan.next(); grade4 = scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        subject5 = scan.next(); grade5 = scan.nextDouble();

        String total = "Summary: "+ subject1+" - "+grade1+", "+ subject2+" - "+grade2+", "
                + subject3+" - "+grade3+", "+ subject4+" - "+grade4+", "+ subject5+" - "+grade5;
        average = (grade1+grade2+grade3+grade4+grade5)/5;
        
        System.out.println(total);

        System.out.println("Your average score is: "+average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
  }
}
//Question_28
import java.util.*;

class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE
    
    Scanner scan = new Scanner(System.in);
       int day = scan.nextInt();
       
       if (day == 1){
           System.out.println("It's a Monday!");
       }else if(day == 2){
           System.out.println("It's a Tuesday!");
       }else if(day == 3){
           System.out.println("It's a Wednesday!");
       }else if(day == 4){
           System.out.println("It's a Thursday!");
       }else if(day == 5){
           System.out.println("It's a Friday!");
       }else if(day == 6){
           System.out.println("It's a Saturday!");
       }else if (day == 7){
           System.out.println("It's a sunday!");
       }else{
           System.out.println("There is no such a day!");
       }
    
  }
}
//Question_29
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
       double version = scan.nextDouble();

       if (version == 1.5){
           System.out.println("Cupcake");
       }else if(version == 1.6){
           System.out.println("Donut");
       }else if(version == 2.1){
           System.out.println("Eclair");
       }else if(version == 2.2){
           System.out.println("Froyo");
       }else if(version == 2.3){
           System.out.println("Gingerbread");
       }else if(version == 3.1){
           System.out.println("Honeycomb");
       }else if (version == 4.0){
           System.out.println("Ice Cream Sandwich");
       }else if(version >= 4.1 && version<=4.31 ){
           System.out.println("Jelly Bean");
       }else if(version >= 4.4 && version<= 4.44){
           System.out.println("KitKat");
       }else if(version >= 5.0 && version<= 5.11){
           System.out.println("Lollipop");
       }else if(version >= 8.0 && version<= 8.1){
           System.out.println("Oreo");
       }else if(version == 9.0){
           System.out.println("Pie");
       }else{
           System.out.println("Sorry, I don't know this version!");
       }
    
  }
}
//Question_30
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);

      String item1, item2, item3, report;
      double price1, price2, price3, totalPrice;
      int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        if (count1 == 0){
            report =("Item2: "+item2+" Price: "+(count2*price2)+", "+
                    "Item3: "+item3+" Price: "+(count3*price3));
            
            totalPrice = (count2*price2) + (count3*price3);
            System.out.println(report);
            System.out.println("Total price: "+totalPrice);

        }else if(count2 == 0){
           report = ("Item1: "+item1+" Price: "+(count1*price1)+", "+
                    "Item3: "+item3+" Price: "+(count3*price3));
           
            System.out.println(report);
            totalPrice = (count1*price1) + (count3*price3);
            System.out.println("Total price: "+totalPrice);

        }else if(count3 == 0){
            report = ("Item1: "+item1+" Price: "+(count1*price1)+", "+
                    "Item2: "+item2+" Price: "+(count2*price2));
            System.out.println(report);
            totalPrice = (count1*price1) + (count2*price2);
            System.out.println("Total price: "+totalPrice);
        }else{
            System.out.println("SOMETHING WENT WRONG");
        }
    
    
  }
}
