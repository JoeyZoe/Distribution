package typings.babylonjs

import typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/distanceBlock", JSImport.Namespace)
@js.native
object distanceBlockMod extends js.Object {
  @js.native
  class DistanceBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new DistanceBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the left operand input component
      */
    def left(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the output component
      */
    def output(): NodeMaterialConnectionPoint = js.native
    /**
      * Gets the right operand input component
      */
    def right(): NodeMaterialConnectionPoint = js.native
  }
  
}

