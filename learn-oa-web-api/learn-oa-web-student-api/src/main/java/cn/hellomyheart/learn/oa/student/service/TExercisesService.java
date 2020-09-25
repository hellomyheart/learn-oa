package cn.hellomyheart.learn.oa.student.service;

import cn.hellomyheart.learn.oa.domain.TExercises;
public interface TExercisesService{


    int deleteByPrimaryKey(Integer id);

    int insert(TExercises record);

    int insertSelective(TExercises record);

    TExercises selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TExercises record);

    int updateByPrimaryKey(TExercises record);

}
