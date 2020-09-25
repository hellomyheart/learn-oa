package cn.hellomyheart.learn.oa.teacher.service;

import cn.hellomyheart.learn.oa.domain.TWeek;
public interface TWeekService{


    int deleteByPrimaryKey(Integer id);

    int insert(TWeek record);

    int insertSelective(TWeek record);

    TWeek selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TWeek record);

    int updateByPrimaryKey(TWeek record);

}
