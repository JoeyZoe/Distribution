package typings.angularHttp.publicApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/public_api", "Headers")
@js.native
class Headers ()
  extends typings.angularHttp.srcMod.Headers {
  def this(headers: StringDictionary[js.Any]) = this()
  def this(headers: typings.angularHttp.headersMod.Headers) = this()
}

/* static members */
@JSImport("@angular/http/public_api", "Headers")
@js.native
object Headers extends js.Object {
  /**
    * Returns a new Headers instance from the given DOMString of Response Headers
    */
  def fromResponseHeaderString(headersString: String): typings.angularHttp.headersMod.Headers = js.native
}

