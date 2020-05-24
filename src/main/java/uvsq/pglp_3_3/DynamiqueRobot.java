package uvsq.pglp_3_3;

public class DynamiqueRobot extends Robot {
	  /**
	   * constructeur du robot dynamique.
	   * @param position : la position actuelle du robot
	   * @param orientation : l'orientation actuelle du robot
	   */
	  public DynamiqueRobot(int positionn, int orientationn) {
	    position = positionn;
	    orientation = orientationn % 4;
	  }

	  /**
	   * methode qui fait avancer le robot.
	   */
	  public void avance() {
	    position++;
	  }
	}
