package tr.com.tolaas.springdi.services;

import org.springframework.stereotype.Service;

@Service
public interface LanguageService {

    String getLabelString(String key);

}
