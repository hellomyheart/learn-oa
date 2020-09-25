package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TAskforleave implements Serializable {
    private Integer id;

    private Integer sid;

    private Date starttime;

    private Date endtime;

    private Integer count;

    private String status;

    private String reason;

    private static final long serialVersionUID = 1L;
}