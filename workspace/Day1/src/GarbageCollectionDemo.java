import java.util.ArrayList;


public class GarbageCollectionDemo {

	public static void main(String[] args) {

		String str= "";
		
		StringBuffer buffer = new StringBuffer("");
		
		ArrayList list = new ArrayList();

		for(int i=0;i<100;i++){
			
//			str = str + i;
			buffer.append(i);
			
			/*try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		System.out.println(buffer.toString());

	}

}
