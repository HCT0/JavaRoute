package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger();
		int i = ai.decrementAndGet();//���̰߳�ȫ��
		int k = ai.incrementAndGet();
		int j = ai.addAndGet(3);
	}
}
