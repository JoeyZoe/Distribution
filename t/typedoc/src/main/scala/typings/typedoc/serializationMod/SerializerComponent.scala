package typings.typedoc.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization", "SerializerComponent")
@js.native
abstract class SerializerComponent[T] protected ()
  extends typings.typedoc.serializationComponentsMod.SerializerComponent[T] {
  def this(owner: typings.typedoc.serializerMod.Serializer) = this()
}

/* static members */
@JSImport("typedoc/dist/lib/serialization", "SerializerComponent")
@js.native
object SerializerComponent extends js.Object {
  var PRIORITY: Double = js.native
}

