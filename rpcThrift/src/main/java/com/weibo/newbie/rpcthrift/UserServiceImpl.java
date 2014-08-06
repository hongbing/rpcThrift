package com.weibo.newbie.rpcthrift;

import org.apache.thrift.TException;


public class UserServiceImpl implements UserService.Iface {

	public User getUser(long id) throws TException {
		return new User(id, "xiaoming");
	}

}
