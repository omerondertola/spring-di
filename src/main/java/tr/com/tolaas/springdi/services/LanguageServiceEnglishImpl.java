package tr.com.tolaas.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("languageService")
public class LanguageServiceEnglishImpl implements LanguageService {

    @Override
    public String getLabelString(String key) {
        switch (key) {
            case "hello":
            default:
                return "Hello World!";
        }
    }
}
