package typings.meteor.httpMod.HTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/http", "HTTP.get")
@js.native
object get extends js.Object {
  def apply(url: String): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

