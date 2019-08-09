package studing;

public class ToStringConnected {
	private String name;
	private ThisAndToString bday;
	
	public ToStringConnected(String n, ThisAndToString b ){
		name=n;
		bday=b;
	}
	public String toString(){
		return String.format("my name is %s and my bday is on %s", name,bday);
	}
}
