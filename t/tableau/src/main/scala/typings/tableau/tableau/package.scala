package typings.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableau {
  type ListenerFunction[T /* <: typings.tableau.tableau.TableauEvent */] = js.Function1[/* event */ T, scala.Unit]
}
