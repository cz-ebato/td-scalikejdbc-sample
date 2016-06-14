package dao

import scalikejdbc._

case class UserInstall(
                        cvMediaCategory: String,
                        cvClickDate: String,
                        cvSiteBigben: String,
                        cvIponClickId: String,
                        installDate: String,
                        buyerId: String,
                        aid: String,
                        appId: String,
                        cid: String
                      )

object UserInstall extends SQLSyntaxSupport[UserInstall] {

  def userInstall(implicit session: DBSession): List[UserInstall] = sql"""
    select
      cv_media_category,
      cv_click_date,
      cv_site_bigben,
      cv_ipon_click_id,
      install_date,
      buyer_id,
      aid,
      app_id,
      cid
    from user_install limit 100
    """.map(rs => (UserInstall(
    rs.string("cv_media_category"),
    rs.string("cv_click_date"),
    rs.string("cv_site_bigben"),
    rs.string("cv_ipon_click_id"),
    rs.string("install_date"),
    rs.string("buyer_id"),
    rs.string("aid"),
    rs.string("app_id"),
    rs.string("cid")))).list().apply()
}
