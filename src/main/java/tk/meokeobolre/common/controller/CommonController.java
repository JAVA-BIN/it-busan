package tk.meokeobolre.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CommonController {

    @GetMapping("/")
    public String main(HttpSession httpSession) {
        if (httpSession.getAttribute("id") == null) {
            return "login";
        }
        return "board/dashboard";
    }

    @GetMapping("/login")
    public String signin() {
        return "/login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "user/signup";
    }

}