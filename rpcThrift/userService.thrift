namespace java com.weibo.newbie.rpcthrift

struct User {
	1: i64 uid,
	2: string uname
}

service UserService {
	User getUser(1: i64 id)
}