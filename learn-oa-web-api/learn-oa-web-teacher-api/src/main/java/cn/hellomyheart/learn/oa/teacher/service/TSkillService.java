package cn.hellomyheart.learn.oa.teacher.service;

import cn.hellomyheart.learn.oa.domain.TSkill;
public interface TSkillService{


    int deleteByPrimaryKey(Integer id);

    int insert(TSkill record);

    int insertSelective(TSkill record);

    TSkill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSkill record);

    int updateByPrimaryKey(TSkill record);

}
