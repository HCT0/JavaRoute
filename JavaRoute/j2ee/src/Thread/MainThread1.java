package Thread;
import LOL.*;
public class MainThread1 {
	public static void main(String[] args) {
		Hero gareen = new Hero();
        gareen.name = "¸ÇÂ×";
        gareen.hp = 616;
        gareen.damage = 50;
 
        Hero teemo = new Hero();
        teemo.name = "ÌáÄª";
        teemo.hp = 300;
        teemo.damage = 30;
         
        Hero bh = new Hero();
        bh.name = "ÉÍ½ğÁÔÈË";
        bh.hp = 500;
        bh.damage = 65;
         
        Hero leesin = new Hero();
        leesin.name = "Ã¤É®";
        leesin.hp = 455;
        leesin.damage = 80;
        
        KillThread kt1 = new KillThread(gareen,teemo);
        kt1.start();
        
        KillThread kt2 = new KillThread(bh,leesin);
        kt2.start();
        
        
        
	}
}
