/**
 * 
 */
package ca.qc.banq.rme.shared.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.qc.banq.rme.shared.marcfactory.data.CustomDataField;

/**
 * 
 */
@Repository
public interface ICustomDataFieldRepository extends JpaRepository<CustomDataField, String> {

}
