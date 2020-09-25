package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser implements Serializable {
    private Integer id;

    private String no;

    private String password;

    private Integer role;

    private Integer flag;

    private String status;

    private Integer identity;

    private static final long serialVersionUID = 1L;
}