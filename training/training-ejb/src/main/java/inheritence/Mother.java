package inheritence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: Mother
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Mother implements Serializable {

	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public Mother() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
