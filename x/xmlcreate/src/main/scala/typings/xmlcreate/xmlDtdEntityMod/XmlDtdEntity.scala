package typings.xmlcreate.xmlDtdEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDtdEntity[Parent] extends js.Object {
  var _charData: js.Any = js.native
  val _parent: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Gets the text of this entity declaration.
    */
  def charData(): String = js.native
  /**
    * Sets the text of this entity declaration.
    */
  def charData(charData: String): js.Any = js.native
  /**
    * Returns the parent of this entity declaration.
    */
  def up(): Parent = js.native
}

