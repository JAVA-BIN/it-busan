package tk.meokeobolre.user.controller;

import tk.meokeobolre.user.model.UserVo;
import tk.meokeobolre.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/list")
    public List<UserVo> userList() {
        return userService.userList();
    }

    @GetMapping("/{userId}")
    public UserVo userDetail(@PathVariable String userId) {
        return userService.userDetail(userId);
    }

    @PostMapping("/create")
    public String userCreate(UserVo userVo) {
        userService.userCreate(userVo);
        return "index";
    }

    @PutMapping("/update")
    public void userUpdate(UserVo userVo) {
        userService.userUpdate(userVo);
    }

    @DeleteMapping("/delete")
    public String userDelete(String userId) {
        userService.userDelete(userId);
        return "signin";
    }

    @PostMapping("/auth")
    public String userAuthorization(UserVo userVo) {
        userService.userAuthorization(userVo);
        return "index";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(String userid, String password, String rememberMe, HttpSession session, HttpServletResponse response) {
        int check = userService.userCheck(userid, password);
        if (check != 1) { // 로그인 실패일 때
            String message = "";
            if (check == 0) {
                message = "패스워드가 다릅니다.";
            } else if (check == -1) {
                message = "존재하지 않는 아이디 입니다";
            }
            HttpHeaders headers = new HttpHeaders();
            StringBuilder sb = new StringBuilder();
            headers.add("Content-Type", "text/html; charset=UTF-8");
            sb.append("<script>");
            sb.append("alert('"+message+"');");
            sb.append("history.back();");
            sb.append("</script>");
            return new ResponseEntity<String>(sb.toString(), headers, HttpStatus.OK);
        } // 로그인 실패
        // 로그인 성공
        session.setAttribute("id", userid);
        // 로그인 상태유지 여부확인 후
        // 쿠키생성 응답시 보내기
        if (rememberMe != null && rememberMe.equals("true")) {
            Cookie cookie = new Cookie("id", userid);
            cookie.setMaxAge(60 * 10); // 초단위 // 10분 = 600초
            cookie.setPath("/"); // 쿠키경로 설정
            response.addCookie(cookie); // 응답객체에 추가
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/"); // redirect 경로 위치 지정
        // 리다이렉트일 경우 JHttpStatus.FOUND 지정해야 함.
        return  new ResponseEntity<String>(headers, HttpStatus.FOUND);
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        // 세션값 초기화
        session.invalidate();
        // 로그인 상태유지용 쿠키 삭제하기
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("id")) {
                    cookie.setMaxAge(0); // 쿠키 유효기간 0초로 설정 -> 브라우저가 해당쿠키를 삭제처리함.
                    cookie.setPath("/"); // 삭제할 쿠키 경로도 동일해야함
                    response.addCookie(cookie);
                }
            }
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/html; charset=UTF-8");
        StringBuilder sb = new StringBuilder();
        sb.append("<script>");
        sb.append("alert('로그아웃 되었습니다.');");
        sb.append("location.href = '/';");
        sb.append("</script>");
        return new ResponseEntity<String>(sb.toString(), headers, HttpStatus.OK);
    } // logout

}
