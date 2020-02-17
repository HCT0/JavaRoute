package ObjectAndQuote;
import LOL.Hero;
public class QuoteTest {
public static void main(String[] args) {
	Hero h1 = new Hero();
	//Hero h2 = new Hero();
	Hero h3;
	Hero h4;
	h3 = h1;
	h4 = h3;
	System.out.println(h3);
	System.out.println(h4);
	//结果相同
}
}
