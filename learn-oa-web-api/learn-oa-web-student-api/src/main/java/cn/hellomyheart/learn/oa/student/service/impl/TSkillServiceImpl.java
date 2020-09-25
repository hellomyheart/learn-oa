package cn.hellomyheart.learn.oa.student.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.student.mapper.TSkillMapper;
import cn.hellomyheart.learn.oa.domain.TSkill;
import cn.hellomyheart.learn.oa.student.service.TSkillService;
@Service
public class TSkillServiceImpl implements TSkillService{

    @Resource
    private TSkillMapper tSkillMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tSkillMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TSkill record) {
        return tSkillMapper.insert(record);
    }

    @Override
    public int insertSelective(TSkill record) {
        return tSkillMapper.insertSelective(record);
    }

    @Override
    public TSkill selectByPrimaryKey(Integer id) {
        return tSkillMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSkill record) {
        return tSkillMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TSkill record) {
        return tSkillMapper.updateByPrimaryKey(record);
    }

}
