package com.bocom.jwj.dto;

import lombok.Data;

@Data
public class OrgRoleInfo {
    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色编号
     */
    private String roleCode;

    /**
     * 组织编号
     */
    private String roleOrgCode;

    /**
     * 组织名称
     */
    private String roleOrgName;

    /**
     * 父组织名称
     */
    private String parentOrgName;

    /**
     * 父组织编号
     */
    private String parentOrgCode;

}
