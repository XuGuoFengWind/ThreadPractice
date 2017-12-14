import java.lang.*;
class MusicImple implements Runnable{

	public void run() {
		for(int i=0;i<50;i++)
		{
			System.out.println("听音乐"+i);
		}	
	}
	
}
public class ImpleRunnable {
	public static void main(String[] args) {
		for(int i=0;i<50;i++) {
			System.out.println("打游戏"+i);
			if(i==10)
			{
				Runnable mus=new MusicImple();
				Thread A=new Thread(mus);
				A.start();
			}
		}
	}
}
