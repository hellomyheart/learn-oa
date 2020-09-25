package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.teacher.mapper.TAskforleaveMapper;
import cn.hellomyheart.learn.oa.domain.TAskforleave;
import cn.hellomyheart.learn.oa.teacher.service.TAskforleaveService;
@Service
public class TAskforleaveServiceImpl implements TAskforleaveService{

    @Resource
    private TAskforleaveMapper tAskforleaveMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tAskforleaveMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TAskforleave record) {
        return tAskforleaveMapper.insert(record);
    }

    @Override
    public int insertSelective(TAskforleave record) {
        return tAskforleaveMapper.insertSelective(record);
    }

    @Override
    public TAskforleave selectByPrimaryKey(Integer id) {
        return tAskforleaveMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TAskforleave record) {
        return tAskforleaveMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TAskforleave record) {
        return tAskforleaveMapper.updateByPrimaryKey(record);
    }

}
