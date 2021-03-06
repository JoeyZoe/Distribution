package typings.ndnJs.mod

import typings.ndnJs.nameMod.Name.Component
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typings.ndnJs.nameMod.Name {
  def this(components: js.Array[Component | Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typings.ndnJs.nameMod.Name) = this()
}

/* static members */
@JSImport("ndn-js", "Name")
@js.native
object Name extends js.Object {
  @js.native
  class Component ()
    extends typings.ndnJs.nameMod.Name.Component {
    def this(component: typings.ndnJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: typings.ndnJs.blobMod.Blob) = this()
    def this(value: ArrayBuffer) = this()
    def this(value: Uint8Array) = this()
    def this(value: String, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: typings.ndnJs.blobMod.Blob, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: ArrayBuffer, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: Uint8Array, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(
      value: typings.ndnJs.blobMod.Blob,
      `type`: typings.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: ArrayBuffer, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: Uint8Array, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
  }
  
  def fromEscapedString(uri: String): typings.ndnJs.nameMod.Name = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: typings.ndnJs.blobMod.Blob): typings.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double): typings.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typings.ndnJs.nameMod.ComponentType): typings.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double): typings.ndnJs.nameMod.Name.Component = js.native
    def fromNumberWithMarker(number: Double, marker: Double): typings.ndnJs.nameMod.Name.Component = js.native
    def fromParametersSha256Digest(digest: typings.ndnJs.blobMod.Blob): typings.ndnJs.nameMod.Name.Component = js.native
    def fromSegment(segment: Double): typings.ndnJs.nameMod.Name.Component = js.native
    def fromSegmentOffset(segmentOffset: Double): typings.ndnJs.nameMod.Name.Component = js.native
    def fromSequenceNumber(sequenceNumber: Double): typings.ndnJs.nameMod.Name.Component = js.native
    def fromTimestamp(timestamp: Double): typings.ndnJs.nameMod.Name.Component = js.native
    def fromVersion(version: Double): typings.ndnJs.nameMod.Name.Component = js.native
  }
  
}

