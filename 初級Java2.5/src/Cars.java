
public class Cars {
	int x,y,vx,vy;
	public Cars(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+10,y,20,20);        
        frame.fillRect(x-10,y+15,60,20);
        frame.fillOval(x,y+30,15,15);
        frame.fillOval(x+30,y+30,15,15);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}
}
