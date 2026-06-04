package io.github.raphaelmun1z.auth_service_oauth2.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    private void populateUser(OAuth2AuthenticationToken token, Model model) {
        if (token != null) {
            var attrs = token.getPrincipal().getAttributes();
            model.addAttribute("name", attrs.get("name"));
            model.addAttribute("email", attrs.get("email"));
            model.addAttribute("photo", attrs.get("picture"));
        }
    }

    @GetMapping({"/", "/chat"})
    public String chat(OAuth2AuthenticationToken token, Model model) {
        populateUser(token, model);
        return "chat";
    }

    @GetMapping("/login")
    public String login() {
        return "custom-login";
    }

    @GetMapping("/profile")
    public String profile(OAuth2AuthenticationToken token, Model model) {
        populateUser(token, model);
        return "user-profile";
    }

}
