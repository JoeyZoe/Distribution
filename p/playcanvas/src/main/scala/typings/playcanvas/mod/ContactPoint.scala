package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ContactPoint
  * @classdesc Object holding the result of a contact between two Entities.
  * @description Create a new ContactPoint.
  * @param {pc.Vec3} localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @param {pc.Vec3} localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @param {pc.Vec3} point - The point on the entity where the contact occurred, in world space.
  * @param {pc.Vec3} pointOther - The point on the other entity where the contact occurred, in world space.
  * @param {pc.Vec3} normal - The normal vector of the contact on the other entity, in world space.
  * @property {pc.Vec3} localPoint The point on the entity where the contact occurred, relative to the entity.
  * @property {pc.Vec3} localPointOther The point on the other entity where the contact occurred, relative to the other entity.
  * @property {pc.Vec3} point The point on the entity where the contact occurred, in world space.
  * @property {pc.Vec3} pointOther The point on the other entity where the contact occurred, in world space.
  * @property {pc.Vec3} normal The normal vector of the contact on the other entity, in world space.
  */
@JSImport("playcanvas", "ContactPoint")
@js.native
class ContactPoint protected ()
  extends typings.playcanvas.pc.ContactPoint {
  def this(
    localPoint: typings.playcanvas.pc.Vec3,
    localPointOther: typings.playcanvas.pc.Vec3,
    point: typings.playcanvas.pc.Vec3,
    pointOther: typings.playcanvas.pc.Vec3,
    normal: typings.playcanvas.pc.Vec3
  ) = this()
}

