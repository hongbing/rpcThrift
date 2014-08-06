/**
 * 
 */
package com.weibo.newbie.test;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

import com.weibo.newbie.rpcthrift.User;
import com.weibo.newbie.rpcthrift.UserService;

/**
 * @author hongbing
 * @date 2014年8月6日
 */
public class TestServlet {
	
	
	public void testUserServlet() {
		String servletUrl = "http://localhost:8080/rpcThrift/userServlet";
		try {
			THttpClient httpClient = new THttpClient(servletUrl);
			TProtocol protocol = new TBinaryProtocol(httpClient);
			UserService.Client client = new UserService.Client(protocol);
			User user = client.getUser(12345);
			System.out.println("user name : " + user.getUname());
		} catch (TException  e) {
			e.printStackTrace();
		}
		
	}
}
