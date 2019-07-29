package cn.lvpeng.dao;

import cn.lvpeng.model.DiabetesFollowUpInfo;
import cn.lvpeng.model.DiabetesFollowUpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiabetesFollowUpInfoMapper {
    int countByExample(DiabetesFollowUpInfoExample example);

    int deleteByExample(DiabetesFollowUpInfoExample example);

    int deleteByPrimaryKey(Integer detailid);

    int insert(DiabetesFollowUpInfo record);

    int insertSelective(DiabetesFollowUpInfo record);

    List<DiabetesFollowUpInfo> selectByExample(DiabetesFollowUpInfoExample example);

    DiabetesFollowUpInfo selectByPrimaryKey(Integer detailid);

    int updateByExampleSelective(@Param("record") DiabetesFollowUpInfo record, @Param("example") DiabetesFollowUpInfoExample example);

    int updateByExample(@Param("record") DiabetesFollowUpInfo record, @Param("example") DiabetesFollowUpInfoExample example);

    int updateByPrimaryKeySelective(DiabetesFollowUpInfo record);

    int updateByPrimaryKey(DiabetesFollowUpInfo record);
}