/**
 * 
 */
package ca.qc.banq.rme.shared.datamodel;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;
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
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(callSuper = false)
@SuppressWarnings("serial")
@MappedSuperclass
//@Table(name = "tk_tpsentitybase")
//@Inheritance(strategy = InheritanceType.JOINED)
public class MonitoredData implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull(message = "MonitoredData.DateCreation.NotNull")
    @Column(name="date_creation", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date ddc = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_modif")
    private Date ddm;

    @Column(name="user_create")
    private String userCreate = "System";

    @Column(name="user_modif")
    private String userUpdate;


	/**
	 * Version de l'enregistrement
	 */
	@Version
	@Column(name = "version")
	private Integer version = 1;

    @PrePersist
    public void beforeCreate() {
    	setDdc(new Date());
    }
    @PreUpdate
    public void beforeUpdate() {
    	setDdm(new Date());
    }
}
