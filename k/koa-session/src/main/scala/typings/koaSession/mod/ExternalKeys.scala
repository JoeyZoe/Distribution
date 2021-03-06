package typings.koaSession.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalKeys extends js.Object {
  /**
    * get session object by key
    */
  def get(ctx: Context): String
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(ctx: Context, value: js.Any): Unit
}

object ExternalKeys {
  @scala.inline
  def apply(get: Context => String, set: (Context, js.Any) => Unit): ExternalKeys = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[ExternalKeys]
  }
}

