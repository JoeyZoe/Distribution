package typings.firebaseFirestore.remotePersistentStreamMod

import typings.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.firestoreProtoApiMod.WriteResponse
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.utilByteStringMod.ByteString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/persistent_stream", "PersistentWriteStream")
@js.native
class PersistentWriteStream protected ()
  extends PersistentStream[
      typings.firebaseFirestore.firestoreProtoApiMod.WriteRequest, 
      WriteResponse, 
      WriteStreamListener
    ] {
  def this(
    queue: AsyncQueue,
    connection: Connection,
    credentials: CredentialsProvider,
    serializer: JsonProtoSerializer,
    listener: WriteStreamListener
  ) = this()
  var handshakeComplete_ : js.Any = js.native
  /**
    * The last received stream token from the server, used to acknowledge which
    * responses the client has processed. Stream tokens are opaque checkpoint
    * markers whose only real value is their inclusion in the next request.
    *
    * PersistentWriteStream manages propagating this value from responses to the
    * next request.
    */
  var lastStreamToken: ByteString = js.native
  var serializer: js.Any = js.native
  /**
    * Tracks whether or not a handshake has been successfully exchanged and
    * the stream is ready to accept mutations.
    */
  def handshakeComplete(): Boolean = js.native
  /**
    * Sends an initial streamToken to the server, performing the handshake
    * required to make the StreamingWrite RPC work. Subsequent
    * calls should wait until onHandshakeComplete was called.
    */
  def writeHandshake(): Unit = js.native
  /** Sends a group of mutations to the Firestore backend to apply. */
  def writeMutations(mutations: js.Array[Mutation]): Unit = js.native
}

