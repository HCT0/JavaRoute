package SetFramework;
import java.util.*;
import LOL.*;

public class ArrayList3WaysLoop {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList();
		for(int i=0;i<5;i++) {
			heros.add(new Hero("gailin"+i));
		}
		//for
		for(int n=0;n<heros.size();n++) {
			System.out.println(heros.get(n));
		}
		
		//������
		Iterator<Hero> it = heros.iterator();
		while(it.hasNext()) {
			Hero h1 = it.next();
			System.out.println(h1);
		}
		
		//��ǿ��for
		for(Hero h2:heros) {
			System.out.println(h2);
		}
		
	}
}
