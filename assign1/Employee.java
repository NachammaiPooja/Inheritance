import java.text.*;
import java.util.*;
import java.lang.*;
public class Employee {
    String name,ndob,ndoj,designation;
    int id;
    double DA,basic,HRA,LIC,PF,Nhw,HW,gross,ded,netsal;
    Date dob,doj;
    void calculate ()
    {
        switch (designation) {
            case "intern":
                DA=2000;
                HRA=1000;
                PF=500;
                gross=Nhw+HW+DA+HRA;
                ded=LIC+PF;
                netsal=gross-ded;
                break;
            case "manager":
                DA=(int) (0.4*basic);
                HRA=(int) (0.1*basic);
                PF=(int) (0.08*basic);
                gross=basic+DA+HRA;
                ded=LIC+PF;
                netsal=gross-ded;
                break;
            case "others":
            case "trainee":
            case "analyst":
            case "softwareengineer":
            case "teamlead":
                DA=(int) (0.3*basic);
                HRA=(int) (0.1*basic);
                PF=(int) (0.08*basic);
                gross=basic+DA+HRA;
                ded=LIC+PF;
                netsal=gross-ded;
                break;
            default:
                System.out.println("Invalid");
        }
    }
    
    void payroll ()
    {
        System.out.println("*************************************************");
        System.out.println("ID          : "+id +"             "+"\nNAME : "+name);
        System.out.println("designation : "+designation);
        System.out.println("*************************************************");
        System.out.println("     basic pay  : Rs:"+basic +"/-");
        System.out.println("     gross pay  : Rs:"+gross +"/-");
        System.out.println("     deductions : Rs:"+ded +"/-");
        System.out.println("               -----------------------------");
        System.out.println("                net salary : Rs:"+netsal +"/-");
        System.out.println("*************************************************");
        System.out.println("\n");
    }
    
    void display ()
    {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");    
        System.out.println("*************************************************");
        System.out.println(" ID          : "+id +"            "+"\nNAME : "+name);
        System.out.println(" D.O.B       : "+dateformat.format(dob) +"\n"+"D.O.J : "+dateformat.format(doj));
        System.out.println(" Designation : "+designation);
        System.out.println("*************************************************");
        System.out.println("     basic pay  : Rs:"+basic +"/-");
	switch(designation)
	{
		case "intern":
	        System.out.println("     No. of hours worked : "+Nhw);
	        System.out.println(" 	 The hourly wage     : "+HW);
		break;
	}
        System.out.println("     DA         : Rs:"+DA +"/-");
        System.out.println("     HRA        : Rs:"+HRA +"/-");
	if(LIC!=0){        
		System.out.println("     LIC        : Rs:"+LIC +"/-");
	}
	else{
		System.out.println("     LIC        : Not opted");
	}
        System.out.println("     PF         : Rs:"+PF +"/-");
        System.out.println("     gross pay  : Rs:"+gross +"/-");
        System.out.println("     deductions : Rs:"+ded +"/-");
        System.out.println("               -----------------------------");
        System.out.println("                net salary : Rs:"+netsal +"/-");
        System.out.println("*************************************************");
        System.out.println("\n");
    }
    
    void promotion(){
        Date date = new Date();
        Scanner scan =new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        long diffInMilliSec = date.getTime() - doj.getTime();
        long seconds = (diffInMilliSec / 1000) % 60;
        long minutes = (diffInMilliSec / (1000 * 60)) % 60;
        long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;
        long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;
        long years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
        if(years > 10)
        {
            switch(designation)
            {
                case "intern":
                    designation="others";
                    doj=date;
                    System.out.println("\n" +name +" promoted to "+designation);
                    System.out.println("Enter the basic pay: ");
                    basic=scan.nextInt();
                    break;
                case "others":
                    designation="manager";
                    System.out.println("\n" +name +" promoted to "+designation);
                    doj=date;
                    break;
                case "manager":
		    System.out.println("\nManager cannot be promoted");
		    break;
                default:
                    System.out.println("Invalid chioce");
            }
        }
	else
	{
		System.out.println("\nEmployee "+name+" is not eligible to be promoted");
	}
    }
    
    public static void main(String[] args){
        int n=0,idno,c,i;
        Scanner scan =new Scanner(System.in);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Employee[] emp = new Employee[20] ;
        do
        {   System.out.println("*****************************");
            System.out.println("Menu");
            System.out.println("1.Get Employee details ");
            System.out.println("2.Salary Details for all Employees");
            System.out.println("3.Search for Employee by ID number");
            System.out.println("4.Promotions");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            c=scan.nextInt();
	    if(c==1){
	    	n+=1;
		i=n-1;
	    	emp[i]=new Employee();
            	System.out.println("\nEmployee record: "+(i+1));
            	System.out.println("Enter the Employee id: ");
            	emp[i].id=scan.nextInt();
            	System.out.println("Enter the Employee NAME: ");
            	emp[i].name=scan.next();
            	System.out.println("Enter the DATE of BIRTH:(DD/MM/YY) ");
            	emp[i].ndob=scan.next();
            	try {
            	    emp[i].dob = dateformat.parse(emp[i].ndob);
            	} catch (ParseException ex) {
            	}
            	System.out.println("Enter the DATE of JOINING:(DD/MM/YY) ");
            	emp[i].ndoj=scan.next();
            	try {
                	emp[i].doj = dateformat.parse(emp[i].ndoj);
               	} catch (ParseException ex) {
            	}
            	System.out.println("Enter the designation: ");
            	emp[i].designation=scan.next();
           	if(!"intern".equals(emp[i].designation)){
           	System.out.println("Enter the basic pay: ");
            	emp[i].basic=scan.nextInt();
            	}
            	System.out.println("Enter the LIC value: ");
            	emp[i].LIC=scan.nextInt();
            	if("intern".equals(emp[i].designation)){
            	System.out.println("Enter the No. of Hours worked :");
            	emp[i].Nhw=scan.nextInt();
            	System.out.println("Enter the hour wage: ");
            	emp[i].HW=scan.nextInt();
            	}
            	emp[i].calculate();
	    }	
            else if(c==2)
            {
                for (i=0;i<n;i++)
                {
                    System.out.println("\nEmpolyee record: "+(i+1));
                    emp[i].payroll();
                }
            }
            else if(c==3)
            {
                System.out.println("Enter the Employee id: ");
                idno=scan.nextInt();
                for(i=0;i<n;i++)
                {
                    if(idno==emp[i].id)
                    {
                        emp[i].display();
                    }
                }
            }
            else if(c==4)
            {
		int emno,flag=0;
		System.out.println("\nEnter the employee id of the employee to be promoted");
		emno=scan.nextInt();
                for(i=0;i<n;i++)
                {
			if(emno==emp[i].id){
			System.out.println("Employee id: "+emp[i].id+"\n");
                        emp[i].promotion();
			emp[i].calculate();
			flag=1;
			}
                }
		if(flag==0){
			System.out.println("Invalid Employee ID");
		}
            }
        }while(c!=5);
    }
}
