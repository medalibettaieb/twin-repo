package oneToManyUniMasterSide;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: H
 *
 */
@Entity

public class H implements Serializable {

	@Id
	private int idH;
	@ManyToOne
	private G g;
	private static final long serialVersionUID = 1L;

	public H() {
		super();
	}

	public int getIdH() {
		return this.idH;
	}

	public void setIdH(int idH) {
		this.idH = idH;
	}

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}

}
