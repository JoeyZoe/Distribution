package typings.watsonDeveloperCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object speechToTextV1GeneratedMod {
  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[typings.axios.mod.AxiosResponse[T]], 
    scala.Unit
  ]
}
