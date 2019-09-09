import java.util.Scanner;
class Elecbill{
    int Consnum;
    String Consname;
    double Premonread;
    double Curmonread;
    double units;
    double Tariff;
    void domestic(double units){
        Tariff=0;
        if(units<=100)
            Tariff=(units*1);
        else if((units>100)&&(units<=200))
            Tariff=(100+((units-100)*2.5));
        else if((units>=201)&&(units>=500))
            Tariff=(100+(200*2.5)+((units-300)*4));
        else
            Tariff=(100+(100*2.5)+(300*4)+((units-500)*6));
        //System.out.println("\nTariff=" +Tariff);
    }
    
    void commercial(double units){
        Tariff=0; 
        if(units<=100)
            Tariff=(units*2);
        else if((units>100)&&(units<=200))
            Tariff=(100+((units-100)*4.5));
        else if((units>=201)&&(units>=500))
            Tariff=(100+(200*2.5)+((units-300)*6));
        else
            Tariff=(100+(100*2.5)+(300*4)+((units-500)*7));
                         
    }

    void display(int c){
            System.out.println("\t\tElectricity Bill");
            System.out.print("********************************************************************");
            System.out.print("\nConsumer Number:\t" +Consnum);
            System.out.print("\nConsumer Name:\t\t" +Consname);
            if(c==1)
            System.out.print("\nConsumer Type:\t\t Domestic");
            else
            System.out.print("\nConsumer Type:\t\tCommercial");
            System.out.print("\nPrevious Reading:\t" +Premonread);  
            System.out.print("\nCurrent Reading:\t" +Curmonread);
            System.out.print("\n********************************************************************"); 
            System.out.print("\nTotal Units\t\t" +units); 
            System.out.print("\n");
            System.out.print("                       *****************");
            System.out.print("\nTARIFF\t\t\t" +Tariff);
            System.out.print("\n********************************************************************"); 
    }
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
            Elecbill obj= new Elecbill();
	    System.out.println("\t\tEnter details");
	    System.out.print("\nEnter Consumer Number\t\t");
	    obj.Consnum =in.nextInt();
	    System.out.print("\nEnter Consumer Name\t\t");
            in.nextLine();
            obj.Consname = in. nextLine();
       	    System.out.print("\nEnter Previous Month Reading\t");
	    obj.Premonread=in.nextInt();
	    System.out.print("\nEnter Current Month Reading\t");
	    obj.Curmonread=in.nextInt();
	    
            obj.units=obj.Curmonread- obj.Premonread;
	    System.out.println("\nSelect your type of EB connection\n1.Domestic connection         \n2.Commercial connection\nEnter\t");
     	    int ch=in.nextInt();
	    switch(ch){
	        case 1 :obj.domestic(obj.units);
                        int c=1;
                        obj.display(c);
                        //System.out.println("Total Cost =" + obj.domestic(units));
	                break;
	        case 2 :obj.domestic(obj.units);
                        c=2;
                        obj.display(c); 
                        //System.out.println("Total Cost =" + obj.commercial(units));
	                break;
	    }
	    
	}
}
