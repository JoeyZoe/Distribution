package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NegateBlock")
@js.native
class NegateBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new NegateBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the value input component
    */
  def value(): NodeMaterialConnectionPoint = js.native
}

