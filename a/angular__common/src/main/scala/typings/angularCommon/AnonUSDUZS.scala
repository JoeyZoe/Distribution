package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUSDUZS extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
  var UZS: js.Array[String]
}

object AnonUSDUZS {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], UZS: js.Array[String]): AnonUSDUZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], UZS = UZS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUSDUZS]
  }
}

