//WITH INTERFACE

import java.util.*;
interface Shape
{
	public String getColor();
	public float getArea();
        public float getPerimeter();
}

class Circle implements Shape
{
	protected float radius;
        protected String color;

	public Circle()
	{       
                color="Red";
		radius=1.0f;
	}	

	public Circle(float radius,String color)
	{
		this.color=color;
		this.radius=radius;
	}

	public Circle(float radius)
	{
		color="Red";
		this.radius=radius;
	}
        
        public String getColor(){
		return color;
	}

	public float getRadius()
	{
		return radius;
	}
	
	public void setRadius(float radius)
	{
		this.radius=radius;
	}

	public float getArea()
	{
		float area=(float)3.14f*radius*radius;
		return area;
	}

	public float getPerimeter()
	{
		float peri=(float)2*3.14f*radius;
		return peri;
	}
	public String toString(){
		return "The details of the Circle are\n" + 
			   "Color       : " + getColor() + "\n" +
                           "Radius	    : " + getRadius()+ "\n" +  
			   "Area        : " + getArea() + "\n" +
			   "Perimeter   : " + getPerimeter() + "\n";
	}
}

class Rectangle implements Shape
{

	protected float width,length;
        protected String color;

	public Rectangle()
	{
        color="Red";
	width=1.0f;
	length=1.0f;
	}
	
	public Rectangle(float width,float length)
	{       
                color="Red";
		this.width=width;
		this.length=length;
	}

	public Rectangle(float width,float length,String color)
	{
		this.width=width;
		this.length=length;
		this.color=color;
	}
        
        public String getColor(){
		return color;
	}

	public float getWidth()
	{
		return width;
	}
	
	public void setWidth(float width)
	{
		this.width=width;
	}

	public float getLength()
	{
		return length;
	}

	public void setLength(float length)
	{
		this.length=length;
	}

	public float getArea()
	{
		float area=length*width;
		return area;
	}

	public float getPerimeter()
	{
		float peri;
		peri=2*(length+width);
		return peri;
	}
        public String toString(){
                return "The details of the Rectangle are\n" + 
			   "Color       : " + getColor() + "\n" +
                           "Length	    : " + getLength()+ "\n" +
                           "Width	    : " + getWidth()+ "\n" +  
			   "Area        : " + getArea() + "\n" +
			   "Perimeter   : " + getPerimeter() + "\n";
	} 
}

class Square extends Rectangle
{

	public Square()
	{
		super();
	}

	public Square(float side)
	{
		super(side,side);
	}	

	public Square(float side,String color)
	{
		super(side,side,color);
	}

	public float getSide()
	{
		return length;
	}

	public void setSide(float side)
	{
		length=width=side;
	}
	public float getArea()
	{
		float area=length*length;
		return area;
	}

	public float getPerimeter()
	{
		float peri;
		peri=4*length;
		return peri;
	}
        public String toString(){
		return "The details of the Square are\n" + 
                           "Color       : " + getColor() + "\n" +
			   "Side        : " + getSide() + "\n" +
       			   "Area        : " + getArea() + "\n" +
			   "Perimeter   : " + getPerimeter() + "\n";
	}
}
class TestInterface
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
		        /*System.out.println("\n\nColor: "+ s[i].getColor());
		        System.out.println("Radius: "+ ((Circle)s[i]).getRadius());
		        System.out.println("Area: "+ s[i].getArea());
		        System.out.println("Perimeter: "+ s[i].getPerimeter());*/
                        System.out.println(s[i]);                           
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
                        System.out.println(s[i]);  
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
                        System.out.println(s[i]);  
                        System.out.println("******************************");                    
                    }
               
	
	}
        else if(ch==4)
              return;	
}
}
}

