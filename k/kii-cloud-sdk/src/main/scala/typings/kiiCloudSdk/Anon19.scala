package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon19 extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiGcmInstallationResponse): js.Any
}

object Anon19 {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiGcmInstallationResponse => js.Any): Anon19 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon19]
  }
}

