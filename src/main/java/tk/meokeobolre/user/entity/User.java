package tk.meokeobolre.user.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "USER_INFO_TB")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userid",unique = true, nullable = false, columnDefinition = "varchar(50) comment '유저 아이디'")
    private String userid;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(50) comment '유저 이름'")
    private String name;

    @Column(name = "password", nullable = false, columnDefinition = "varchar(50) comment '유저 패스워드'")
    private String password;

    @Column(name = "email", columnDefinition = "varchar(50) comment '유저 이메일'")
    private String email;

    @Column(name = "adress", columnDefinition = "varchar(50) comment '유저 이메일'")
    private String address;

    @Column(name = "authority", columnDefinition = "varchar(50) comment '유저 권한'")
    private String authority;

    @CreatedDate
    @Column(name = "createdDate", columnDefinition = "datetime comment '생성 날짜'")
    private Date createdDate;

    @LastModifiedDate
    @Column(name = "modifiedDate", columnDefinition = "datetime comment '수정 날짜'")
    private Date modifiedDate;

}
