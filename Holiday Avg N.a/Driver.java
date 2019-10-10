public class Driver
{
public static void main(String [] args)
{
//INSTANTIATE HOLIDAY CLASS
Holiday h1= new Holiday("New Year's Day", " January", 1);
Holiday h2 = new Holiday("MLK DAY" , "January" , 15);
Holiday h3 = new Holiday("Independence Day" , "November" , 11);
Holiday h4= new Holiday("Christmas " , "December" , 25);
Holiday [] days = {h1, h2, h3, h4};
System.out.println(h1.avgDay(days));
// double avg = h1.avgDay(days);
// System.out.println(avg);
}
}