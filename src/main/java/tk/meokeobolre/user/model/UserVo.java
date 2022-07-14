package tk.meokeobolre.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserVo {

    private long id;
    private String userid;
    private String name;
    private String password;
    private String email;
    private String address;
    private String authority;
    private Date createdDate;
    private Date modifiedDate;

}
