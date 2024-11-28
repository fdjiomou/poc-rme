package ca.qc.banq.rme.backend.config;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.ScheduledMethodRunnable;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoaderListener;

import ca.qc.banq.rme.backend.notice.service.INoticeService;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.annotation.WebListener;
import lombok.extern.slf4j.Slf4j;

/**
 * Service d'initialisation de l'application
 * @author <a href="mailto:francis.djiomou@banq.qc.ca">Francis DJIOMOU</a>
 * @version 1.0
 * @since 2018-08-27
 */
@Slf4j
@Component
@WebListener
public class ListenerConfig extends ContextLoaderListener {

	@Autowired
	TaskScheduler taskScheduler;
	
	@Autowired
	INoticeService business;


	/* (non-Javadoc)
	 * @see jakarta.servlet.ServletContextListener#contextInitialized(jakarta.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		try {
			log.info("Initialisation de la configuration par defaut");
			taskScheduler.schedule(new ScheduledMethodRunnable(business, "initNoticeDisplayConfig"), Instant.now() );
			
		} catch (Exception e) {
			log.error("Exception on [ListenerConfig - contextInitialized]",e);
		}
	}
	
	/* (non-Javadoc)
	 * @see jakarta.servlet.ServletContextListener#contextDestroyed(jakarta.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {}

}