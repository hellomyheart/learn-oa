package cn.hellomyheart.learn.oa.student.mapper;

import cn.hellomyheart.learn.oa.domain.TAskforleave;

public interface TAskforleaveMapper {
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
    int insert(TAskforleave record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TAskforleave record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TAskforleave selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TAskforleave record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TAskforleave record);
}