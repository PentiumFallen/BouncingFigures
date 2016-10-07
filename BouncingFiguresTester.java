import javax.swing.JFrame;

public class BouncingFiguresTester {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        JFrame frame= new JFrame();
        frame.setTitle("Silly name is silly");
        frame.setLocation(300, 50);
        frame.setSize(650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a box to put all objects in
        BouncingBox box = new BouncingBox();
        
        // Add all the components to the box
        BouncingFigure figure1 = new BouncingRectangle(0, 0, 10, 10, 325.0, 200);
        box.add(figure1);
        BouncingFigure figure2 = new BouncingRectangle(0, 500, 10, 10, 45.0, 100);
        box.add(figure2);
        BouncingFigure figure3 = new BouncingRectangle(500, 20, 25, 25, 220.0, 200);
        box.add(figure3);
        BouncingFigure figure4 = new BouncingRectangle(300, 550, 10, 50, 90.0, 250);
        box.add(figure4);
        BouncingFigure figure5 = new BouncingCircle(50, 150, 15, 15, 300.0, 300);
        box.add(figure5);
        BouncingFigure figure6 = new BouncingCircle(500, 450, 20, 20, 200.0, 450);
        box.add(figure6);
        BouncingFigure figure7 = new BouncingCircle(305, 295, 10, 10, 360.0, 250);
        box.add(figure7);
        
        frame.add(box);
        
        // Make the frame visible
        frame.setVisible(true);
        
        // Continuously update the frame since some components will change position
        while(true) 
        {
            try
            {
                Thread.sleep(100); // Wait for 0.1 second = 100 milliseconds
            }
            catch(InterruptedException e){}
            
            frame.repaint();
            
        } // end while

    }//end main

}//end class
