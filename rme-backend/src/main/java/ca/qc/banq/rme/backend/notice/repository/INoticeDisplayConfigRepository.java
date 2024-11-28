/**
 * 
 */
package ca.qc.banq.rme.backend.notice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.qc.banq.rme.backend.notice.datamodel.NoticeDisplayConfig;

/**
 * 
 */
@Repository
public interface INoticeDisplayConfigRepository extends JpaRepository<NoticeDisplayConfig, Long> {}
