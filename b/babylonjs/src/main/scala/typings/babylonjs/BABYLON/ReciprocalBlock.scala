package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ReciprocalBlock")
@js.native
class ReciprocalBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new ReciprocalBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the input component
    */
  def input(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
}

