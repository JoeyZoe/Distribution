package typings.babylonjs.miscIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/index", "Observable")
@js.native
/**
  * Creates a new observable
  * @param onObserverAdded defines a callback to call when a new observer is added
  */
class Observable[T] ()
  extends typings.babylonjs.observableMod.Observable[T] {
  def this(onObserverAdded: js.Function1[/* observer */ typings.babylonjs.observableMod.Observer[T], Unit]) = this()
}

