/**
 * MadLib Class is a phrasal template game
 * where one player prompt others for a list 
 * of words to complete a story 
 * it has inputWord() method which ask user for list of words
 * displayWord() method which display the story filled with the list of user`s word
 * CapitalFirstLetter() method is converting first letter capital in the string that the user enters. 
 * @author Nouran Nouh 
 *@version 1.0
 *@since 2019-09-25 CST8110 Introduction to computer programming  
 */

import java.util. *; 

public class MadLib { 
	
	private String childToy; //child toy 
	
	private String noun; //  first noun
	
	private String adj; //adjective 
	
	private String noun2; // second noun  
	
	private String nounPlural; // noun plural
	
	private String noun2Plural; // second noun plural
	
	private String verb; // verb ends with s
	
	private String name; //name  
	
	private String color; //color

	private String place; //country
	
	private String feeling; // feeling 
	
	
	
	// Scanner takes the input from the user 
	Scanner scan= new Scanner(System.in); 
	
	//default constructor, initialize instance variable to empty string   
	public MadLib() {
		
		childToy=" ";  
		
		noun=" "; 
		 
		 adj=" "; 
		 
		 nounPlural=" ";
		 
		 verb=" "; 
		 
		 name=" "; 
		 
		 noun2=" "; 
		 
		 noun2Plural=" "; 
		 
		 color=" ";
		 
		 place=" "; 
		 		
	}//end of constructor 
	
	
	//method inputWord, ask user for a list of words
	public void inputWord() {
		
		System.out.println("Please enter noun: ");
		noun=scan.nextLine(); 
		
		System.out.println("Please enter child toy: ");
		childToy=scan.nextLine(); 
		
		System.out.println("Please enter your feeling: ");
		feeling=scan.nextLine();
		
		System.out.println("Please enter a Name : " );
		name=scan.nextLine();
		
		System.out.println("Please enter a place : ");
		place=scan.nextLine(); 
		
		System.out.println("Please enter verb ending in 's' : ");
		verb=scan.nextLine();
		
		System.out.println("Please enter an adjective: ");
		adj=scan.nextLine(); 
		
		System.out.println("please Enter color: "); 
		color=scan.nextLine(); 
		
		System.out.println("Please enter noun : ");
		noun2=scan.nextLine();
		
		System.out.println("Please enter noun(plural): ");
		nounPlural=scan.nextLine(); 
		
		System.out.println("Please enter noun(plural):" );
		noun2Plural=scan.nextLine();  
		
	}// end method inputWord()
	
	
	//capitalFirstLetter method make first 
	//letter in the string Capital 
	
	public void capitalFirstLetter () {
		
		 noun=noun.substring(0,1).toUpperCase() 
				 + noun.substring(1).toLowerCase(); 
		
		childToy=childToy.substring(0,1).toUpperCase()
				 + childToy.substring(1).toLowerCase(); 
		
		adj=adj.substring(0,1).toUpperCase()
				  + adj.substring(1).toLowerCase(); 
		 
		 nounPlural=nounPlural.substring(0,1).toUpperCase()
				 + nounPlural.substring(1).toLowerCase(); 
		 
		 verb=verb.substring(0,1).toUpperCase()
				 + verb.substring(1).toLowerCase(); 
		 
		 name= name.substring(0,1).toUpperCase()
				 + name.substring(1).toLowerCase(); 
		 
		 noun2= noun2.substring(0,1).toUpperCase()
				 + noun2.substring(1).toLowerCase(); 
		 
		 noun2Plural= noun2Plural.substring(0,1).toUpperCase()
				 + noun2Plural.substring(1).toLowerCase(); 
		 
		 feeling= feeling.substring(0,1).toUpperCase()
				 + feeling.substring(1).toLowerCase(); 
		 
		 place= place.substring(0,1).toUpperCase()
				 + place.substring(1).toLowerCase(); 
		 
		 color=color.substring(0,1).toUpperCase()
				 + color.substring(1).toLowerCase(); 
	 
		
	}//end of CapitalLetter method 
	
	
	//display the story with missing words
	public void displayWord() {
		
		//make first letter capital and call the method capitalFirstLetter()  
		capitalFirstLetter();  
		
		//display formatted list of words with story 
		System.out.println("\n my sister name is " +noun+ " she likes to play with a " + childToy 
				+" she feels " + feeling+ " with her new toy," 
				+ " she named her new toy " + name);
		
		System.out.println (" in " +place+ " she  "+verb + " and plays with her classmates. " +
		"The weather is, "+ adj+ " she wears a floury " +color 
				+ " dress " );
		
		System.out.println(" it is her friend birthday, she went to the  "
					+noun2+ " there are lots of "+ nounPlural+
				 " and she ate a lot of "+ noun2Plural); 
		
		
		System.out.println(" \nThank you for playing MadLib with me!");
		
		
	}// end of display 
	
	
	
	//test program
	public static void main(String [] args) {
		
		//new object of class 
		MadLib madLib1=new MadLib(); 
		
		//ask for input
		madLib1.inputWord();
		
		//display output
		madLib1.displayWord(); 
}
}