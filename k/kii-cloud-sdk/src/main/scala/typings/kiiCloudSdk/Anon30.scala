package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon30 extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, group: KiiUser): js.Any
}

object Anon30 {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiUser) => js.Any): Anon30 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon30]
  }
}

