package com.lims.web.action;

import org.apache.commons.lang3.StringUtils;

import com.lims.common.util.Constants;
import com.lims.web.bean.User;

public class UserAction extends BaseAction<User> {
	private static final long serialVersionUID = 251959110597421816L;
	public String login() throws Exception{
		String result = Constants.EMPTYSTRING;
		if(StringUtils.isNotBlank(user.getUsername())) {
			
		} else {
			
		}
		return render("");
	}
	@Override
	public User getModel() {
		return new User();
	}
	
}
