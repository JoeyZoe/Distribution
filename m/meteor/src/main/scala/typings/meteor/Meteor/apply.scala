package typings.meteor.Meteor

import typings.meteor.AnonOnResultReceived
import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.apply")
@js.native
object apply extends js.Object {
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty], options: AnonOnResultReceived[Result]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: AnonOnResultReceived[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[globalError | Error], /* result */ js.UndefOr[Result], Unit]
  ): js.Any = js.native
}

