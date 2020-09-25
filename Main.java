import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Game_Wall gw = new Game_Wall();
		
		JFrame gm = new JFrame();
		gm.setTitle("Balloon Shooter");
		gm.setSize(630, 650);
		gm.add(gw);
		gm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gm.setVisible(true);
	 
	}

}
