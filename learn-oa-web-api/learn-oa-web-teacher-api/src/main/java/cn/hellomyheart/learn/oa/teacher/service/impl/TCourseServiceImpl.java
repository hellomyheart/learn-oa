package cn.hellomyheart.learn.oa.teacher.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.learn.oa.teacher.mapper.TCourseMapper;
import cn.hellomyheart.learn.oa.domain.TCourse;
import cn.hellomyheart.learn.oa.teacher.service.TCourseService;
@Service
public class TCourseServiceImpl implements TCourseService{

    @Resource
    private TCourseMapper tCourseMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tCourseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TCourse record) {
        return tCourseMapper.insert(record);
    }

    @Override
    public int insertSelective(TCourse record) {
        return tCourseMapper.insertSelective(record);
    }

    @Override
    public TCourse selectByPrimaryKey(Integer id) {
        return tCourseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TCourse record) {
        return tCourseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCourse record) {
        return tCourseMapper.updateByPrimaryKey(record);
    }

}
