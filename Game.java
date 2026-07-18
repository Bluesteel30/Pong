import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Scanner; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.util.concurrent.TimeUnit;

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
        g.fillOval(b.x,b.y, b.radius,b.radius);
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
public void motion(int m) {
    while (b.y <= 200-m) {
    	b.move(m);
    	repaint();
    	if (b.y+m > 200-m){
    		m = -m;
    	}
    	System.out.println(b.y);
		try {
			TimeUnit.MILLISECONDS.sleep(20);
		} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
		}
    	}
}
	public static void main(String[] args){
		JFrame frame = new JFrame("Pong");
        Game panel = new Game();
        frame.setSize(400, 248);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); // Add the graphics panel to the frame
        frame.setVisible(true);
        panel.motion(1);

        
}
}