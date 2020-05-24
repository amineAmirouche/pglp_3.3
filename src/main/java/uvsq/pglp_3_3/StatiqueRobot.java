package uvsq.pglp_3_3;

public class StatiqueRobot extends Robot {
	  /**
	  * constructeur du robot statique.
	  * @param positionn : la position actuelle et final du robot
	  * @param orientationn : l'orientation actuelle du robot
	  */
	  public StatiqueRobot(int positionn, int orientationn) {
	    position = positionn;
	    orientation = orientationn % 4;
	  }
	}