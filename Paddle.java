package Pong_GAME_JAVA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle{
  int id;
  int yVelocity;
  int speed = 10;

  Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
    super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
    this.id = id;
  }
  public void keyPressed(KeyEvent e){
    switch(id){
      case 1:
        if(e.getKeyCode()==KeyEvent.VK_W){
          setYDirection(-speed);
          move();
        }
        if(e.getKeyCode()==KeyEvent.VK_S){
          setYDirection(speed);
          move();
        }
        break;
        case 2:
        if(e.getKeyCode()==KeyEvent.VK_UP){
          setYDirection(-speed);
          move();
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
          setYDirection(speed);
          move();
        }
        break;
    }
  }
  public void keyReleased(KeyEvent e){
    switch(id){
      case 1:
        if(e.getKeyCode()==KeyEvent.VK_W){
          setYDirection(0);
          move();
        }
        if(e.getKeyCode()==KeyEvent.VK_S){
          setYDirection(0);
          move();
        }
        break;
        case 2:
        if(e.getKeyCode()==KeyEvent.VK_UP){
          setYDirection(0);
          move();
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
          setYDirection(0);
          move();
        }
        break;
    }
  }
  public void setYDirection(int yDirection){
    yVelocity = yDirection;
  }

  public void move(){
    y = y + yVelocity;
  }
  public void draw(Graphics g){
    g.setColor(id == 1 ? Color.blue : Color.red);

    int unit = width;          // 25 px (largura = altura de cada quadrado)
    for (int i = 0; i < 5; i++) {
        int blockY = y + i * unit;
        g.fillRect(x, blockY, width, unit);
      }
    }
  }

