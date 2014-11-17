package com.lims.web.action;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.lims.common.util.Constants;
import com.lims.web.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class BaseAction<T> extends ActionSupport implements RequestAware,
		SessionAware, ServletRequestAware, ServletResponseAware, Serializable, ModelDriven<T> {

	protected static final long serialVersionUID = -180288800522329868L;
	protected Map<String, Object> session;
	protected Map<String, Object> request;
	protected HttpServletRequest httpRequest;
	protected HttpServletResponse httpResponse;
	protected Map<String, Object> dataMap;
	public String target;
	public User user;
	public DecimalFormat decimalFormat;
	public T model;

	public BaseAction() {
		dataMap = new HashMap<String, Object>();
		decimalFormat = new DecimalFormat(Constants.DECIMAL_FORMAT);
	}

	public User getSessionUser() {
		user = (User) session.get(Constants.USER_SESSION_NAME);
		return user;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public void setServletRequest(HttpServletRequest httpRequest) {
		this.httpRequest = httpRequest;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public void setServletResponse(HttpServletResponse httpResponse) {
		this.httpResponse = httpResponse;
	}

	/**
	 * 添加cookie
	 * 
	 * @param key
	 * @param value
	 *            void   
	 * @throws 
	 */
	public void addCookie(String key, String value) {
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(Constants.COOKIE_MAX_AGE);
		cookie.setPath(Constants.COOKIE_PATH);
		httpResponse.addCookie(cookie);
	}

	/**
	 * 添加cookie
	 * 
	 * @param key
	 *            cookie的key
	 * @param value
	 *            cookie的值
	 * @param maxAge
	 *            cookie保存时间（秒）   
	 * @throws 
	 */
	public void addCookie(String key, String value, int maxAge) {
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(maxAge);
		cookie.setPath(Constants.COOKIE_PATH);
		httpResponse.addCookie(cookie);
	}

	public String getCookie(String key) {
		String result = "";
		Cookie[] cookies = httpRequest.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals(key)) {
					result = cookie.getValue();
				}
			}
		}
		return result;
	}

	public String render(String target) {
		this.target = target;
		return SUCCESS;
	}
	public String renderCommon(String target) {
		this.target = target;
		return "common";
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	/**
	 *　设置数据模型,需要覆盖使用,父类没有初始化model
	 */
	@Override
	public T getModel() {
		return model;
	}
	
}
