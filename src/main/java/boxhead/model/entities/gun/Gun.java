package boxhead.model.entities.gun;

import java.util.Optional;

import javafx.geometry.Point2D;
import boxhead.model.entities.Entity;

/**
 * Represents a generic gun that creates a {@link Shot}
 */

public interface Gun extends Entity{

	/**
	 * Used to separate Gun types
	 */
	enum GunType {
		/**
		 * Pistol has low ammos and low rateOfFire
		 */
		PISTOL("Pistol"),
		/**
		 * Uzi has more ammos and higher rateOfFire
		 */
		UZI("Uzi"),
		/**
		 * Shotgun has highdamage and different type of shot
		 */
		SHOTGUN("Shotgun");
		
		private String name;
		
		GunType(final String name) {
			this.name = name;
		}
		
		/**
		 * @return
		 * 		The name of the gun
		 */
		public String getName() {
			return this.name;
		}
	}
	
	/**
	 * @return Gun's name
	 */
	String getName();
	
	/**	
	 * @return
	 * 			The shot shot		
	 */
	Optional<Shot> attack();
	
	/**
	 * @return
	 * 			The amount of damage of the shot
	 */
	int getDamage();
	
	/**
	 * @return
	 * 			The type of the weapon
	 */
	GunType getGunType();
}