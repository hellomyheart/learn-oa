package cn.hellomyheart.learn.oa.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TExercises implements Serializable {
    private Integer id;

    private String category;

    private String equestion;

    private String eanswer;

    private String flag;

    private static final long serialVersionUID = 1L;
}