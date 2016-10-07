import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;;

public class BouncingCircle extends BouncingFigure 
{

    private int height;
    private int width;

    BouncingCircle(int xLeft, int yTop, int height, int width, double trajectory, int speed) 
    {
        setXLeft(xLeft);
        setYTop(yTop);
        setTrajectory(trajectory);
        setSpeed(speed);
        this.height=height;
        this.width=width;
    }

    public void draw(Graphics g) 
    {
        // TODO Auto-generated method stub
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double (getXLeft(),getYTop(), this.height, this.width);
        g2.setColor(Color.GREEN);
        g2.fill(circle);
        g2.draw(circle);
    }

    //Methods to test of object hit each of four possible borders
    public boolean rightBorderCollision(int screenLimit)
    {
        if(getXLeft()+this.width > screenLimit)
            return true;
        return false;
    }

    public boolean leftBorderCollision()
    {
        if(getXLeft() < 0)
            return true;
        return false;
    }

    public boolean upperBorderCollision()
    {
        if(getYTop() < 0)
            return true;
        return false;
    }

    public boolean lowerBorderCollision(int screenLimit)
    {
        if(getYTop()+this.height > screenLimit)
            return true;
        return false;
    }
}