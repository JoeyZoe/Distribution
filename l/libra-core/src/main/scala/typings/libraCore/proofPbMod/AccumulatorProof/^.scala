package typings.libraCore.proofPbMod.AccumulatorProof

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

@JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.libraCore.proofPbMod.AccumulatorProof = js.native
  def deserializeBinaryFromReader(message: typings.libraCore.proofPbMod.AccumulatorProof, reader: BinaryReader): typings.libraCore.proofPbMod.AccumulatorProof = js.native
  def serializeBinaryToWriter(message: typings.libraCore.proofPbMod.AccumulatorProof, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.libraCore.proofPbMod.AccumulatorProof): AsObject = js.native
}

