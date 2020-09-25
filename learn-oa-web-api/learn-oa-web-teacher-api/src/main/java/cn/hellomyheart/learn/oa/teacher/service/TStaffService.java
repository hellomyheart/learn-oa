package cn.hellomyheart.learn.oa.teacher.service;

import cn.hellomyheart.learn.oa.domain.TStaff;
public interface TStaffService{


    int deleteByPrimaryKey(Integer id);

    int insert(TStaff record);

    int insertSelective(TStaff record);

    TStaff selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TStaff record);

    int updateByPrimaryKey(TStaff record);

}
