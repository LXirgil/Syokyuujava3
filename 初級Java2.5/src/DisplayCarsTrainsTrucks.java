
public class DisplayCarsTrainsTrucks extends MyFrame{
	public void run() {
		vehicle[] vehicles=new vehicle[6];
		vehicles[0]=new car(10,30,3,0);
		vehicles[1]=new car(200,100,-5,0);
		vehicles[2]=new Train(10,150,3,0);
		vehicles[3]=new Train(200,220,-5,0);
		vehicles[4]=new Truck(10,270,3,0);
		vehicles[5]=new Truck(200,340,-5,0);
		while(true) {
			clear();
			for(int j=0;j<vehicles.length;j++) {
				vehicles[j].draw(this);
				vehicles[j].move();
			}
			sleep(0.1);
		}
	}
}
