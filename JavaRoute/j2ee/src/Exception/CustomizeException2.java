package Exception;

import LOL.Hero;

public class CustomizeException2 {

	public void attack(Hero h) throws CustomizeException{
		if(h.hp == 0) {
			throw new CustomizeException(h.name+"已经阵亡，无法使用技能");
		}
	}
	public static void main(String[] args) {
		Hero timo = new Hero();
		timo.name = "提莫";
		CustomizeException2 ce = new CustomizeException2();
		try {
			ce.attack(timo);
		}catch(CustomizeException e){
			 System.out.println("异常的具体原因:"+e.getMessage());
	            e.printStackTrace();
		}
	}
}
