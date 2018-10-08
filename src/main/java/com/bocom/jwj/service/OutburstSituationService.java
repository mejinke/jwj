package com.bocom.jwj.service;


import com.bocom.jwj.dao.OutburstSituationDao;
import com.bocom.jwj.dao.OutburstSituationMapper;
import com.bocom.jwj.domain.OutburstSituationInfo;
import com.bocom.jwj.utils.PageUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor =
        Exception.class)
@Service
public class OutburstSituationService {

    @Resource
    private OutburstSituationDao outburstSituationDao;

    @Resource
    private OutburstSituationMapper outburstSituationMapper;

    public int deleteOutSitByKey(String id) {
        return outburstSituationMapper.deleteByPrimaryKey(id);
    }

    public int insertOutSit(OutburstSituationInfo record) {
        record.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        return outburstSituationDao.insertSelective(record);
    }

    public OutburstSituationInfo selectOutSitByKey(String id) {

        return outburstSituationDao.selectByPrimaryKey(id);
    }

    public int updateOutSitByKey(OutburstSituationInfo record) {
        return outburstSituationDao.updateByPrimaryKeySelective(record);
    }

    public List<OutburstSituationInfo> getOutSitList(Map<String, Object> param) {
        PageUtil.dealPage(param);
        return outburstSituationDao.getOutSitList(param);
    }


}
