package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TLoginlog implements Serializable {
    private Integer id;

    private String ip;

    private String location;

    private String uNo;

    private Date createtime;

    private static final long serialVersionUID = 1L;
}