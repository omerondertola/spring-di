package tr.com.tolaas.springdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tr.com.tolaas.springdi.services.LanguageService;

@Controller
public class LanguageAwareController {

    private final LanguageService languageService;

    @Autowired
    public LanguageAwareController(LanguageService languageService) {
        this.languageService = languageService;
    }

    public String getLabelString(String key) {
        return languageService.getLabelString(key);
    }
}
