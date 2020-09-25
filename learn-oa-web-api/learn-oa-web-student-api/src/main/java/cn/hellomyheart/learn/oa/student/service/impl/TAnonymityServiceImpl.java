package cn.hellomyheart.learn.oa.student.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.student.mapper.TAnonymityMapper;
import cn.hellomyheart.learn.oa.domain.TAnonymity;
import cn.hellomyheart.learn.oa.student.service.TAnonymityService;
@Service
public class TAnonymityServiceImpl implements TAnonymityService{

    @Resource
    private TAnonymityMapper tAnonymityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tAnonymityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TAnonymity record) {
        return tAnonymityMapper.insert(record);
    }

    @Override
    public int insertSelective(TAnonymity record) {
        return tAnonymityMapper.insertSelective(record);
    }

    @Override
    public TAnonymity selectByPrimaryKey(Integer id) {
        return tAnonymityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TAnonymity record) {
        return tAnonymityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TAnonymity record) {
        return tAnonymityMapper.updateByPrimaryKey(record);
    }

}
