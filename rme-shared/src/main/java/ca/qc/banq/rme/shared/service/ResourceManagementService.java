/**
 * 
 */
package ca.qc.banq.rme.shared.service;


import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import ca.qc.banq.rme.shared.enums.AppLang;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@Slf4j
@Service
public class ResourceManagementService {


	@Autowired
	private MessageSource messageSource;

    @Autowired
    SpringTemplateEngine templateEngine;

	@Autowired
	ResourceLoader resourceLoader;
	
	/**
	 * Service de traduction des codes de messages
	 * @param resolver
	 * @param language
	 * @param messageArguments
	 * @return
	 */
	public String getMessage(String resolver, AppLang language, Object... messageArguments) {
		String msg = resolver;
		try {
			msg = this.messageSource.getMessage(resolver, messageArguments, language != null ? language.getLocale() : AppLang.fr.getLocale());
		} catch(Exception e) {log.debug("no entry found for key message: " + resolver);}
		
		return msg;
	}
	

	/**
	 * Service d'evaluation des templates thymeleaf
	 * @param templateName
	 * @param variables
	 * @return
	 */
    public String getTemplateAsString(String templateName, Map<String, Object> variables) {
    	Context myContext = new Context();
        if(variables != null && !variables.isEmpty()) myContext.setVariables(variables);
        String htmlTemplate = templateEngine.process(templateName, myContext);
        return htmlTemplate;
    }

	/**
	 * Evalue un template thymeleaf et retourne le contenu sous forme de texte
	 * @param filePath
	 * @return
	 * @throws Exception
	 */
	public String readTemplateAsString(String filePath) throws Exception {
		return IOUtils.toString(resourceLoader.getResource("classpath:" + filePath).getInputStream(), "UTF-8");
	}
	
}
