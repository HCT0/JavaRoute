package GenericParadigm;
import LOL.*;
import java.util.*;

public class extendsGeneric {
	public static void main(String[] args) {
		ArrayList <Aphero> apheros = new ArrayList();
		apheros.add(new Aphero());
		
		//Hero 的子类泛型,转换为父类
		ArrayList<? extends Hero> heros = apheros;
		
		System.out.print(heros.get(0));
	}
}
