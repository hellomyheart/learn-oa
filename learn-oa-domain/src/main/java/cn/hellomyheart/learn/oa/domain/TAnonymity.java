package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TAnonymity implements Serializable {
    private Integer id;

    private String content;

    private String uNo;

    private static final long serialVersionUID = 1L;
}