public class Ball{

public int x;
public int y;
public int radius;

public Ball(int x,int y, int r){
	this.x = x;
	this.y = y;
	radius = r;
}

public void move(boolean d, int m, int speed){
	if (d){
	this.x += 1*speed;
	this.y += m*speed;
	} else {
	this.x -= 1 * speed;
	this.y += m * speed;
	}
}





}