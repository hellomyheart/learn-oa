package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TAskforleave;
public interface TAskforleaveService{


    int deleteByPrimaryKey(Integer id);

    int insert(TAskforleave record);

    int insertSelective(TAskforleave record);

    TAskforleave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAskforleave record);

    int updateByPrimaryKey(TAskforleave record);

}
