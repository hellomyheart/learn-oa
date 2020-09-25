package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TVip;
public interface TVipService{


    int deleteByPrimaryKey(Integer id);

    int insert(TVip record);

    int insertSelective(TVip record);

    TVip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TVip record);

    int updateByPrimaryKey(TVip record);

}
