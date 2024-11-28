/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
import ca.qc.banq.rme.shared.marcrecord.payload.TagFieldTypePayload;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
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
//@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "custom_subfield")
@SuppressWarnings("serial")
public class CustomSubField implements Serializable {

	/**
	 * Identifiant (${field.code}{tag})
	 */
	@Id
	@Column(name = "id")
	private String id;
	
	@NotNull(message = "CustomSubField.tag.NotNull")
	@Enumerated(EnumType.STRING)
	@Column(name = "tag", nullable = false)
	private TagField tag;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@NotNull(message = "CustomSubField.field.NotNull")
	@JoinColumn(name = "field_id")
	private CustomDataField field;
	
	@NotNull(message = "CustomSubField.displayLabel.NotNull")
	@Column(name = "display_label", nullable = false)
	private String displayLabel;
	
	@NotNull(message = "CustomSubField.repeatable.NotNull")
	@Column(name = "repeatable", nullable = false, columnDefinition = "boolean default false")
	private Boolean repeatable = false;

	public CustomSubField(@NotNull(message = "CustomSubField.tag.NotNull") TagField tag,
			@NotNull(message = "CustomSubField.field.NotNull") CustomDataField field,
			@NotNull(message = "CustomSubField.displayLabel.NotNull") String displayLabel,
			@NotNull(message = "CustomSubField.repeatable.NotNull") Boolean repeatable) {
		super();
		this.tag = tag;
		this.field = field;
		this.displayLabel = displayLabel;
		this.repeatable = repeatable;
		this.id = "$".concat(field.getCode()).concat(tag.toString());
	}
	
	@PrePersist
	public void beforePersist() {
		if(StringUtils.isEmpty(this.id)) this.id = "$".concat(field.getCode()).concat(tag.toString());
	}
	public SubFieldDTO toDTO() {
		return new SubFieldDTO("$" + (this.field != null ? this.field.getCode() : "XXX") + this.tag.toString(), (this.field != null ? this.field.getCode() : "XXX"), this.tag, this.tag.getDisplayCode(), this.getDisplayLabel(), this.repeatable);
	}
	public TagFieldTypePayload toTagFieldTypePayload() {
		return new TagFieldTypePayload((this.field != null ? this.field.getCode() : "XXX"), this.tag, this.tag.getDisplayCode(), this.displayLabel, this.repeatable, "");
	}
	
}
