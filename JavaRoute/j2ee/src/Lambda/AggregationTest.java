package Lambda;
import java.util.*;
import LOL.*;
public class AggregationTest {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Hero> heros1 = new ArrayList<>();
		for(int i=0 ;i<10;i++){
			heros1.add(new Hero("timo " + i));
		}
		//管道源是 arraylist
		heros1
		.stream()
		.filter(h->h.damage<50 &&h.hp>100 )
		.distinct()
		.limit(3)//保留三个
		.skip(3)//保留前三个	
		//.flatMapToDouble(heros1::getHp)
		.toArray();
		//.count();
		//.forEach(h->System.out.println(h.name));
	
		
		
		
		//管道源是数组
		Hero heros [] = new Hero[heros1.size()];
		Arrays.stream(heros)
		.forEach(h->System.out.println(h.name));
				
	}
}
