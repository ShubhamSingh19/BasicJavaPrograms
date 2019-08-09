package Learning;

import java.util.EnumSet;

public class EnumTryMain {

	public static void main(String[] args) {
		for(EnumTry object: EnumTry.values()){
			System.out.printf("%s\t%s\t\t%s\n",object,object.getName(),object.getCg());
		}
		System.out.println("\nNow for the choosen ones!!\n");
		for(EnumTry object: EnumSet.range(EnumTry.ob2,EnumTry.ob4)){
			System.out.printf("%s\t%s\t\t%s\n",object,object.getName(),object.getCg());
			
			//EnumTry object3 = new EnumTry("Manthan","7.8"); //THIS CANNOT BE DONE!! INSTANSTIATION
			
		}

	}

}
 