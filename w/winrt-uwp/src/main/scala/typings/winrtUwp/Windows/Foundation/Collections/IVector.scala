package typings.winrtUwp.Windows.Foundation.Collections

import typings.std.Array
import typings.winrtUwp.AnonIndex
import typings.winrtUwp.AnonItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a random-access collection of elements. */
@js.native
trait IVector[T]
  extends Array[T]
     with IIterable[T] {
  /** Gets the number of items in the vector. */
  var size: Double = js.native
  /**
    * Appends an item to the end of the vector.
    * @param value The item to append to the vector.
    */
  def append(value: T): Unit = js.native
  /** Removes all items from the vector. */
  def clear(): Unit = js.native
  /**
    * Returns the item at the specified index in the vector.
    * @param index The zero-based index of the item.
    * @return The item at the specified index.
    */
  def getAt(index: Double): T = js.native
  /**
    * Retrieves the items that start at the specified index in the vector.
    * @param startIndex The zero-based index of the start of the items in the vector.
    */
  def getMany(startIndex: Double): AnonItems[T] = js.native
  /**
    * Returns an immutable view of the vector.
    * @return The view of the vector.
    */
  def getView(): IVectorView[T] = js.native
  def indexOf(value: T, extra: js.Any*): AnonIndex = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: T): Double = js.native
  /**
    * Inserts an item at a specified index in the vector.
    * @param index The zero-based index.
    * @param value The item to insert.
    */
  def insertAt(index: Double, value: T): Unit = js.native
  /**
    * Removes the item at the specified index in the vector.
    * @param index The zero-based index of the vector item to remove.
    */
  def removeAt(index: Double): Unit = js.native
  /** Removes the last item from the vector. */
  def removeAtEnd(): Unit = js.native
  /**
    * Replaces all the items in the vector with the specified items.
    * @param items The collection of items to add to the vector.
    */
  def replaceAll(items: T): Unit = js.native
  /**
    * Sets the value at the specified index in the vector.
    * @param index The zero-based index at which to set the value.
    * @param value The item to set.
    */
  def setAt(index: Double, value: T): Unit = js.native
}

