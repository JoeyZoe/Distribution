package typings.babylonjs.BABYLON

import typings.babylonjs.AnonSnapDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected () extends Gizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragPlaneNormal: Vector3) = this()
  def this(dragPlaneNormal: Vector3, color: Color3) = this()
  def this(dragPlaneNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
  def this(
    dragPlaneNormal: Vector3,
    color: Color3,
    gizmoLayer: UtilityLayerRenderer,
    parent: Nullable[PositionGizmo]
  ) = this()
  var _coloredMaterial: js.Any = js.native
  var _hoverMaterial: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _parent: js.Any = js.native
  var _plane: js.Any = js.native
  var _pointerObserver: js.Any = js.native
  /**
    * Drag behavior responsible for the gizmos dragging interactions
    */
  var dragBehavior: PointerDragBehavior = js.native
  /**
    * Event that fires each time the gizmo snaps to a new location.
    * * snapDistance is the the change in distance
    */
  var onSnapObservable: Observable[AnonSnapDistance] = js.native
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  var snapDistance: Double = js.native
  def isEnabled(): Boolean = js.native
  /**
    * If the gizmo is enabled
    */
  def isEnabled(value: Boolean): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.PlaneDragGizmo")
@js.native
object PlaneDragGizmo extends js.Object {
  /** @hidden */
  def _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode = js.native
  /** @hidden */
  def _CreatePlane(scene: Scene, material: StandardMaterial): TransformNode = js.native
}

