package Learning;

public class StaticVariable {
	private String name;
	private String batch;
	private static int students=0;
	
	public StaticVariable(String n, String b){
		name=n;
		batch=b;
		students++;
		System.out.printf("Name= %s, Batch= %s, total Students= %d\n",name,batch,students);
	}
	public String getName(){
		return name;
	}
	public String getBatch(){
		return batch;
	}
	public static int getStudents(){
		return students;
	}

}
