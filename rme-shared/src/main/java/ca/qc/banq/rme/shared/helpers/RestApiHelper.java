package ca.qc.banq.rme.shared.helpers;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestApiHelper {

    /**
     * Genere un entete http avec token d'authentification
     * @param token
     * @return
     */
    public static HttpHeaders buildHeaders(String token) {

        // Initialisation du Header
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        // Ajout du token d'acces
        if(token != null && !token.isEmpty()) requestHeaders.setBearerAuth(token);
        return requestHeaders;
    }

    /**
     * Execution d'un webservice REST
     * @param <T>
     * @param url
     * @param method
     * @param queryParams
     * @param returnType
     * @param body
     * @param requestHeaders
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T> T callRestAPI(String url, HttpMethod method, Map<String, Object> queryParams, Class<T> returnType, Object body, HttpHeaders requestHeaders) {

        // Initialisation de la ressource bindee sur l'URL d'envoi
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl( url );

        // Si la la map des parametres est non vide
        if(queryParams != null && !queryParams.isEmpty()) {
            for(Map.Entry<String, Object> entry : queryParams.entrySet()) {
                builder.queryParam(entry.getKey(), entry.getValue());
            }
        }

        // Initialisation de l'objet RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        if(requestHeaders == null) requestHeaders = getDefaultRequestHeaders();

        // objet contenant le corps et les param�tres entete
        HttpEntity<?> request = new HttpEntity(body, requestHeaders);

        // Logs
        log.warn("URI = " + builder.build().toUri());
        log.warn("REQUEST = " + request);

        // Envoi de la requete
        ResponseEntity<T> responseEntity = restTemplate.exchange(builder.build().toUri(), method, request, returnType );
        return responseEntity.getStatusCode().is2xxSuccessful() ? new ObjectMapper().convertValue(responseEntity.getBody(), returnType) : null;
    }

    private static HttpHeaders getDefaultRequestHeaders() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        return requestHeaders;
    }

}
