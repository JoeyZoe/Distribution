package typings.luminoAlgorithm.retroMod

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRetroable[T] extends js.Object {
  /**
    * Get a reverse iterator over the object's values.
    *
    * @returns An iterator which yields the object's values in reverse.
    */
  def retro(): IIterator[T]
}

object IRetroable {
  @scala.inline
  def apply[T](retro: () => IIterator[T]): IRetroable[T] = {
    val __obj = js.Dynamic.literal(retro = js.Any.fromFunction0(retro))
  
    __obj.asInstanceOf[IRetroable[T]]
  }
}

