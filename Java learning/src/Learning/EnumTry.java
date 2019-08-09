package Learning;

public enum EnumTry {
	ob1("Shubham","7.0"),
	ob2("Ritik","8.3"),
	ob3("Safal","5.6"),
	ob4("Samar","7.5"),
	ob5("Ronak","5.5");
	
	private final String name;
	private final String cg;
	
   private EnumTry(String n,String c){
		name=n;
		cg=c;
	}
   public String getName(){
	   return name;
   }
   public String getCg(){
	   return cg;
   }

}
