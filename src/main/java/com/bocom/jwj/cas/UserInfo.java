package com.bocom.jwj.cas;

import com.bocom.jwj.domain.OrgInfoExtra;
import com.bocom.jwj.domain.UserRoleInfo;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用户信息
 *
 * @author ChengLi
 * @、这里我写了几个较为常用的字段，id，name，username，password，可以根据实际的情况自己增加
 */
public class UserInfo implements UserDetails {


    private static final long serialVersionUID = -1041327031937199938L;


    private boolean isAccountNonExpired = true;

    private boolean isAccountNonLocked = true;

    private boolean isCredentialsNonExpired = true;

    private boolean isEnabled = true;

    private Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 登录名
     */
    private String userName;
    /**
     * 警察名称
     */
    private String policeName;
    /**
     * 警察编号
     */
    private String policeCode;
    /**
     * 性别(非必须)
     */
    private String sex;
    /**
     * 出生日期(非必须)
     */
    private Date birthday;
    /**
     * 民族(非必须)
     */
    private String nation;
    /**
     * 联系电话(非必须)
     */
    private String contactPhone;
    /**
     * 家庭住址(非必须)
     */
    private String homeAddress;
    /**
     * 创建人ID(非必须)
     */
    private Integer createId;
    /**
     * 创建人名称(非必须)
     */
    private String createName;
    /**
     * 创建时间(非必须)
     */
    private Date createTime;
    /**
     * 操作人ID(非必须)
     */
    private Integer operateId;
    /**
     * 操作人名称(非必须)
     */
    private String operateName;
    /**
     * 操作时间(非必须)
     */
    private Date operateTime;
    /**
     * 描述(非必须)
     */
    private String remark;
    /**
     * 首页控制用户角色组织展示
     */
    private List<OrgInfoExtra> orgInfoExtra;

    /**
     * 角色组织ID
     */
    private Integer roleOrgID;
    /**
     * 角色组织编号
     */
    private String roleOrgCode;
    /**
     * 角色组织名称
     */
    private String roleOrgName;

    /**主部门的部门名称*/
    private String orgName;

    /**主部门的组织编码*/
    private String orgCode;

    /**上级部门的部门名称*/
    private String parentOrgName;

    /**上级部门的组织编码*/
    private String parentOrgCode;

    /**是否可以看情报列表(非必须)*/
    private Boolean canseeQB = false;

    private List<UserRoleInfo> userRoles;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public String getPoliceCode() {
        return policeCode;
    }

    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOperateId() {
        return operateId;
    }

    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    public Integer getRoleOrgID() {
        return roleOrgID;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Boolean getCanseeQB() {
        return canseeQB;
    }

    public void setCanseeQB(Boolean canseeQB) {
        this.canseeQB = canseeQB;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setRoleOrgID(Integer roleOrgID) {
        this.roleOrgID = roleOrgID;
    }

    public String getRoleOrgCode() {
        return roleOrgCode;
    }

    public void setRoleOrgCode(String roleOrgCode) {
        this.roleOrgCode = roleOrgCode;
    }

    public String getRoleOrgName() {
        return roleOrgName;
    }

    public void setRoleOrgName(String roleOrgName) {
        this.roleOrgName = roleOrgName;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<OrgInfoExtra> getOrgInfoExtra() {
        return orgInfoExtra;
    }

    public void setOrgInfoExtra(List<OrgInfoExtra> orgInfoExtra) {
        this.orgInfoExtra = orgInfoExtra;
    }

    public String getParentOrgName() {
        return parentOrgName;
    }

    public void setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
    }

    public String getParentOrgCode() {
        return parentOrgCode;
    }

    public void setParentOrgCode(String parentOrgCode) {
        this.parentOrgCode = parentOrgCode;
    }

    public List<UserRoleInfo> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRoleInfo> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        isAccountNonExpired = accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        isAccountNonLocked = accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        isCredentialsNonExpired = credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public Set<AuthorityInfo> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<AuthorityInfo> authorities) {
        this.authorities = authorities;
    }
}