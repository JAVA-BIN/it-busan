package tk.meokeobolre.board.model;

import lombok.Data;
import java.util.Date;

@Data
public class BoardVo {
    private Long id;
    private String cook;
    private String category;
    private String manual;
    private String username;
    private String password;
    private Integer calorie;
    private Integer protein;
    private Integer fat;
    private Integer salt;
    private Date createdDate;
    private Date modifiedDate;
}
