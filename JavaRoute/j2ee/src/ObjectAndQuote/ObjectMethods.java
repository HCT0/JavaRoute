package ObjectAndQuote;

public class ObjectMethods {

	public String name ;
	public String toString() {
		return name;
	}
	public void finalize() {
		System.out.println("����finalize�����󱻻���");
	}
	public static void main(String[] args) {
		ObjectMethods om = new ObjectMethods();
		om.name = "����";
		System.out.println(om.toString());
		//ֱ�Ӵ�ӡ������Ǵ�ӡ�����toString()�ķ���ֵ
		System.out.println(om);
		
		for(int i=0;i<1000;i++){//���ϵĴ������󣬾ͻ���գ�������finalize ���� 
			om = new ObjectMethods();
		}
	}
}
