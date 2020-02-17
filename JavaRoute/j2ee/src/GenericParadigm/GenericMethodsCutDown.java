package GenericParadigm;
import java.util.*;
import LOL.*;

public class GenericMethodsCutDown {
	public static void Iterator(ArrayList<? extends Hero > heros){
		for(Hero h1 :heros){
			System.out.println(h1.name);
		}
	}	

	public static void main(String[] args) {
		 ArrayList<Hero> hs = new ArrayList<>();
	     ArrayList<Aphero> aphs = new ArrayList<>();
	     ArrayList<Adhero> adhs = new ArrayList<>();
	     
	     //因为Iterator 支持Hero 和 子类等,可以进行类型的转换
	     Iterator(hs);
	     Iterator(aphs);
	     Iterator(adhs);
	     
	}
}
