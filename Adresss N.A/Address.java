import java.util.ArrayList;
public class Address
{
private String houseNumber, street, city, state , aptNumber;
private int zip;

public Address( String houseNumber, String street, String city, String state , String aptNumber,int zip)
{
// houseNumber = houseNumber; 
// value will be null so you need to put this. easier to keep track
// dont need getter and setters
this.houseNumber = houseNumber;
this.street = street;
this.city = city;
this.state = state;
this.aptNumber = aptNumber;
this.zip = zip;
   }
   public Address( String houseNumber, String street, String city, String state , int zip)
{
this(houseNumber, street, city, state," ", zip); // instead of null we put aptnumber as " "or you can just leave it blank
   
   }
 
public boolean comesBefore(Address other){
// COMPARE ZIPCODE
// Address b = new Address(PARAMETER); TO COMpare zipcode to Address A = new Address (PARAMETER)
/*if( other.zip < this.zip)// comparing the other zip to this.zip from the other constructor 
{ 
before = true;
}
else {
before = false;
}
return before;
   }
   the one below is the shortcut of this code
*/
return other.zip < this.zip;  

}
public String toString() // dont have parameter toString method defines String representation of an object
{
String str = houseNumber + " " + street + " " + aptNumber +  "\n" + city + "," + " " +zip;
return str;

// or you can just return houseNumber + " " + street + " " + aptNumber +  "\n" + city + "," + " " +zip;
//p
   }//convert to string so you wont get Adress@6d06d69c
}

class AddressDriver
{
public static void main(String[] args)
{
Address b = new Address("2000" , "Clayton State Blvd", "Morrow", "Georgia", 30297);
System.out.println(b);
// toString method called when object concatenated to String
String words = "mY SCHOOL IS AT" +b;
System.out.println(words);
ArrayList<Address> addressList = new ArrayList<>();
addressList.add(b);
Address a = new Address("200", "Clayton State Blvd" , "Morrow", "Goergia", "747", 30260);
addressList.add(a);
addressList.add(new Address("221b", "Baker St." , "New York City", "NY", 10764));
// just adding to the ArrayList
for( Address addr: addressList)
{
System.out.println(addr);
}
}
}



