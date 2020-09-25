package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TStudent implements Serializable {
    private Integer id;

    private String uNo;

    private String name;

    private String sex;

    private Date birthday;

    private String cardno;

    private String schoolname;

    private String education;

    private String phone;

    private String email;

    private String qq;

    private String cno;

    private String introno;

    private Integer flag;

    private Date entrytime;

    private String gName;

    private static final long serialVersionUID = 1L;
}