package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TGrade;
public interface TGradeService{


    int deleteByPrimaryKey(Integer id);

    int insert(TGrade record);

    int insertSelective(TGrade record);

    TGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGrade record);

    int updateByPrimaryKey(TGrade record);

}
