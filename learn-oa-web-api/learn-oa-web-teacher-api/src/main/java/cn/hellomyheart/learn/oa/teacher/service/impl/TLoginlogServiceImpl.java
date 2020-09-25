package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TLoginlog;
import cn.hellomyheart.learn.oa.teacher.mapper.TLoginlogMapper;
import cn.hellomyheart.learn.oa.teacher.service.TLoginlogService;
@Service
public class TLoginlogServiceImpl implements TLoginlogService{

    @Resource
    private TLoginlogMapper tLoginlogMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tLoginlogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TLoginlog record) {
        return tLoginlogMapper.insert(record);
    }

    @Override
    public int insertSelective(TLoginlog record) {
        return tLoginlogMapper.insertSelective(record);
    }

    @Override
    public TLoginlog selectByPrimaryKey(Integer id) {
        return tLoginlogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TLoginlog record) {
        return tLoginlogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TLoginlog record) {
        return tLoginlogMapper.updateByPrimaryKey(record);
    }

}
