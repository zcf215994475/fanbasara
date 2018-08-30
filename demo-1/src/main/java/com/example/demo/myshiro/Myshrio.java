package com.example.demo.myshiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class Myshrio extends AuthorizingRealm{

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 获取用户名
		String name = (String) principals.getPrimaryPrincipal(); 
		// 添加你的角色和权限
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		
		// 添加角色
		simpleAuthorizationInfo.addRole("admin");
		// 添加权限
		simpleAuthorizationInfo.addStringPermission("create");
		
		return simpleAuthorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken atoken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) atoken;
		String name = token.getUsername();
		if(name==null) {
			return null;
		}
		SimpleAuthenticationInfo  simpleAuthenticationInfo  = new SimpleAuthenticationInfo(name,"123456",getName());
		
		return simpleAuthenticationInfo;
	}

}
