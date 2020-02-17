package array;
/*
 * 
 * 
 * 找出数组的最小值
 * 
 * */
public class ArrayMin {
	public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        int b=a[0];
        for (int i = 0; i < a.length; i++)
        	if(b<=a[i])
        		b=a[i];
        	
        System.out.println(b);
         
       
    }
}
