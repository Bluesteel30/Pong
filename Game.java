import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Scanner; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;

public class Game extends JPanel{
	
	private int score;
	private	Paddel left = new Paddel(30, 50, 100);
	private	Paddel right = new Paddel(30, 350, 100);
	private	Ball b = new Ball(200,100, 10);
	Scanner scanner = new Scanner(System.in);



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

        g.fillRect(left.x, left.y, 8, left.size);
        g.fillRect(right.x, right.y, 8, right.size);
    }

    
public Game() {
    setFocusable(true);

    addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        right.move(e.getKeyChar());
        repaint();
    }
});
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