public class Holiday
{
// attributes/ instance variables
private String name;
private String month;
private int day;

//constructor 
// have to declare each one differently
// give initial value 
public Holiday(String n, String m, int d)
{
name = n;
day = d;
month = m;
}
//setter for day attribute
public void setDay(int d)// could also be (int day)
{
day = d;
//this.day= day;
}
// getter returns value
public int getDay()
{
return day;
}

public double avgDay(Holiday [] dates)
{
double sum = 0;// accumulator
// one of them need to be a double because int/ int would equal an int
//for (int i = 0; i < date.length; i++)
//{
//sum += dates[i].day;
// sum+= dates[i].getDay(); allow us to access method or field in that class
//}

for (Holiday holi : dates)
{
sum += holi.day;
}
return sum / dates.length;
}



}