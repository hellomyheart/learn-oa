package cn.hellomyheart.learn.oa.student.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TExercises;
import cn.hellomyheart.learn.oa.student.mapper.TExercisesMapper;
import cn.hellomyheart.learn.oa.student.service.TExercisesService;
@Service
public class TExercisesServiceImpl implements TExercisesService{

    @Resource
    private TExercisesMapper tExercisesMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tExercisesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TExercises record) {
        return tExercisesMapper.insert(record);
    }

    @Override
    public int insertSelective(TExercises record) {
        return tExercisesMapper.insertSelective(record);
    }

    @Override
    public TExercises selectByPrimaryKey(Integer id) {
        return tExercisesMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TExercises record) {
        return tExercisesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TExercises record) {
        return tExercisesMapper.updateByPrimaryKey(record);
    }

}
