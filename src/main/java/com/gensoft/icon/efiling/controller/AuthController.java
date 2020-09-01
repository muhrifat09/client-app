package com.gensoft.icon.efiling.controller;

import com.gensoft.icon.efiling.config.AccessToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class AuthController {

//    @RequestMapping(value = "/authlogout", method = RequestMethod.GET)
//    public String appLogout() {
//        return "redirect:" + authEndPoint + logoutUrl;
//    }

    @RequestMapping(value = "/authcek", method = RequestMethod.GET)
    public void cek(@RequestParam(required = false) String code,
                    RedirectAttributes redirectAttributes, HttpSession sessionObj, HttpServletResponse response) throws IOException {
        if (!code.isEmpty()) {
            //tukarkan code dengan access_token
            //bawa access_token untuk akses halaman yang dipagari dengan oauth
            String token = AccessToken.getAccessToken();

            if (token != null) {
                response.sendRedirect("/dashboard");
            } else {
                response.sendRedirect("/authlogin");
            }
        } else {
            response.sendRedirect("/authlogin");
        }
    }

}
