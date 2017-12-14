import java.lang.*;
class MusicImple implements Runnable{

	public void run() {
		for(int i=0;i<50;i++)
		{
			System.out.println("ÌýÒôÀÖ"+i);
		}	
	}
	
}
public class ImpleRunnable {
	public static void main(String[] args) {
		for(int i=0;i<50;i++) {
			System.out.println("´òÓÎÏ·"+i);
			if(i==10)
			{
				Runnable mus=new MusicImple();
				Thread A=new Thread(mus);
				A.start();
			}
		}
	}
}
