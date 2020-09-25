package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TStaff implements Serializable {
    private Integer id;

    private String uNo;

    private String dId;

    private String dName;

    private String name;

    private String sex;

    private String email;

    private String qq;

    private String phone;

    private String heading;

    private Date entrytime;

    private Integer flag;

    private static final long serialVersionUID = 1L;
}