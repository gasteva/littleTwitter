package com.gasteva.littletwitter.dao


class MySQLDaoImpl: com.gasteva.littletwitter.dao.IDataAccess {
    override fun createUser(Nickname: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun postMessage(UserID: Int, MessageText: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun followByNickname(FollowingUser: String, FollowedUser: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun followByID(FollowingUser: Int, FollowedUser: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unfollowByNickname(FollowingUser: String, FollowedUser: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unfollowByID(FollowingUser: Int, FollowedUser: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFeed(ForUserID: Int): List<Twitt> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGlobalFeed(): List<Twitt> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}