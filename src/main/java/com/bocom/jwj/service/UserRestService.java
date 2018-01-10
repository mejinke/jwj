package com.bocom.jwj.service;

import com.bocom.jwj.cas.UserInfo;
import com.bocom.jwj.dto.UserInfoPAPDto;

public interface UserRestService {
	/**
	 * 根据登录名获取用户信息
	 * 
	 * @param loginName
	 *            登录名
	 * @return
	 */
	UserInfo getUserInfoByLoginName(String loginName);

	/**
	 * 从pap获取用户信息
	 * @return
	 */
	public UserInfo getUserInfoFromPAP(UserInfoPAPDto dto);

}
