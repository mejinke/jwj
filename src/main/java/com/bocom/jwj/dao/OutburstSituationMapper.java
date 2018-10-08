package com.bocom.jwj.dao;

import com.bocom.jwj.domain.OutburstSituationInfo;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: qianyong
 * @Description:
 * @Date: Created in 2018-10-08
 */
@Service
public interface OutburstSituationMapper {

    @Delete("delete from t_outburst_situation where id = #{id,jdbcType=VARCHAR}")
    int deleteByPrimaryKey(String id);

    int insertSelective(OutburstSituationInfo record);

    OutburstSituationInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OutburstSituationInfo record);

    List<OutburstSituationInfo> getOutSitList(Map<String, Object> param);
}
