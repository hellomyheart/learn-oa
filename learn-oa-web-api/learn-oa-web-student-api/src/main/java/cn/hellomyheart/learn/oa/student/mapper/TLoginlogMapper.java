package cn.hellomyheart.learn.oa.student.mapper;

import cn.hellomyheart.learn.oa.domain.TLoginlog;

public interface TLoginlogMapper {
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
    int insert(TLoginlog record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TLoginlog record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TLoginlog selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TLoginlog record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TLoginlog record);
}