import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent 
{
	private static final long serialVersionUID = 1L;
	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) 
	{
		figures.add(f);
	}

	public void paintComponent(Graphics g) 
	{
		for (BouncingFigure f : figures) 
		{
			f.draw(g); 
			f.move();
			double angle = f.getTrajectory()%360;
			if (f.rightBorderCollision(600))
			{
				if (angle == 0) 
				{
					f.setTrajectory(f.getTrajectory()+180);
				}
				if (angle > 0 && angle < 90)
				{
					f.setTrajectory(180-angle);
				}
				if (angle > 270 && angle < 360)
				{
					f.setTrajectory(180+(360-angle));
				}
			}
			if (f.upperBorderCollision()) 
			{
				if (angle == 90) 
				{
					f.setTrajectory(f.getTrajectory()+180);
				}
				if (angle > 0 && angle < 90)
				{
					f.setTrajectory(270+(90-angle));
				}
				if (angle > 90 && angle < 180)
				{
					f.setTrajectory(270-(angle-90));
				}
			}
			if (f.leftBorderCollision()) 
			{
				if (angle == 180) 
				{
					f.setTrajectory(f.getTrajectory()+180);
				}
				if (angle > 90 && angle < 180)
				{
					f.setTrajectory(180-angle);
				}
				if (angle > 180 && angle < 270)
				{
					f.setTrajectory(360-(270-angle));
				}
			}
			if (f.lowerBorderCollision(600)) 
			{
				if (angle == 270) 
				{
					f.setTrajectory(f.getTrajectory()+180);
				}
				if (angle > 180 && angle < 270)
				{
					f.setTrajectory(90+(270-angle));
				}
				if (angle > 270 && angle < 360)
				{
					f.setTrajectory(angle-270);
				}
			}
		}
	}
}