import java.util.*;

public class Atm {
    static int balance = 10000, prev = 0;

    static void transactionHistory(){
        System.out.println("Previous Transcation : "+prev);
    }

	 static void checkBal(){
        System.out.println("Your Balance : "+balance);
    }

    static void withdraw(){
	  Scanner sc = new Scanner(System.in);    
        System.out.println("Enter amount : ");
        int amount = sc.nextInt();
        if(balance < amount)
            System.out.println("Insufficient balance");
        else{
            balance -= amount;
            System.out.println("Collect your cash");
        }

    }

    static void deposit(){
	  Scanner sc = new Scanner(System.in);    
        System.out.println("Enter amount : ");
        int amount = sc.nextInt();
            balance += amount;
            System.out.println(amount + " is successfully deposited");
    }

    static void transfer(){
	  Scanner sc = new Scanner(System.in);    
        System.out.println("Enter Account number of the person : ");
        int otherAccNum = sc.nextInt();
        System.out.println("Enter amount : ");
        int amount = sc.nextInt();
        if(balance < amount)
            System.out.println("Insufficient balance");
        else{
            balance -= amount;
            prev = amount;
            System.out.println("Transaction successful");
        }

    }
    	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter your name : ");
		String usrId = sc.nextLine();
        System.out.println("Enter your password : ");
		int usrPwd= sc.nextInt();
	
		    System.out.println("Choose Option :  ");	
            System.out.println(" 1.Transaction History \n 2.Withdraw \n 3.Deposit \n 4.Transfer \n 5.Quit");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : transactionHistory();
                         break;
                case 2 : withdraw();
                         break;
                case 3 : deposit();
                         break;
                case 4 : transfer();
                         break;
                case 5 : System.exit(0);
            }
		System.out.println(" Do u want to check your balance ? (yes/no)");
		sc.nextLine();
		String nw = sc.nextLine();
		System.out.println(nw);
		if(nw.equalsIgnoreCase("yes"))
			checkBal();
        

	}
}