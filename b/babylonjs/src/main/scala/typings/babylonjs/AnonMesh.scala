package typings.babylonjs

import typings.babylonjs.BABYLON.AbstractMesh
import typings.babylonjs.BABYLON.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMesh extends js.Object {
  var controller: WebVRController
  var mesh: AbstractMesh
}

object AnonMesh {
  @scala.inline
  def apply(controller: WebVRController, mesh: AbstractMesh): AnonMesh = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMesh]
  }
}

