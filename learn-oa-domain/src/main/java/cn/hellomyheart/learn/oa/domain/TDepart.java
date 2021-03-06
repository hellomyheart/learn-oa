package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TDepart implements Serializable {
    private Integer id;

    private String name;

    private Date createtime;

    private Integer num;

    private Integer flag;

    private static final long serialVersionUID = 1L;
}