package cn.hellomyheart.learn.oa.student.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TStudent;
import cn.hellomyheart.learn.oa.student.mapper.TStudentMapper;
import cn.hellomyheart.learn.oa.student.service.TStudentService;
@Service
public class TStudentServiceImpl implements TStudentService{

    @Resource
    private TStudentMapper tStudentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tStudentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TStudent record) {
        return tStudentMapper.insert(record);
    }

    @Override
    public int insertSelective(TStudent record) {
        return tStudentMapper.insertSelective(record);
    }

    @Override
    public TStudent selectByPrimaryKey(Integer id) {
        return tStudentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TStudent record) {
        return tStudentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TStudent record) {
        return tStudentMapper.updateByPrimaryKey(record);
    }

}
