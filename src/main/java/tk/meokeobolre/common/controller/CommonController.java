package tk.meokeobolre.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CommonController {

    @GetMapping("/")
    public String main(HttpSession httpSession) {
        if (httpSession.getAttribute("id") == null) {
            return "index";
        }
        return "board/list";
    }

    @GetMapping("/signin")
    public String signin() {
        return "sign/signin";
    }

    @GetMapping("/signup")
    public String signup() {
        return "sign/signup";
    }

}