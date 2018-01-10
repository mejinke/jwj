package com.bocom.jwj.cas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bocom.jwj.domain.UserRoleInfo;
import com.bocom.jwj.dto.UserInfoPAPDto;
import com.bocom.jwj.service.UserRestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

/**
 * 用于加载用户信息 实现UserDetailsService接口，或者实现AuthenticationUserDetailsService接口
 *
 * @author ChengLi
 */
public class CustomUserDetailsService
        implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {

    /**
     * 登陆业务
     */
    @Resource
    private UserRestService userRestService;

    @Value("${project.appId}")
    private String appId;

    @Value("${project.app.version}")
    private String appVersion;

    @Override
    public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {
        System.out.println("当前的用户名是：" + token.getName());
        /*这里我为了方便，就直接返回一个用户信息，实际当中这里修改为查询数据库或者调用服务什么的来获取用户信息*/
        UserInfo userInfo = userRestService.getUserInfoFromPAP(new UserInfoPAPDto(appId, appVersion, token.getName(),
                ""));
        List<UserRoleInfo> userRoleInfos = userInfo.getUserRoles();
        Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>();
        if (userRoleInfos != null) {
            for (UserRoleInfo roleInfo : userRoleInfos) {
                AuthorityInfo authorityInfo = new AuthorityInfo(roleInfo.getRoleCode());
                authorities.add(authorityInfo);
            }
        }else {
            AuthorityInfo authorityInfo = new AuthorityInfo("test");
            authorities.add(authorityInfo);
        }
        userInfo.setAuthorities(authorities);
        return userInfo;
    }

}

