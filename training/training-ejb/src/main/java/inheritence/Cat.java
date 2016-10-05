package inheritence;

import inheritence.Animal;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cat
 *
 */
@Entity
public class Cat extends Animal implements Serializable {

	
	private String sound;
	private static final long serialVersionUID = 1L;

	public Cat() {
		super();
	}   
	public String getSound() {
		return this.sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
   
}
