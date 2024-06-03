import java.util.Vector;
public class DisplayCarsVector extends MyFrame{
	public void run() {
		Vector<Cars> car=new Vector<Cars>();
		Cars[] cars=new Cars[5];
		 cars[0] = new Cars(50,50,1,0);
		 cars[1] = new Cars(50,100,2,0);
		 cars[2] = new Cars(50,150,3,0);
		 cars[3] = new Cars(50,200,4,0);
		 cars[4] = new Cars(50,250,5,0);
		 for(int i=0;i<10;i++) {
				clear();
				for(int j=0;j<cars.length;j++) {
					cars[j].draw(this);
					cars[j].move();
				}
				sleep(0.1);
			}
		
	}
}
