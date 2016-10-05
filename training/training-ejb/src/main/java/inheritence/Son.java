package inheritence;

import inheritence.Mother;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Son
 *
 */
@Entity

public class Son extends Mother implements Serializable {

	
	private String name;
	private static final long serialVersionUID = 1L;

	public Son() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
