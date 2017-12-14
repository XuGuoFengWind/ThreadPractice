import java.lang.*;
class MusicThread extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("ÌýÒôÀÖ"+i);
		}
	}
}
public class ExtendsThread {
	public static void main(String[] args) {
		for(int i=0;i<50;i++) {
			System.out.println("´òÓÎÏ·"+i);
			if(i==10) {
				MusicThread A=new MusicThread();
				A.start();
			}
		}
	}
}
