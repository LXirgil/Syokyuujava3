
public class RectIf extends MyFrame{
	public void run() {
		int x=10;
		int y=10;
		int xlong=5;
		int ylong=5;
		setColor(0,128,0);
		int i;
		
		for(i=0;i<9;i++) {
				fillRect(x,y,xlong,ylong);
			
			
			x+=xlong;
			y+=ylong;
			xlong+=10;
			ylong+=10;
					
		}
	}

}
