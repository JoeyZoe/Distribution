package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Model
  * @classdesc A model is a graphical object that can be added to or removed from a scene.
  * It contains a hierarchy and any number of mesh instances.
  * @description Creates a new model.
  * @example
  * // Create a new model
  * var model = new pc.Model();
  * @property {pc.GraphNode} graph The root node of the model's graph node hierarchy.
  * @property {pc.MeshInstance[]} meshInstances An array of MeshInstances contained in this model.
  * @property {pc.SkinInstance[]} skinInstances An array of SkinInstances contained in this model.
  * @property {pc.MorphInstance[]} morphInstances An array of MorphInstances contained in this model.
  */
@JSImport("playcanvas", "Model")
@js.native
class Model ()
  extends typings.playcanvas.pc.Model

