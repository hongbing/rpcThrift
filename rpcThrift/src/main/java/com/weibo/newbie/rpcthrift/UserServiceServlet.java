/**
 * 
 */
package com.weibo.newbie.rpcthrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServlet;

/**
 * @author hongbing
 * @date 2014年8月6日
 */
public class UserServiceServlet extends TServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5173083090037998889L;

	public UserServiceServlet() {
		super(new UserService.Processor<UserService.Iface>(new UserServiceImpl()), 
				new TBinaryProtocol.Factory(true, true));
	}
	
}
