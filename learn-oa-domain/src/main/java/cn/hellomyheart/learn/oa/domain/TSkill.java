package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TSkill implements Serializable {
    private Integer id;

    private String content;

    private Date createtime;

    private String uNo;

    private static final long serialVersionUID = 1L;
}