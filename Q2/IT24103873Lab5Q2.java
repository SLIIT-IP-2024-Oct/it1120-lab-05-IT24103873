import java.util.Scanner;
 public class IT24103873Lab5Q2{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of new memeber introduced: ");
        int newmember = scan.nextInt();

        if(newmember < 0){
            System.out.println("Input must be number 0 or grater");
        }
        else{
            String price;
            switch(newmember){
                case 0:
                price = "No Prize";
                break;
               case 1:
                price = "Pen";
                break;
                case 2:
                price = "Umbrella";
                break;
                case 3:
                price = "Bag";
                break;
                case 4:
                price = "Travelling Chair";
                break;
                default:
                price = "HeadPhone"; 
            }
            System.out.println("price is : " + price);
        }
    }
 }