package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.domain.TQuestion;
import cn.hellomyheart.learn.oa.teacher.mapper.TQuestionMapper;
import cn.hellomyheart.learn.oa.teacher.service.TQuestionService;
@Service
public class TQuestionServiceImpl implements TQuestionService{

    @Resource
    private TQuestionMapper tQuestionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tQuestionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TQuestion record) {
        return tQuestionMapper.insert(record);
    }

    @Override
    public int insertSelective(TQuestion record) {
        return tQuestionMapper.insertSelective(record);
    }

    @Override
    public TQuestion selectByPrimaryKey(Integer id) {
        return tQuestionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TQuestion record) {
        return tQuestionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TQuestion record) {
        return tQuestionMapper.updateByPrimaryKey(record);
    }

}
