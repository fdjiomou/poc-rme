/**
 * 
 */
package ca.qc.banq.rme.backend.notice.datamodel;

import java.io.Serializable;

import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * Configuration definissant les champs a afficher pour la vue libelle des notice
 * francis.djiomou since Nov 14, 2024
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "noticedisplay_cfg")
@SuppressWarnings("serial")
public class NoticeDisplayConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    
    @Column(name="ordre")
    private Integer ordre;
    
    @Enumerated(EnumType.STRING)
    @NotNull(message = "NoticeDisplayConfig.tag.NotNull")
    @Column(name="tag")
    private DataFieldType tag;
    
    @Enumerated(EnumType.STRING)
    @NotNull(message = "NoticeDisplayConfig.subfield.NotNull")
    @Column(name="subfield")
    private TagField subfield;

    @Column(name="css_style")
    private String cssStyle;

    @Column(name="title")
    private String title;
}
