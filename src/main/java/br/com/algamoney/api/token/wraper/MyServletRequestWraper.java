package br.com.algamoney.api.token.wraper;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.catalina.util.ParameterMap;

public class MyServletRequestWraper  extends  HttpServletRequestWrapper{

	private String refreshToken;
	
	public MyServletRequestWraper(HttpServletRequest request, String refreshToken) {
		super(request);
		this.refreshToken = refreshToken;
	}
	
	public Map<String, String[]> getParameterMap(){
		ParameterMap<String, String[]> map = new ParameterMap<>(getRequest().getParameterMap());
		
		map.put("refresh_token", new String[] { refreshToken }); 
		
		map.setLocked(true);
		
		return map;
	}

}
