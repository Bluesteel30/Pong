import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Game extends JPanel{
	
	private int score;
	private	Paddel left = new Paddel(10, 50, 100);
	private	Paddel right = new Paddel(10, 350, 100);
	private	Ball b = new Ball(200,100, 10);


	public void increaseScore(){
		score++;
	}
	public void reset(){
		score = 0;
	}
	public int getScore(){
		return score;
	}

	@Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillRect(left.x, left.y, 5, 10);
        g.fillRect(right.x, right.y, 5 , 10);

    }

	public static void main(String[] args){
		JFrame frame = new JFrame("Pong");
        Game panel = new Game();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); // Add the graphics panel to the frame
        frame.setVisible(true);

	}
}