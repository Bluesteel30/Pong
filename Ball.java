public class Ball{

public int x;
public int y;
public int radius;
public int speed;

public Ball(int x,int y, int r, int speed){
	this.x = x;
	this.y = y;
	radius = r;
	this.speed = speed;
}

public void move(boolean d, int m){
	if (d){
	this.x += 1*this.speed;
	this.y += m*this.speed;
	} else {
	this.x -= 1 * this.speed;
	this.y += m * this.speed;
	}
}






}