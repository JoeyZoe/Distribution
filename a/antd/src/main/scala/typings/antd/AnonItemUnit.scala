package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemUnit extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: String
  var searchPlaceholder: String
  var titles: js.Array[String]
}

object AnonItemUnit {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    notFoundContent: String,
    searchPlaceholder: String,
    titles: js.Array[String]
  ): AnonItemUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemUnit]
  }
}

