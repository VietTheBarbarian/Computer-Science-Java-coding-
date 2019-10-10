import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class MessageDriver {

public static void main(String[] args) {
try {    
File file = new File("msg.txt");/** The file that need to be open */
Scanner input = new Scanner(file);/** To read the file */
while(input.hasNextLine()){
String line = input.nextLine();
String [] parts = line.split("\\|");/** text file contain "number|number|texts" where "|" need to be separated and turned into an array*/
int messageID = Integer.parseInt(parts[0]); /**we need make the messageID into an int so we can compare */
int parentID = Integer.parseInt(parts[1]);/**we need make the parentID into an int so we can compare */
Message m = new Message(messageID, parentID, parts[2]);/**we add the message to our object and check to see if it already exist. If it does than we replace it with a new message */
printFile(m);
}
}
/** exception is thrown when a file cannot be found or need to be name msg.txt so it can be read */
catch(IOException e ){
System.out.println("File is not found or need to be name msg.txt");
}
}
/** The printFile method is used to print out all the messages in the text file */
public static void printFile(Message file ){
ArrayList<Message> Messages = new ArrayList<>();/** Arraylist to add our files */
Messages.add(file);/** Adding the file to the arraylist to compare */
/** if parentId is equal than for each messages in the file we need to tabs
Than we print out the comment number and the text*/
if (file.getParentId() == file.getParentId()){;
for(Message w : Messages) {
for(int i =0 ;i< w.getParentId();i++) {
System.out.print("         ");
               }
System.out.println("Comment " +w.getMessageId() + "-" + w.getText());
}

}
}
}
