package typings.googleProtobuf.descriptorPbMod.ServiceOptions

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceOptions")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleProtobuf.descriptorPbMod.ServiceOptions = js.native
  def deserializeBinaryFromReader(message: typings.googleProtobuf.descriptorPbMod.ServiceOptions, reader: BinaryReader): typings.googleProtobuf.descriptorPbMod.ServiceOptions = js.native
  def serializeBinaryToWriter(message: typings.googleProtobuf.descriptorPbMod.ServiceOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.googleProtobuf.descriptorPbMod.ServiceOptions): AsObject = js.native
}

