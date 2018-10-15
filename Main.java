package trials;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//for processing the entering of key 's'
import javax.swing.JFrame;
import javax.swing.JTextField;
// for text field to enter 's'
import java.util.Timer;
import java.util.TimerTask;
//timer

public class Main {
	Timer timer = new Timer();
	   double timePassed = 0.00;
	   TimerTask task = new TimerTask() {
		   public void run() {
			  timePassed++;
			  System.out.println("Time passed: "+ timePassed);
			
			  if(timePassed == 18.0) {
			  System.exit(0);
			  }
			  
		   }
	   };
	   public void start() {
	  timer.scheduleAtFixedRate(task,1000,1000);
      
	   }

  public static void main(String[] argv) throws Exception {
	
	 
    JTextField component = new JTextField();
    component.addKeyListener(new MyKeyListener());
   //makes a textfield where you can type in s; 
    JFrame f = new JFrame();

   f.add(component);
    f.setSize(300, 300);
    f.setVisible(true);
   
    timer run = new timer ();
	run.start();
	// runs timer
	
	//System.exit(0);
	//if i put it here is stops before even running
	
  }

  
}
class MyKeyListener extends KeyAdapter {
	
	   public void keyPressed(KeyEvent evt) {
	     if (evt.getKeyChar() == 's') {
	    	 //the character is s but can be changed to any other letter
	    System.err.println("                             Suject Detects Pain");	 
	    
	    //there is a discrepency between then subjects hits s and system stopping so put in the println line
	    //to indicate exactly when the person hit s
	     System.exit(0);
	    	 //basically once s is hit prints subject detects pain in rain and stops entire program
	     // it can be removed in order to collect multiple data points over a period of time
	    }
	     }
	     //if (evt.getKeyCode() == KeyEvent.VK_HOME) {
	      // System.out.println("Check for key codes: " + evt.getKeyCode());
	     //}
	   //usless extraneous code
	   }

