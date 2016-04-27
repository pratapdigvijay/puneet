import java.util.ArrayList;


public class GarbageCollectionDemo {

	public static void main(String[] args) {

		String str= "";
		
		ArrayList list = new ArrayList();

		for(int i=0;i<100000000;i++){
			
			str = str + i;
			
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
