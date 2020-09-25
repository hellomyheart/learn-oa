package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TStaff;
import cn.hellomyheart.learn.oa.teacher.mapper.TStaffMapper;
import cn.hellomyheart.learn.oa.teacher.service.TStaffService;
@Service
public class TStaffServiceImpl implements TStaffService{

    @Resource
    private TStaffMapper tStaffMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tStaffMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TStaff record) {
        return tStaffMapper.insert(record);
    }

    @Override
    public int insertSelective(TStaff record) {
        return tStaffMapper.insertSelective(record);
    }

    @Override
    public TStaff selectByPrimaryKey(Integer id) {
        return tStaffMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TStaff record) {
        return tStaffMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TStaff record) {
        return tStaffMapper.updateByPrimaryKey(record);
    }

}
