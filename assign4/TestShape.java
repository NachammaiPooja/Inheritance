//With Abstract Class

import java.util.*;

abstract class Shape
{

	protected String color;

	public Shape()
	{
		this.color="red";
	}
	
	public Shape(String color)
	{
		this.color=color;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
	this.color=color;
	}
	abstract public double getArea();
	abstract public double getPerimeter();
}

class Circle extends Shape
{
	protected double radius;

	public Circle()
	{
		radius=1.0;
	}	

	public Circle(double radius,String color)
	{
		super(color);
		this.radius=radius;
	}

	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}

	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}

	public double getArea()
	{
		double area=3.14*radius*radius;
		return area;
	}

	public double getPerimeter()
	{
		double peri=2*3.14*radius;
		return peri;
	}
	public String toString()
	{
		return "Radius\t: "+radius+"\nColor\t: "+color;
	}

}

class Rectangle extends Shape
{

	protected double width,length;

	public Rectangle()
	{
	width=1.0;
	length=1.0;
	}
	
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}

	public Rectangle(double width,double length,String color)
	{
		this.width=width;
		this.length=length;
		this.color=color;
	}

	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width=width;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length=length;
	}

	public double getArea()
	{
		double area=length*width;
		return area;
	}

	public double getPerimeter()
	{
		double peri;
		peri=2*(length+width);
		return peri;
	}
}

class Square extends Rectangle
{

	public Square()
	{
		length=width=1;
	}

	public Square(double side)
	{
		length=side;
		width=side;
	}	

	public Square(double side,String color)
	{
		length=width=side;
		this.color=color;
	}

	public double getSide()
	{
		return length;
	}

	public void setSide(double side)
	{
		length=width=side;
	}
	public double getArea()
	{
		double area=length*length;
		return area;
	}

	public double getPerimeter()
	{
		double peri;
		peri=4*length;
		return peri;
	}
}
class TestShape
{
public static void main(String Args[])
{
	Scanner input=new Scanner(System.in);
	int ch,op;
	Shape s[]=new Shape[3];
	for(int j=0;j<9;j++)
	{
		System.out.println("\nEnter shape \n1)Circle \n2)Rectangle \n3)Square\n4)Exit\nenter choice: ");
		ch=input.nextInt();
              
                if(ch==1){
	        float r;
                String color;  
                System.out.println("\t\tENTER DETAILS OF CIRCLE");
                System.out.println("\t\t-----------------------");
		System.out.print("Enter the radius    : ");
		r = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();

                s[0]=new Circle();
                s[1]=new Circle(r);
                s[2]=new Circle(r,color); 
		       
                   for(int i=0;i<3;i++){
		        System.out.println("\n\nColor: "+ s[i].getColor());
		        System.out.println("Radius: "+ ((Circle)s[i]).getRadius());
		        System.out.println("Area: "+ s[i].getArea());
		        System.out.println("Perimeter: "+ s[i].getPerimeter());
		        System.out.println("******************************"); }                  
		        
                
            }
            else if(ch==2)
            {   float w,l;
                String color;
                System.out.println("\n\t\tENTER DETAILS OF RECTANGLE");
                System.out.println("\t\t--------------------------");
		System.out.print("Enter the length    : ");
		l = input.nextFloat();
		System.out.print("Enter the width     : ");
		w = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();
                   
                     s[0]=new Rectangle();
                     s[1]=new Rectangle(w,l);
                     s[2]=new Rectangle(w,l,color); 
                    
                     for(int i=0;i<3;i++){
                        System.out.println("\n\nColor: "+ s[i].getColor());
                        System.out.println("Width: "+ ((Rectangle)s[i]).getWidth());
                        System.out.println("Length: "+ ((Rectangle)s[i]).getLength());
                        System.out.println("Area: "+ s[i].getArea());
                        System.out.println("Perimeter: "+ s[i].getPerimeter());
                        System.out.println("******************************");                    
                    }
               
            }
            else if(ch==3)
            {   float si;
                String color;
                System.out.println("\n\t\tENTER DETAILS OF SQUARE");
                System.out.println("\t\t-----------------------");
		System.out.print("Enter the side      : ");
		si = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();
            
                
                 s[0]=new Square();
                 s[1]=new Square(si);
                 s[2]=new Square(si,color);  
                 for(int i=0;i<3;i++){
                        System.out.println("\n\nColor: "+ s[i].getColor());
                        System.out.println("Side: "+ ((Square)s[i]).getSide());
                        System.out.println("Area: "+ s[i].getArea());
                        System.out.println("Perimeter: "+ s[i].getPerimeter());
                        System.out.println("******************************");                    
                    }
               
	
	}
        else if(ch==4)
              return;	
}
}
}

