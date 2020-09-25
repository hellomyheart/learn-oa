package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TDepart;
import cn.hellomyheart.learn.oa.teacher.mapper.TDepartMapper;
import cn.hellomyheart.learn.oa.teacher.service.TDepartService;
@Service
public class TDepartServiceImpl implements TDepartService{

    @Resource
    private TDepartMapper tDepartMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tDepartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TDepart record) {
        return tDepartMapper.insert(record);
    }

    @Override
    public int insertSelective(TDepart record) {
        return tDepartMapper.insertSelective(record);
    }

    @Override
    public TDepart selectByPrimaryKey(Integer id) {
        return tDepartMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TDepart record) {
        return tDepartMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TDepart record) {
        return tDepartMapper.updateByPrimaryKey(record);
    }

}
