import java.awt.Graphics;

import javax.swing.*;
public class Balloon {
	private int x,y;
	private String imagePath;
	private boolean isNotBurst;
	public Balloon(int x, int y, String imagePath, boolean isNotBurst) {
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
		this.isNotBurst = isNotBurst;
	}

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public boolean isNotBurst() {
		return isNotBurst;
	}


	public void setNotBurst(boolean isNotBurst) {
		this.isNotBurst = isNotBurst;
	}
	
	
	public void draw(Graphics g){
		
		ImageIcon balloon = new ImageIcon(imagePath);
		g.drawImage(balloon.getImage(), x, y, null);
		
	}
	
	

}

