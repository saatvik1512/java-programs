import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter fruit");
        // String fruit = input.next();
        // switch (fruit) {
        //     case "apple":
        //     System.out.println("This is apple");
        //     break;
        //     case "mango":
        //     System.out.println("This is mango");
        //     break;
        //     case "orange":
        //     System.out.println("This is orange");
        //     break;
        //     case "grape":
        //     System.out.println("This is grape");
        //     break;
        //     default:
        //     System.out.println("enter valid fruit");
        // }

        int number = input.nextInt();
        switch(number){
            case 1:
            System.out.println("mr A");
            break;
            case 2:
            System.out.println("MR B");
            break;
            case 3:
            System.out.println("You are sus give more detail, Enter your name also");
            String name = input.next();
            switch (name) {
                case "Kunal":
                    System.out.println("Hello Kunal");
                    break;
                case "Zeus":
                    System.out.println("Hello Zeus");
                    break;
                case "Saatvik":
                    System.out.println("Hello Saatvik");
                    break;
                default:
                    System.out.println("Your are caught");
                    break;
            }
        }
        input.close();
    }
}
