package tk.meokeobolre.user.service.impl;

import beans.americano.user.entity.User;
import beans.americano.user.model.UserVo;
import beans.americano.user.repository.UserRepository;
import beans.americano.user.service.UserService;
import beans.americano.user.util.UserAuthCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("UserServiceImpl")
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public List<UserVo> userList() {
        List<UserVo> userVoList = new ArrayList<>();
        List<User> users =  userRepo.findAll();
        for (User user : users) {
            UserVo userVo = new UserVo();
            userVo.setId(user.getId());
            userVo.setName(user.getName());
            userVo.setPassword(user.getPassword());
            userVo.setEmail(user.getEmail());
            userVo.setAuthority(user.getAuthority());
            userVo.setCreatedDate(user.getCreatedDate());
            userVo.setModifiedDate(user.getModifiedDate());
            userVoList.add(userVo);
        }
        return userVoList;
    }

    @Override
    public UserVo userDetail(String userId) {
        User user = userRepo.findById(userId);
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setName(user.getName());
        userVo.setPassword(user.getPassword());
        userVo.setEmail(user.getEmail());
        userVo.setAuthority(user.getAuthority());
        userVo.setCreatedDate(user.getCreatedDate());
        userVo.setModifiedDate(user.getModifiedDate());
        return userVo;
    }

    @Override
    public void userCreate(UserVo userVo) {
        User user = new User();
        user.setId(userVo.getId());
        user.setName(userVo.getName());
        user.setPassword(userVo.getPassword());
        user.setEmail(userVo.getEmail());
        user.setAuthority(UserAuthCode.MEMBER.getValue());
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());
        userRepo.save(user);
    }

    @Override
    public void userUpdate(UserVo userVo) {
        User user = userRepo.findById(userVo.getId());

        user.setId(userVo.getId());
        user.setName(userVo.getName());
        user.setPassword(userVo.getPassword());
        user.setEmail(userVo.getEmail());
        user.setAuthority(UserAuthCode.MEMBER.getValue());
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());
        userRepo.save(user);
    }

    @Override
    public void userDelete(String userId) {
        if (userId != null) {
            userRepo.delete(userRepo.findById(userId));
        }
    }

    @Override
    public int userCheck(String userId, String password) {
        int check = -1;
        User user = userRepo.findById(userId);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                check = 1;
            } else {
                check = 0;
            }
        } else {
            check = -1;
        }
        return check;
    }

    private void userAuthorization() {
        //TODO 권한부여
    }

}
