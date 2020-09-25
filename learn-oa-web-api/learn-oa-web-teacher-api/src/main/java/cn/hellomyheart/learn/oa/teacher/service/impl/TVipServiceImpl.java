package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.teacher.mapper.TVipMapper;
import cn.hellomyheart.learn.oa.domain.TVip;
import cn.hellomyheart.learn.oa.teacher.service.TVipService;
@Service
public class TVipServiceImpl implements TVipService{

    @Resource
    private TVipMapper tVipMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tVipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TVip record) {
        return tVipMapper.insert(record);
    }

    @Override
    public int insertSelective(TVip record) {
        return tVipMapper.insertSelective(record);
    }

    @Override
    public TVip selectByPrimaryKey(Integer id) {
        return tVipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TVip record) {
        return tVipMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TVip record) {
        return tVipMapper.updateByPrimaryKey(record);
    }

}
