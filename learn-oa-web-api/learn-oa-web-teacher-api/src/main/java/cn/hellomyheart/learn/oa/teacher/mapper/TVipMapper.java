package cn.hellomyheart.learn.oa.teacher.mapper;

import cn.hellomyheart.learn.oa.domain.TVip;

public interface TVipMapper {
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
    int insert(TVip record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TVip record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TVip selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TVip record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TVip record);
}