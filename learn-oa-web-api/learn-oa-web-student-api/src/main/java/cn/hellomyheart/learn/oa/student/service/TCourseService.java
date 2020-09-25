package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TCourse;
public interface TCourseService{


    int deleteByPrimaryKey(Integer id);

    int insert(TCourse record);

    int insertSelective(TCourse record);

    TCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCourse record);

    int updateByPrimaryKey(TCourse record);

}
