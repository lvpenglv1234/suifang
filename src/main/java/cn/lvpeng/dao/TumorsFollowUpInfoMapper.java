package cn.lvpeng.dao;

import cn.lvpeng.model.TumorsFollowUpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TumorsFollowUpInfoMapper {
    int countByExample(TumorsFollowUpInfoExample example);

    int deleteByExample(TumorsFollowUpInfoExample example);

    int deleteByPrimaryKey(Integer detailid);

    int insert(TumorsFollowUpInfo record);

    int insertSelective(TumorsFollowUpInfo record);

    List<TumorsFollowUpInfo> selectByExample(TumorsFollowUpInfoExample example);

    TumorsFollowUpInfo selectByPrimaryKey(Integer detailid);

    int updateByExampleSelective(@Param("record") TumorsFollowUpInfo record, @Param("example") TumorsFollowUpInfoExample example);

    int updateByExample(@Param("record") TumorsFollowUpInfo record, @Param("example") TumorsFollowUpInfoExample example);

    int updateByPrimaryKeySelective(TumorsFollowUpInfo record);

    int updateByPrimaryKey(TumorsFollowUpInfo record);
}