package GenericParadigm;
import LOL.*;
import java.util.*;

public class extendsGeneric {
	public static void main(String[] args) {
		ArrayList <Aphero> apheros = new ArrayList();
		apheros.add(new Aphero());
		
		//Hero �����෺��,ת��Ϊ����
		ArrayList<? extends Hero> heros = apheros;
		
		System.out.print(heros.get(0));
	}
}