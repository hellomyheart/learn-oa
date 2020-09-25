package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TDepart;
public interface TDepartService{


    int deleteByPrimaryKey(Integer id);

    int insert(TDepart record);

    int insertSelective(TDepart record);

    TDepart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDepart record);

    int updateByPrimaryKey(TDepart record);

}
