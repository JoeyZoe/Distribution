package typings.aureliaBinding.mod

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "ObserverLocator")
@js.native
class ObserverLocator () extends js.Object {
  /**
    * Adds a property observation adapter.
    */
  def addAdapter(adapter: ObjectObservationAdapter): Unit = js.native
  /**
    * Gets an observer for array mutation.
    */
  def getArrayObserver(array: js.Array[_]): InternalCollectionObserver = js.native
  /**
    * Gets an observer for map mutation.
    */
  def getMapObserver(map: Map[_, _]): InternalCollectionObserver = js.native
  /**
    * Gets an observer for property changes.
    */
  def getObserver(obj: js.Any, propertyName: String): InternalPropertyObserver = js.native
  /**
    * Gets an observer for set mutation.
    */
  def getSetObserver(set: Set[_]): InternalCollectionObserver = js.native
}

