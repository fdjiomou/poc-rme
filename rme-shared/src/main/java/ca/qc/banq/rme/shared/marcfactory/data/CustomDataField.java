/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "custom_datafield")
@SuppressWarnings("serial")
public class CustomDataField implements Serializable {

	@Id
	@Column(name = "code")
	private String code;
	
	@NotNull(message = "CustomDataField.displayLabel.NotNull")
	@Column(name = "display_label", nullable = false)
	private String displayLabel;
	
	@NotNull(message = "CustomDataField.repeatable.NotNull")
	@Column(name = "repeatable", nullable = false)
	private Boolean repeatable = false;
	
	@Column(name = "required", nullable = false, columnDefinition = "boolean default false")
	private Boolean required = false;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "field")
	Set<CustomSubField> subfields = new HashSet<CustomSubField>();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomDataField other = (CustomDataField) obj;
		return Objects.equals(code, other.code);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	
}
