package PersonalStuff;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class taskTester{
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner in = new Scanner(System.in);
        while (repeat){
            Task mainTask = new Task();
            System.out.println("What do you want to do: ");
            mainTask.toDos();
            int a;
            boolean c = true;
            while (c == true) {
                try{
                    
                    if(in.hasNextInt()){
                        if (in.hasNextInt()){
                            System.out.println("Use a valid value");
                        }
                        else{
                            c = false;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Use a valid value");
                }
                /* 
                String b = in.next();
                if (b == "1"){
                    a = 1;
                    c = false;
                }
                else if (b == "2"){
                    a = 2;
                    c = false;
                }
                else if (b == "3"){
                    a = 3;
                    c = false;
                }
                else if (b == "4"){
                    a = 4;
                    c = false;
                }
                else {
                    System.out.println("Please enter a valid number");
                }
                */
            }




            
            System.out.println("Yes");

            
            System.out.print("Do you want to continue? (Y/N)");
            String answer = in.next();
            if (answer.equals("N") || answer.equals("n")) {
                repeat = false;
            }




        }
        
    }
}

