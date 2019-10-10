//circle class with aa single attribute,
//the radius of the circle include the following
// a constructor with paremeter for setting radius
// a copy constructor
// a toString method
// an equal method
// aa copy method
// a method to caluclate the area of the circle.

public class Circle
{
private double radius;

public void setRadius(double radius)
{ 
this.radius= radius;
}

public double getRadius()
{ 
return radius;
}
public Circle(double radius){
setRadius(radius); // or this.radius = radius
}
//copy constructors
public Circle(Circle c){
this(c.radius);
}

//toString
//java visualizer 
// 4 go to toString
public String toString(){
// The radius of the circle is 3.67
return "The radius of the circle is " +radius;

}
public boolean equals(Circle c){
// circles are equal if they have the same area
return this.calculateArea() == c.calculateArea();
}
public double calculateArea(){
return Math.PI* radius * radius;
}
//Copy method
public Circle copy(){
return new Circle(this.radius);
} 

public static void main(String [] args){
int x =4;

Circle b = new Circle(x); // go to the toString
System.out.println(b);

Circle c = b;

c.setRadius(3.7);
System.out.println(b);
System.out.println(c);

Circle d = new Circle(c);
d.setRadius(10.5);
System.out.println(b);
System.out.println(c);
System.out.println(d);

Circle f = d.copy();
f.setRadius(74.1);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(f);   }

   }
