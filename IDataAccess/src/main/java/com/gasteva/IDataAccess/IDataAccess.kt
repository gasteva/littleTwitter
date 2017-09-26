package com.gasteva.IDataAccess

interface IDataAccess {
    fun createUser (Nickname: String)
    fun postMessage (UserID: Int, MessageText: String)
    fun followByNickname (FollowingUser:String, FollowedUser: String)
    fun followByID (FollowingUser:Int, FollowedUser: Int)
    fun unfollowByNickname (FollowingUser:String, UnfollowedUser: String)
    fun unfollowByID (FollowingUser:Int, FollowedUser: Int)
    fun getFeed (ForUserID : Int) : List<Twitt>
    fun getGlobalFeed() : List<Twi>
}