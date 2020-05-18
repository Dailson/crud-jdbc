/**
 * 
 */
package model.entities;

import java.io.Serializable;

/**
 * Department
 *
 * @author dailson
 *
 */
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;

	public Department() {

	}

	/**
	 * @param id
	 * @param name
	 */
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder strbBuilder = new StringBuilder();

		strbBuilder.append("Id: " + this.getId() + "\n");
		strbBuilder.append("Name: " + this.getName() + "\n");

		return strbBuilder.toString();
	}

}
