package Model;

import Enums.PowerupTyp;

public class Powerup implements Runnable{
	private PowerupTyp typ;
	private Snaketriz snaketriz;
	
	public Powerup(String powerUpTyp){
		switch (PowerupTyp.valueOf(powerUpTyp)) {
		case OWN_MOVE_FAST:			
			break;
		case OWN_MOVE_SLOW:
			break;
		case ENEMY_MOVE_FAST:
			break;
		case ENEMY_MOVE_SLOW:
			break;
		case TABOO:
			break;
		case CONTROL_SWITCH:
			break;
		case RANDOM:
			break;
		case CHAINSAW:
			break;
		default:
			break;
		}
	}
	
	private void generate() {
		
	}

	private void start() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
