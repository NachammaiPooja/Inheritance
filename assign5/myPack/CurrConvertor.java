package myPack;

public class CurrConvertor{
                
		private float value;
		private String currency;
		public CurrConvertor(float value,String currency){
			this.value = value;
			this.currency = currency;
		} 

		public float getValue(){return value;}
		public String getCurrency(){return currency;}


		public float convert(String s){
			float ratio;
			if(s.equals("INR"))
				switch(this.currency){
					case "Dollar": ratio = 72.0f  ; break;
					case "Yen"   : ratio = 0.68f  ; break;
					case "Euro"  : ratio = 79.0f  ; break;
					default      : ratio = 1.00f  ; break;
				}				
			else
				switch(s){
					case "Dollar": ratio = 1/72.0f; break;
					case "Yen"   : ratio = 1/0.68f; break;
					case "Euro"  : ratio = 1/79.0f; break;
					default      : ratio = 1/1.00f; break;
				}
                                
			return (this.value * ratio);
		}
		
		public String toString(){
			return value + " " + currency;
		}
}
