package tr.com.tolaas.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"TU", "default"})
@Service("languageService")
public class LanguageServiceTurkishImpl implements LanguageService {

    @Override
    public String getLabelString(String key) {
        switch (key) {
            case "hello":
            default:
                return "Merhaba Dünya!";
        }
    }
}
