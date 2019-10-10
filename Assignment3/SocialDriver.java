import java.util.Scanner;

public class SocialDriver{
public static void main(String [] args){
try{
Scanner console = new Scanner(System.in);
System.out.print("Enter a social security number:");
String ssn;
ssn = console.nextLine(); //prompt user input to enter ssn
if(isValidSocial(ssn)) // if social is valid than give message and end
System.out.print("That SSN meets all the criteria!");
}catch(SocialSecurityError error){
System.out.print(error);// if social is wrong give exception message
}
}

public static boolean isValidSocial(String ssn)throws SocialSecurityError{ //method to throw exception to check ssn

String [] s = ssn.split("-"); // split at the dash to make 3 arrays

if (s[0].length()!=3||s[1].length()!=2||s[2].length()!=4)// if array length is not 3 in the first array, 2 in the second array, and 4 in the third array give exception error
{
throw new SocialSecurityError();
}
else if(ssn.charAt(3) != '-' ||ssn.charAt(6) != '-' )// if social security doesn't have dash at the third place and sixth place at char. Give exception message
{
throw new SocialSecurityError();
}
else if (Character.isDigit(s[0].charAt(0)) == false || Character.isDigit(s[0].charAt(1)) == false || Character.isDigit(s[0].charAt(2)) == false // check each number to make sure that they are digits
|| Character.isDigit(s[1].charAt(0)) == false || Character.isDigit(s[1].charAt(1)) == false// check each number to make sure that they are digits 
|| Character.isDigit(s[2].charAt(0)) == false || Character.isDigit(s[2].charAt(1)) == false || Character.isDigit(s[2].charAt(2)) == false || Character.isDigit(s[2].charAt(3)) == false)// check each number to make sure that they are digits
{
throw new SocialSecurityError(); // throw exception if not digit
}
return true; //return true if all the if and else if is true to give exception error
}
}
