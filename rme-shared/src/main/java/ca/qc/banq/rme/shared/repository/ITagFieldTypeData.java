/**
 * 
 */
package ca.qc.banq.rme.shared.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.qc.banq.rme.shared.marcfactory.data.TagFieldTypeData;

/**
 * 
 */
@Repository
public interface ITagFieldTypeData extends JpaRepository<TagFieldTypeData, String> {
}
