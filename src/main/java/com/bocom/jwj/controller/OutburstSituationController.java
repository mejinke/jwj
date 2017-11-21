package com.bocom.jwj.controller;


import com.alibaba.fastjson.JSONObject;
import com.bocom.jwj.domain.OutburstSituationInfo;
import com.bocom.jwj.service.OutburstSituationService;
import com.bocom.jwj.utils.PageUtil;
import com.bocom.jwj.utils.StringUtils;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 提供给魏本平的指挥终端使用：无需验证是否登录
 *
 * @author bocom-qy
 * @version 2017-11-20
 */
@RestController
@RequestMapping("/OutSit/manage")
public class OutburstSituationController {


    private static Logger logger = LoggerFactory
            .getLogger(OutburstSituationController.class);


    @Resource
    private OutburstSituationService outburstSituationService;

    @Resource
    private HttpServletRequest request;

    @Resource
    private HttpSession session;


    /**
     * 获取突发情况列表   参数 status  pageNum  pageSize
     * status为-1时候 查询全部状态
     *
     * @return Map
     */
    @GetMapping("/getOutSitList")
    public Map getOutSitList() {
        PageInfo pageInfo = null;
        String status = request.getParameter("status");
        try {
            Map<String, Object> param = new HashMap<>();
            if (!StringUtils.isNullOrEmpty(status) && !"-1".equalsIgnoreCase(status)) {
                param.put("status", status);
            }
            PageUtil.setParams(request, param);
            List<OutburstSituationInfo> infoList = outburstSituationService.getOutSitList(param);
            pageInfo = new PageInfo(infoList);

        } catch (Exception e) {
            logger.error("getOutSitList is error ", e);
        }
        return PageUtil.covertMap(new Object[]{"page"},
                new Object[]{pageInfo});

    }

    /**
     * 增加突发情况
     *
     * @return JSONObject
     */
    @PostMapping("/addOutSit")
    public JSONObject addOutSit(@RequestBody OutburstSituationInfo info) {
        JSONObject result = new JSONObject();
        try {
            outburstSituationService.insertOutSit(info);
        } catch (Exception e) {
            logger.error("addOutSit is error ", e);
            result.put("success", false);
            result.put("reason", "服务器异常，请重试！");
            return result;
        }
        result.put("success", true);
        return result;
    }


    /**
     * 删除突发情况  id必传
     *
     * @return JSONObject
     */
    @GetMapping("/deleteOutSit")
    public JSONObject deleteOutSit() {
        JSONObject result = new JSONObject();
        String id = request.getParameter("id");
        try {
            if (!StringUtils.isNullOrEmpty(id)) {
                outburstSituationService.deleteOutSitByKey(id);
            } else {
                result.put("success", false);
                result.put("reason", "参数不对，请重试！");
                return result;
            }
        } catch (Exception e) {
            logger.error("deleteActivity is error ", e);
            result.put("success", false);
            result.put("reason", "服务器异常，请重试！");
            return result;
        }
        result.put("success", true);
        return result;
    }

    /**
     * 更新突发情况   id必传
     *
     * @return JSONObject
     */
    @PostMapping("/updateOutSit")
    public JSONObject updateOutSit(@RequestBody OutburstSituationInfo info) {

        JSONObject result = new JSONObject();
        try {
            if (!StringUtils.isNullOrEmpty(info.getId())) {
                outburstSituationService.updateOutSitByKey(info);
            } else {
                result.put("success", false);
                result.put("reason", "参数不对，请重试！");
                return result;
            }
        } catch (Exception e) {
            logger.error("updateOutSit is error ", e);
            result.put("success", false);
            result.put("reason", "服务器异常，请重试！");
            return result;
        }
        result.put("success", true);
        return result;
    }

}
