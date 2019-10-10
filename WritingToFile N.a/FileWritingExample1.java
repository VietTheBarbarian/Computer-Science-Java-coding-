/* chapter 4
steps when dealing w files
1. open a file create a connection
2. write to/ read from file
3.close the file. Sever connection. like word when you writing
Writing to a fie
filewriter- creates a connection to a file
print Writer- writing to file. Get to used familiar method
syso.printf allow to round number form two decimal places
both in java. io package
throws an exception
FileWriter("filename", true)
unless the file exist it overwrite anything in the file if the file already existed

reading from a file file created connection to file
scanner to read from a file
hasnext allow you to return more than one line              
homework each post has a method id parent id and text 
        
*/

import java.io.*;
public class FileWritingExample1
{
public static void main(String [] args)throws IOException
{
//open file
//always uses relative path when doing homework

FileWriter outFile = new FileWriter("phone.txt", true);// create connection first step

// write to file
PrintWriter writer = new PrintWriter(outFile); 
writer.println("");

// close the file

writer.close();


//create a text file of the println statement

}
}