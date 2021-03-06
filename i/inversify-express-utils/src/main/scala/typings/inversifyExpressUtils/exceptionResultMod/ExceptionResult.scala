package typings.inversifyExpressUtils.exceptionResultMod

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionResult extends IHttpActionResult {
  var apiController: js.Any
  var error: js.Any
}

object ExceptionResult {
  @scala.inline
  def apply(apiController: js.Any, error: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): ExceptionResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[ExceptionResult]
  }
}

