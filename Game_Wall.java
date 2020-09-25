import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game_Wall extends JPanel implements MouseMotionListener, KeyListener {
	
	Gun gun;
	Balloon [] balloons;
	Bullet[] bullets;
	int bulletCount = 0;
	static int score = 0;
	
	public Game_Wall(){
		super();
		
		bullets = new Bullet[10];
		balloons = new Balloon[15];
		
		int posX = 0;
		
		gun = new Gun(250,550,"image//pistol.png");
		
		for(int i = 0; i < balloons.length; i++){
			
			balloons[i] = new Balloon(posX,0,"image//balloon_blue.png",true);
			posX = posX + 40;
		}
		
		for(int i = 0; i < bullets.length; i++){
			
			bullets[i] = new Bullet(-100, -100,"image//bullet_ball_glass_red.png");
			
		}
		
		
		
		
		super.setFocusable(true);
		super.addKeyListener(this);
		super.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g){
		
		ImageIcon background = new ImageIcon("image//chalkboard-01.png");
		g.drawImage(background.getImage(),0,0,null);
		
		g.setColor(Color.WHITE);
		g.drawString("Score ::: " + score , 400, 400);
		
		
		for(int i = 0; i < bullets.length; i++){
			bullets[i].draw(g);
		}
		
		
		
		
		
		for(int i = 0; i < balloons.length; i++){
			if(balloons[i].isNotBurst() == true){
				balloons[i].draw(g);}}
		
		gun.draw(g);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	
		if(e.getX() < 570)	
			gun.setX(e.getX());
		
	
	
	
	
	
	
		
	super.repaint();

		
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		
		if(e.getKeyCode() == e.VK_UP){
					
					if(gun.getY() > 0)
						gun.setY(gun.getY() - 5);
					
					bullets[bulletCount].setY(gun.getY() + 10);
				}
				
				else if(e.getKeyCode() == e.VK_DOWN){
					
					if(gun.getY() < 550)
						gun.setY(gun.getY() + 5);
					
					bullets[bulletCount].setY(gun.getY() + 10);
				}
				
				else if(e.getKeyCode() == e.VK_SPACE){
					
					bullets[bulletCount].setX(gun.getX() + 1);
					bullets[bulletCount].setY(gun.getY());
				
					
					Bullet_Shooting bs = new Bullet_Shooting(this,balloons,bullets[bulletCount]);
					bs.start();
							
					
					bulletCount++;
					if(bulletCount == 10)
						bulletCount = 0;
					
				}
				
				
				
				super.repaint();
				
				
			
			
			
			
		}
		
		
		
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
