package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TAnonymity;
public interface TAnonymityService{


    int deleteByPrimaryKey(Integer id);

    int insert(TAnonymity record);

    int insertSelective(TAnonymity record);

    TAnonymity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAnonymity record);

    int updateByPrimaryKey(TAnonymity record);

}
