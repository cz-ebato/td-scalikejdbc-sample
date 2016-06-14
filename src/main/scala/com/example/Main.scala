package com.example

import scalikejdbc._
import dao.UserInstall

object Main extends App {

  Class.forName("com.treasuredata.jdbc.TreasureDataDriver")
  ConnectionPool.singleton("jdbc:td://api.treasuredata.com/dmpdb;type=hive", "your mail address", "your password")

  implicit val session: DBSession = DB.readOnlySession

  UserInstall.userInstall.foreach(u => println(u.aid))
}
