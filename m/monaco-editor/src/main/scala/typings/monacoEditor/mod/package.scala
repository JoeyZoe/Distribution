package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IEvent[T] = js.Function2[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArg */ js.UndefOr[js.Any], 
    typings.monacoEditor.mod.IDisposable
  ]
  type Thenable[T] = js.Thenable[T]
}
