package LOL;

public class GiantDragon {
	//���ع��캯��
	private GiantDragon() {
	}
	private static GiantDragon gd ;
	public static GiantDragon getGd(){
		gd = new GiantDragon();
		return gd;
	/*	if(null == gd ){//���û���ڴ���
	 * 		gd = new GiantDragon();
	 * }
	*
	*
	*
	*
	*/
	}
}
