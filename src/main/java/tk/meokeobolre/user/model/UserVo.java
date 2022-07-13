package tk.meokeobolre.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserVo {

    private String id;
    private String name;
    private String password;
    private String email;
    private String authority;
    private Date createdDate;
    private Date modifiedDate;

}
