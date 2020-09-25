package cn.hellomyheart.learn.oa.teacher.mapper;

import cn.hellomyheart.learn.oa.domain.TQuestion;

public interface TQuestionMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TQuestion record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TQuestion record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TQuestion selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TQuestion record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TQuestion record);
}