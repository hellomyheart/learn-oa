package cn.hellomyheart.learn.oa.student.mapper;

import cn.hellomyheart.learn.oa.domain.TSkill;

public interface TSkillMapper {
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
    int insert(TSkill record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TSkill record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TSkill selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TSkill record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TSkill record);
}