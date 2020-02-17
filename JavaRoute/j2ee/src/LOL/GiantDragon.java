package LOL;

public class GiantDragon {
	//隐藏构造函数
	private GiantDragon() {
	}
	private static GiantDragon gd ;
	public static GiantDragon getGd(){
		gd = new GiantDragon();
		return gd;
	/*	if(null == gd ){//如果没有在创建
	 * 		gd = new GiantDragon();
	 * }
	*
	*
	*
	*
	*/
	}
}
