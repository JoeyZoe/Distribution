package typings.refArrayDi

import org.scalablytyped.runtime.NumberDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDicti[T] extends /* i */ NumberDictionary[T] {
  var buffer: Buffer
  var length: Double
  def inspect(): String
  def ref(): Buffer
  def toArray(): js.Array[T]
  def toJSON(): js.Array[T]
}

object AnonDicti {
  @scala.inline
  def apply[T](
    buffer: Buffer,
    inspect: () => String,
    length: Double,
    ref: () => Buffer,
    toArray: () => js.Array[T],
    toJSON: () => js.Array[T],
    NumberDictionary: /* i */ NumberDictionary[T] = null
  ): AnonDicti[T] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction0(toJSON))
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonDicti[T]]
  }
}

