package tk.meokeobolre.user.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "USER_INFO_TB")
@Data
public class User {

    @Id
    @Column(name = "id", columnDefinition = "varchar(50) comment '유저 아이디'")
    private String id;

    @Column(name = "name", columnDefinition = "varchar(50) comment '유저 이름'")
    private String name;

    @Column(name = "password", columnDefinition = "varchar(50) comment '유저 패스워'")
    private String password;

    @Column(name = "email", columnDefinition = "varchar(50) comment '유저 이메일'")
    private String email;

    @Column(name = "authority", columnDefinition = "varchar(50) comment '유저 권한'")
    private String authority;

    @CreatedDate
    @Column(name = "createdDate", columnDefinition = "datetime comment '생성 날짜'")
    private Date createdDate;

    @LastModifiedDate
    @Column(name = "modifiedDate", columnDefinition = "datetime comment '수정 날짜'")
    private Date modifiedDate;

}
