package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TGrade;
import cn.hellomyheart.learn.oa.teacher.mapper.TGradeMapper;
import cn.hellomyheart.learn.oa.teacher.service.TGradeService;
@Service
public class TGradeServiceImpl implements TGradeService{

    @Resource
    private TGradeMapper tGradeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tGradeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TGrade record) {
        return tGradeMapper.insert(record);
    }

    @Override
    public int insertSelective(TGrade record) {
        return tGradeMapper.insertSelective(record);
    }

    @Override
    public TGrade selectByPrimaryKey(Integer id) {
        return tGradeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TGrade record) {
        return tGradeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TGrade record) {
        return tGradeMapper.updateByPrimaryKey(record);
    }

}
