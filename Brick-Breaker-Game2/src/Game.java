
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 
public class Game{
 
	public static void main(String[] args){
		JFrame window = new JFrame("Brick Breaker Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setContentPane(new GamePanel()); 
                window.pack();
		window.setVisible(true);
                window.setLocation(600,200);
	}

 
}