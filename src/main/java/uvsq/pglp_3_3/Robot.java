package uvsq.pglp_3_3;

public abstract class Robot {
	  int position;
	  int orientation;
	  
	  /**
	   * methode qui permet la rotation du robot
	   */
	  public void tourne() {
	    orientation = (orientation + 1) % 4;
	  }
	}
