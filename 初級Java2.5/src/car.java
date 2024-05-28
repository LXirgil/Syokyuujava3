
public class car {
	int x,y,vx,vy;
	public car(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x,y+10,20,20);
		frame.fillOval(x+10,y,50,50);
		frame.fillRect(x+4,y+20,70,30);
		frame.fillRect(x+24,y+20,40,30);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}
}
