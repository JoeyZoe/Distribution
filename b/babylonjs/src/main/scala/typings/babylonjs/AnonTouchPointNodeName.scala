package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.BABYLON.MotionControllerComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTouchPointNodeName extends js.Object {
  /**
    * The indices of this component in the gamepad object
    */
  var gamepadIndices: AnonButton
  /**
    * The mesh's root node name
    */
  var rootNodeName: String
  /**
    * If touch enabled, what is the name of node to display user feedback
    */
  var touchPointNodeName: js.UndefOr[String] = js.undefined
  /**
    * The type of input the component outputs
    */
  var `type`: MotionControllerComponentType
  /**
    * Animation definitions for this model
    */
  var visualResponses: StringDictionary[AnonMinNodeName]
}

object AnonTouchPointNodeName {
  @scala.inline
  def apply(
    gamepadIndices: AnonButton,
    rootNodeName: String,
    `type`: MotionControllerComponentType,
    visualResponses: StringDictionary[AnonMinNodeName],
    touchPointNodeName: String = null
  ): AnonTouchPointNodeName = {
    val __obj = js.Dynamic.literal(gamepadIndices = gamepadIndices.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], visualResponses = visualResponses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (touchPointNodeName != null) __obj.updateDynamic("touchPointNodeName")(touchPointNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTouchPointNodeName]
  }
}

