package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIntersection extends js.Object {
  def apply[T](arrays2: List[T]): LodashIntersection1x1[T] = js.native
  def apply[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: __, arrays: List[T]): LodashIntersection1x2[T] = js.native
}

