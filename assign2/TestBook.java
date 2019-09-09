import java.util.Scanner;

class Author{
	private String name;
	private String email;
	private char gender;

	Author(String name,String email,char gender){
		this.name   = new String(name);
		this.email  = new String(email);
		this.gender = gender;
	}

	public String getName(){
		return name;
	}

	public String getEMail(){
		return email;
	}

	public char getGender(){
		return gender;
	}

	public void setEMail(String email){
		this.email = new String(email);
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;

	Book(String name,Author author,double price){
		this.name   = new String(name);
		this.author = author;
		this.price  = price;
	}

	Book(String name,Author author,double price,int qty){
		this(name,author,price);
		this.qty = qty;
	}

	public String getName(){
		return name;
	}

	public Author getAuthor(){
		return author;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public int getQty(){
		return qty;
	}
	
	String getAuthorName(){
		return author.getName();
	}
	
	String getAuthorEMail(){
		return author.getEMail();
	}
}


class TestBook{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String nameA,nameB,email;
		char gender;
		int qty;
		double price;
		int opt = -1;
		Book b;
		Author a;
		
		
			System.out.print("ENTER BOOK DETAILS\n");
			System.out.print("Enter name of book  : ");
			nameB = input.next();
			System.out.print("Enter price of book : ");
			price = input.nextDouble();
			System.out.print("Enter quantity      : ");
			qty = input.nextInt();
	
			System.out.print("-----------------------------------------------\n");
		
	
			System.out.print("ENTER AUTHOR DETAILS\n");
			System.out.print("Enter name of author       : ");
			nameA = input.next();
			System.out.print("Enter email of author      : ");
			email = input.next();
			System.out.print("Enter the gender of author : ");
			gender = input.next().charAt(0);

			a = new Author(nameA,email,gender);
			b = new Book(nameB,a,price,qty);
		
			System.out.print("------------------------------------------------\n");
		
		
		//for(int i = 0 ; i < 2 ; i++){
			System.out.print("BOOK DETAILS\n");
			System.out.println("Name         : " + b.getName());
			System.out.println("Author       : " + b.getAuthorName());
			System.out.println("Author E-Mail: " + b.getAuthorEMail());
			System.out.println("Price        : " + b.getPrice());
			System.out.println("Quantity     : " + b.getQty());

			System.out.print("------------------------------------------------\n");
		//}
					
	}
}


