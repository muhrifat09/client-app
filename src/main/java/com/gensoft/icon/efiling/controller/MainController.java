package com.gensoft.icon.efiling.controller;

import com.gensoft.icon.efiling.config.AccessToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping("/")
    public String landing(Model model) {
        String token = AccessToken.getAccessToken();
        System.out.println("home " + token);
        return "home";
    }

    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
        String nama = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String token = AccessToken.getAccessToken();
        System.out.println("alhamdulillah " + nama + " xx " + token);
        return "dashboard";
    }
}
