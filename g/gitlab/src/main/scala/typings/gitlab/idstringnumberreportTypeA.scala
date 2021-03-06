package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  id  :string | number,   reportType  :std.Array<string>,   scope  :string,   severity  :std.Array<string>,   confidence  :std.Array<string>,   pipelineId  :string | number} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
trait idstringnumberreportTypeA
  extends /* key */ StringDictionary[js.Any] {
  var confidence: js.Array[String]
  var id: String | Double
  var maxPages: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var perPage: js.UndefOr[Double] = js.undefined
  var pipelineId: String | Double
  var reportType: js.Array[String]
  var scope: String
  var severity: js.Array[String]
  var showPagination: js.UndefOr[Boolean] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object idstringnumberreportTypeA {
  @scala.inline
  def apply(
    confidence: js.Array[String],
    id: String | Double,
    pipelineId: String | Double,
    reportType: js.Array[String],
    scope: String,
    severity: js.Array[String],
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    maxPages: Int | Double = null,
    page: Int | Double = null,
    perPage: Int | Double = null,
    showPagination: js.UndefOr[Boolean] = js.undefined,
    sudo: String | Double = null
  ): idstringnumberreportTypeA = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any], reportType = reportType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxPages != null) __obj.updateDynamic("maxPages")(maxPages.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (!js.isUndefined(showPagination)) __obj.updateDynamic("showPagination")(showPagination.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[idstringnumberreportTypeA]
  }
}

