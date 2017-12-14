import java.lang.*;
class MusicThread extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("听音乐"+i);
		}
	}
}
public class ExtendsThread {
	public static void main(String[] args) {
		for(int i=0;i<50;i++) {
			System.out.println("打游戏"+i);
			if(i==10) {
				MusicThread A=new MusicThread();
				A.start();
			}
		}
	}
}
