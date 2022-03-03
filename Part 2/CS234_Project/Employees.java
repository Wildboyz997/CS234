package CS234_Project;

import java.util.Scanner;

public class Employees {

    public static void menu(){

        Scanner x = new Scanner(System.in);

        while(true){
            System.out.println("\nWhat would you like to do:");
            System.out.println("1. Add employee");
            System.out.println("2. List employees");
            System.out.println("3. Update employee");
            System.out.println("4. Remove employee");
            System.out.println("5. Go back");
            System.out.println("6. Quit");

            //This is for input validation
            int input;
            while(!x.hasNextInt()){
                System.out.println("invalid input, type a number between 1 and 6");
                x.next();
            }
            input = x.nextInt();

            switch(input) {
                case 1: //TODO: implement Employee.Create;
                    break;
                case 2: //TODO: implement Employee.Read;
                    break;
                case 3: //TODO: implement Employee.Update;
                    break;
                case 4: //TODO: implement Employee.Remove;
                    break;
                case 5: Main.menu();
                    break;
                case 6: System.exit(0);
                    break;
                case 7: default: System.out.println(
                        "You typed "+ input + "\ninvalid input \n Type a number between 1 and 5");
                    break;
            }
            System.out.println("\n----------------");
        }
    }
}
