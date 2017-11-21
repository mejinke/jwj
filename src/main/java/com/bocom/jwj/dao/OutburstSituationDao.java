package com.bocom.jwj.dao;


import com.bocom.jwj.domain.OutburstSituationInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OutburstSituationDao {

    int deleteByPrimaryKey(String id);

    int insertSelective(OutburstSituationInfo record);

    OutburstSituationInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OutburstSituationInfo record);

    List<OutburstSituationInfo> getOutSitList(Map<String, Object> param);
}