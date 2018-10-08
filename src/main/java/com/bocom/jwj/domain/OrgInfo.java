package com.bocom.jwj.domain;

import lombok.Data;

import java.util.Date;

@Data
public class OrgInfo {
    private Integer id;

    private String orgName;

    private String orgCode;

    private String workAddress;

    private String telephone;

    private String fartherOrgName;

    private String fartherOrgCode;

    private Integer createId;

    private String createName;

    private Date createTime;

    private Integer operateId;

    private String operateName;

    private Date operateTime;

    private String remark;

    private Boolean delFlag;
}