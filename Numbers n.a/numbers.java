public class numbers
{
public static void main(String []args)
{
int [][] numbers= new int[2][2];

for (int i = 0; i < 2; i++)
{
for( int j = 0; j< 2 ; j++)
{
numbers [i] [j] = i + j ;
System.out.println(numbers [i] [j]);
}

}
}
}