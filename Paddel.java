public class Paddel{
	public int size;
	public int x;
	public int y;

	public Paddel(int size, int x, int y){
		this.size = size;
		this.x = x;
		this.y = y;
	}

	public void move(boolean isGoal, char c){
		if (c == 'w' && this.y >= 5 && !isGoal){
        		this.y -= 5;
        	} else if (c == 's' && this.y <= 180 && !isGoal){
        		this.y += 5;
        	}
        }
}

