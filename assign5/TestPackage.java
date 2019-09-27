import myPack.CurrConvertor;
import java.text.DecimalFormat;
class TestPackage{

        private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		String currency,d;
		float value;
		while(true){
			System.out.print("Enter the source currency (yen etc) : ");
			currency = input.next();
			System.out.print("Enter the destination currency      : ");
			d = input.next();
			try{
				System.out.print("Enter the value                     : ");
				if(!input.hasNextFloat()){
					input.next();
					throw  new NumberFormatException();
				}
                                
				else
				{	value = input.nextFloat();
                                        try{
                                            if(value<0){
                                            throw new NumberFormatException();}
                                           }
                                        catch(NumberFormatException nfe){
				        System.out.println("The input is Negative!");
				        continue;
			                }
                                }	
			}
			 
			catch(NumberFormatException nfe){
				System.out.println("The input is invalid!");
				continue;
			}
		
		
			CurrConvertor c = new CurrConvertor(value,currency);
		
			float ans = c.convert(d);
		        
                        System.out.println("Converted Value: " + df.format(ans));
			
			System.out.println("\n---------------------------------------------\n");
			System.out.println("Do you want to stop y/n? ");
			if(input.next().charAt(0) == 'y')
				break;
		}
			
	}
	
}
