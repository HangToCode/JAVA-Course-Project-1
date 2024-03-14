//Name: Li Hang Biao
//Lab: 11A


import java.awt.*;
import javax.swing.JFrame;

public class WordGui {
	
	public static void wordGui(String Name, String [] array, int size) {
		String word; // Use to hold a single word
		char letter; // Use to store the first letter of the word
		
		//Setting up the Gui
	    JFrame textBox = new JFrame();
		textBox.setTitle(Name);
		textBox.setSize(500,400);
		textBox.setLocation(500,200);
		textBox.setLayout(new GridLayout(2,3));
		textBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		//Set up textboxs
	    Container content = textBox.getContentPane();
	    TextArea box1 = new TextArea(); TextArea box2 = new TextArea();
	    TextArea box3 = new TextArea(); TextArea box4 = new TextArea();
	    TextArea box5 = new TextArea(); TextArea box6 = new TextArea();
	    
	    //Put textbox in the Gui
        content.add(box1); content.add(box2); content.add(box3);
        content.add(box4); content.add(box5); content.add(box6);
        
        // Set up AEIOU rule for the GUi
        for (int i = 0; i < size; i++) {
        	word = array[i]; //single word extract from the array
        	letter = word.charAt(0); // the first letter extract from the single word
        	
        	if (letter ==  'a' || letter == 'A') box1.append(array[i] + "\n");
        	else if (letter == 'e' || letter == 'E')  box2.append(array[i] + "\n");
        	else if (letter == 'i' || letter == 'I')  box3.append(array[i] + "\n");
        	else if (letter == 'o' || letter == 'O')  box4.append(array[i] + "\n");
        	else if (letter == 'u' || letter == 'U')  box5.append(array[i] + "\n");
        	else box6.append(array[i] + "\n"); //The rest of the words

        }
       
	    textBox.setVisible(true); // Allow user to see the GUI

	
	}

}
