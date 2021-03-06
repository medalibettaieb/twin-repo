package inheritence;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Dog
 *
 */
@Entity
public class Dog extends Animal implements Serializable {

	private String breed;
	private static final long serialVersionUID = 1L;

	public Dog() {
		super();
	}

	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
