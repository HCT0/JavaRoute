package Exception;

import LOL.Hero;

public class CustomizeException2 {

	public void attack(Hero h) throws CustomizeException{
		if(h.hp == 0) {
			throw new CustomizeException(h.name+"�Ѿ��������޷�ʹ�ü���");
		}
	}
	public static void main(String[] args) {
		Hero timo = new Hero();
		timo.name = "��Ī";
		CustomizeException2 ce = new CustomizeException2();
		try {
			ce.attack(timo);
		}catch(CustomizeException e){
			 System.out.println("�쳣�ľ���ԭ��:"+e.getMessage());
	            e.printStackTrace();
		}
	}
}
