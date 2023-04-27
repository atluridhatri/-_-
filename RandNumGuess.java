import java.util.*;
import java.util.concurrent.ThreadLocalRandom; 

public class RandNumGuess{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		System.out.println("Welcome to NUMBER GUESSING GAME!!!! ");
		System.out.println("Enter your name : ");
		String playName = sc.nextLine();
	
		System.out.println(playName+" now you have to guess the number in 7 chances" );

		int playScore = 0, compScore = 0;
		boolean flag = true;
		while(flag == true){
		    System.out.println("#####################################################################################");
		    	System.out.println("Hello "+playName+"\nEnter range ");	
		int min = sc.nextInt();
		int max = sc.nextInt();
		int compNum = ThreadLocalRandom.current() .nextInt(min, max + 1);
		
		    int chances = 6;
		    while(chances-- >0){
		        System.out.println(" Enter a number");
		int playNum = sc.nextInt();
		        if(playNum == compNum){
		            System.out.println(playName + " your guess is correct");
	playScore++;	            
	System.out.println("Player score = "+playScore+"\nComputer score = "+compScore);break;
	}
	else if(playNum < compNum){
		            System.out.println(playName + " Try again!your guess is low\n you have "+ chances +" more chances left");	 
		            }         
else {
		            System.out.println(playName + " Try again!your guess is high\n you have "+ chances +" more chances left");	 
		            } 	
}
if(chances <= 0){
		compScore++;
		System.out.println("Computer's choice : "+compNum);
		System.out.println("Computer won the game");
		}
		System.out.println(playName + " Do u want to continue ? (yes/no");
		sc.nextLine();
		String nw = sc.nextLine();
		System.out.println(nw);
		if(nw.equalsIgnoreCase("no")){
			flag = false;
				System.out.println("Player score = "+playScore+"\nComputer score = "+compScore);
if(playScore > compScore)
	System.out.println("Congratulations!!!!!!!!  "+playName +" you won the game");
	
	else
	    System.out.println("Sorry!!!!! "+playName +" you lost the game");
		}}		
	}
}