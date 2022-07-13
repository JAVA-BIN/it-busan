package tk.meokeobolre.board.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "BOARD_INFO_TB")
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "cook", nullable = false, columnDefinition = "varchar(50) comment '요리명'")
    private String cook;

    @JoinColumn(name = "category", nullable = false, columnDefinition = "varchar(50) comment '카테고리'")
    private String category;

    @Column(name = "manual", columnDefinition = "varchar(200) comment '메뉴얼'")
    private String manual;

    @Column(name = "username", columnDefinition = "varchar(50) comment '작성자 이름'")
    private String username;

    @Column(name = "password", columnDefinition = "varchar(50) comment '작성글 패스워드'")
    private String password;

    @Column(name = "calorie", columnDefinition = "varchar(50) comment '칼로리'")
    private Integer calorie;

    @Column(name = "protein", columnDefinition = "varchar(50) comment '프로'")
    private Integer protein;

    @Column(name = "fat", columnDefinition = "varchar(50) comment '살찐다'")
    private Integer fat;

    @Column(name = "salt", columnDefinition = "varchar(50) comment '소금'")
    private Integer salt;

    @CreatedDate
    @Column(name = "createdDate", columnDefinition = "datetime comment '생성 날짜'")
    private Date createdDate;

    @LastModifiedDate
    @Column(name = "modifiedDate", columnDefinition = "datetime comment '수정 날짜'")
    private Date modifiedDate;
}
