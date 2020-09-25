package cn.hellomyheart.learn.oa.teacher.service;

import cn.hellomyheart.learn.oa.domain.TLoginlog;
public interface TLoginlogService{


    int deleteByPrimaryKey(Integer id);

    int insert(TLoginlog record);

    int insertSelective(TLoginlog record);

    TLoginlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLoginlog record);

    int updateByPrimaryKey(TLoginlog record);

}
