
public class Animation extends MyFrame{
	public void run() {
		int y=100;
		int x=30;
		
			while(y<=200) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=10;;
				y+=10;
				
				sleep(0.1);
			}
			while(x>=30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=20;
				sleep(0.1);
			}
			while(y>=30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=10;
				y-=10;
				sleep(0.1);
			}
		
	}

}
