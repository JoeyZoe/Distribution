package typings.pulumiAws.applicationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationState extends js.Object {
  /**
    * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object ApplicationState {
  @scala.inline
  def apply(computePlatform: Input[String] = null, name: Input[String] = null, uniqueId: Input[String] = null): ApplicationState = {
    val __obj = js.Dynamic.literal()
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationState]
  }
}

