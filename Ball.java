public class Ball{

public int x;
public int y;
public int radius;

public Ball(int x,int y, int r){
	this.x = x;
	this.y = y;
	radius = r;
}

public void move(int m){
	this.x += 1;
	this.y += m;
}





}