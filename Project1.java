//Name: Li Hang Biao
//Lab: 11A

public class Project1 extends WordGui {
	   static TextFileInput words;
	   static String name = "src/input.txt"; //Store the name of the file

	public static void main(String [] args) {
		
		//String name = args[0]; //"src/input.txt" being pass to the argument
		TextFileInput content = new TextFileInput(name);
		String line; // Use to record word from the file
		
		int arraySize = 72; //input.txt length 
		String [] words = new String[arraySize];
		
	    
		// Transfer all word from input to word array
	    for (int i = 0; i < arraySize; i++) {	
	    	line = content.readLine();	
	    	words[i] = line;	 
	    }

		
	    String title = "Project 1";
	    wordGui(title,words,arraySize);


	}
}

