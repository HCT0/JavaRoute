package Thread;
import java.util.*;

public class NoSynchronizedToSynchronized {
	ArrayList<Integer> l1 = new ArrayList();//ArrayList �ǲ���ȫ��
	ArrayList<Integer> l2 = (ArrayList<Integer>) Collections.synchronizedList(l1); //ʹ��Collections, ��ArryList ת��Ϊ��ȫ��ArrayList
}