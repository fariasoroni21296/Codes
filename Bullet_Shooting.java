import java.awt.*;
public class Bullet_Shooting extends Thread{
	 

			Bullet bullet;
			Balloon[] balloons;
			Game_Wall gameWall;
			
			
			
			public Bullet_Shooting(Game_Wall gameWall, Balloon[] balloons, Bullet bullet) {
				super();
				this.bullet = bullet;
				this.balloons = balloons;
				this.gameWall = gameWall;
			}



			public void run(){
				
				while(bullet.getY() > -10){
					
					bullet.setY(bullet.getY() - 1);
					checkCollision();
					
					try{
						Thread.sleep(10);
					}
					catch(Exception e){}
					
					gameWall.repaint();
					
				}
				
				
				
				
			}
			
			
			public void checkCollision(){
				
				Rectangle bulletRect = new Rectangle(bullet.getX(),bullet.getY(),8,8);
				
				for(int i = 0; i < balloons.length; i++){
					
					Rectangle balloonRect = new Rectangle(balloons[i].getX(),balloons[i].getY(),32,32);
					
					if(bulletRect.intersects(balloonRect) == true){
						Sound.bulletHitSound();
						
						Game_Wall.score++;
						balloons[i].setNotBurst(false);
						balloons[i].setX(-500);
						bullet.setX(5000);
						
					}
					
					
					
				}
				
				
				
			}
			
			
			
			
		}


