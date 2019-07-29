package cn.lvpeng.dao;

import cn.lvpeng.model.HypertensionFollowUpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HypertensionFollowUpInfoMapper {
    int countByExample(HypertensionFollowUpInfoExample example);

    int deleteByExample(HypertensionFollowUpInfoExample example);

    int deleteByPrimaryKey(Integer detailid);

    int insert(HypertensionFollowUpInfo record);

    int insertSelective(HypertensionFollowUpInfo record);

    List<HypertensionFollowUpInfo> selectByExample(HypertensionFollowUpInfoExample example);

    HypertensionFollowUpInfo selectByPrimaryKey(Integer detailid);

    int updateByExampleSelective(@Param("record") HypertensionFollowUpInfo record, @Param("example") HypertensionFollowUpInfoExample example);

    int updateByExample(@Param("record") HypertensionFollowUpInfo record, @Param("example") HypertensionFollowUpInfoExample example);

    int updateByPrimaryKeySelective(HypertensionFollowUpInfo record);

    int updateByPrimaryKey(HypertensionFollowUpInfo record);
}