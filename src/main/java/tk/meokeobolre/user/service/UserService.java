package tk.meokeobolre.user.service;

import tk.meokeobolre.user.model.UserVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserVo> userList();
    UserVo userDetail(String userId);
    void userCreate(UserVo userVo);
    void userUpdate(UserVo userVo);
    void userDelete(String userId);
    int userCheck(String userId, String password);

}
