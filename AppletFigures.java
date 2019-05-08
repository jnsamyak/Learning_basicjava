package appletfigures;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class AppletFigures extends Applet {

    Font bigFont;
Color bgColor;

    public void init()  { 
bigFont = new Font("Arial",Font.BOLD,16);         
bgColor = Color.DARK_GRAY;
setBackground(bgColor); 
    }

    public void stop() { }

    public void paint(Graphics g)  { 
g.setFont(bigFont); 
g.drawString("Hello Everyone",140,200);
g.setColor(Color.BLUE);
g.drawLine(90,400,180,70);
g.setColor(Color.PINK);
g.drawOval(200,10,200,500);
g.setColor(Color.red);
g.drawRect(70,90,200,50);
g.setColor(Color.magenta);
g.drawRect(100,10,100,100);
g.fillRect(10,10,80,80);
g.setColor(Color.CYAN);
g.fillArc(120,120,60,60,0,360);
g.setColor(Color.LIGHT_GRAY);
g.drawLine(140,140,160,160);
g.setColor(Color.black);
    }
}