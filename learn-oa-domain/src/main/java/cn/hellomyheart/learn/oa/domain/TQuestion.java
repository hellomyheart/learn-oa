package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TQuestion implements Serializable {
    private Integer id;

    private String uNo;

    private String question;

    private String answer;

    private String qtype;

    private Integer star;

    private String flag;

    private static final long serialVersionUID = 1L;
}