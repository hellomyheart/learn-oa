package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TUser;
public interface TUserService{


    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

}
