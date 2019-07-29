package cn.lvpeng.dao;

import cn.lvpeng.model.FollowUpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowUpInfoMapper {
    int countByExample(FollowUpInfoExample example);

    int deleteByExample(FollowUpInfoExample example);

    int deleteByPrimaryKey(Integer followupid);

    int insert(FollowUpInfo record);

    int insertSelective(FollowUpInfo record);

    List<FollowUpInfo> selectByExample(FollowUpInfoExample example);

    FollowUpInfo selectByPrimaryKey(Integer followupid);

    int updateByExampleSelective(@Param("record") FollowUpInfo record, @Param("example") FollowUpInfoExample example);

    int updateByExample(@Param("record") FollowUpInfo record, @Param("example") FollowUpInfoExample example);

    int updateByPrimaryKeySelective(FollowUpInfo record);

    int updateByPrimaryKey(FollowUpInfo record);
}