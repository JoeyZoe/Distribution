package typings.paper.paperCoreMod

import typings.paper.paper.Point
import typings.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "Rectangle")
@js.native
class Rectangle protected ()
  extends typings.paper.paper.Rectangle {
  /** 
    * Creates a Rectangle object.
    * 
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  def this(point: Point, size: Size) = this()
}

