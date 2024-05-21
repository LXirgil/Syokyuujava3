
public class RectIf extends MyFrame{
	public void run() {
		int x=30;
		int color1=0,color2=0,color3=0;
		int i;
		for(i=0;i<9;i++) {
			setColor(color1,color2,color3);
			fillRect(x,80,10,100);
			x+=20;
			color1+=17;
			color2+=17;
			color3+=17;
		}
	}

}
