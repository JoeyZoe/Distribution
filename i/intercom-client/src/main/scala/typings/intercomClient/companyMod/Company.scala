package typings.intercomClient.companyMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.AnonName
import typings.intercomClient.intercomClientStrings.company
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  val app_id: js.UndefOr[String] = js.undefined
  var company_id: js.UndefOr[String] = js.undefined
  val created_at: Double
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  val id: String
  var industry: js.UndefOr[String] = js.undefined
  var monthly_spend: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var plan: js.UndefOr[String | AnonName] = js.undefined
  var remote_created_at: js.UndefOr[Double] = js.undefined
  var session_count: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  val `type`: company
  val updated_at: Double
  var user_count: js.UndefOr[Double] = js.undefined
  var website: js.UndefOr[String] = js.undefined
}

object Company {
  @scala.inline
  def apply(
    created_at: Double,
    id: String,
    `type`: company,
    updated_at: Double,
    app_id: String = null,
    company_id: String = null,
    custom_attributes: StringDictionary[js.Any] = null,
    industry: String = null,
    monthly_spend: Int | Double = null,
    name: String = null,
    plan: String | AnonName = null,
    remote_created_at: Int | Double = null,
    session_count: Int | Double = null,
    size: Int | Double = null,
    user_count: Int | Double = null,
    website: String = null
  ): Company = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (company_id != null) __obj.updateDynamic("company_id")(company_id.asInstanceOf[js.Any])
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes.asInstanceOf[js.Any])
    if (industry != null) __obj.updateDynamic("industry")(industry.asInstanceOf[js.Any])
    if (monthly_spend != null) __obj.updateDynamic("monthly_spend")(monthly_spend.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (remote_created_at != null) __obj.updateDynamic("remote_created_at")(remote_created_at.asInstanceOf[js.Any])
    if (session_count != null) __obj.updateDynamic("session_count")(session_count.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (user_count != null) __obj.updateDynamic("user_count")(user_count.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
}

