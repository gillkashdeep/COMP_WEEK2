import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Read input user
        Scanner input = new Scanner(System.in);
        //Create an  instance of Account
        Account myAccount = new Account();

        // Display the default account info.
        System.out.printf("initial name is: %s%n%n",myAccount.getName());

        //Prompt the user for an account name
        System.out.println("please an account name: ");
        String accName = input.nextLine();//reakad input and save to accName
        myAccount.setName(accName);
        System.out.println();


        System.out.printf("Name of myAccount is: %s%n",myAccount.getName());
    }
}
