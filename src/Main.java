import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Polygon poly ;
	

	public Main() {
		this.poly = new Polygon(new int[]{10,20,30,40}, new int[]{10,20,30,40},4);
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.fillPolygon(poly);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 800, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Main());
		

	}

}
