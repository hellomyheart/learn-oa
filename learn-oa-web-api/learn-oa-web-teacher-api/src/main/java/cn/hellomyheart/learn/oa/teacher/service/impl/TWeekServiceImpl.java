package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TWeek;
import cn.hellomyheart.learn.oa.teacher.mapper.TWeekMapper;
import cn.hellomyheart.learn.oa.teacher.service.TWeekService;
@Service
public class TWeekServiceImpl implements TWeekService{

    @Resource
    private TWeekMapper tWeekMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tWeekMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TWeek record) {
        return tWeekMapper.insert(record);
    }

    @Override
    public int insertSelective(TWeek record) {
        return tWeekMapper.insertSelective(record);
    }

    @Override
    public TWeek selectByPrimaryKey(Integer id) {
        return tWeekMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TWeek record) {
        return tWeekMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TWeek record) {
        return tWeekMapper.updateByPrimaryKey(record);
    }

}
