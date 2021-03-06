package typings.firebaseFirestore.platformMod

import typings.firebaseFirestore.connectionMod.Connection
import typings.firebaseFirestore.connectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.serializerMod.JsonProtoSerializer
import typings.std.Document_
import typings.std.Uint8Array
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  /** True if and only if the Base64 conversion functions are available. */
  val base64Available: Boolean
  /** The Platform's 'document' implementation or null if not available. */
  val document: Document_ | Null
  /**
    * True if timestamps, bytes and numbers are represented in Proto3 JSON
    * format (in-memory and on the wire)
    */
  val useProto3Json: Boolean
  /** The Platform's 'window' implementation or null if not available. */
  val window: Window_ | Null
  /** Converts a Base64 encoded string to a binary string. */
  def atob(encoded: String): String
  /** Converts a binary string to a Base64 encoded string. */
  def btoa(raw: String): String
  /** Formats an object as a JSON string, suitable for logging. */
  def formatJSON(value: js.Any): String
  def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection]
  def newConnectivityMonitor(): ConnectivityMonitor
  def newSerializer(databaseId: DatabaseId): JsonProtoSerializer
  /**
    * Generates `nBytes` of random bytes. If `nBytes` is negative, an empty array
    * will be returned.
    */
  def randomBytes(nBytes: Double): Uint8Array
}

object Platform {
  @scala.inline
  def apply(
    atob: String => String,
    base64Available: Boolean,
    btoa: String => String,
    formatJSON: js.Any => String,
    loadConnection: DatabaseInfo => js.Promise[Connection],
    newConnectivityMonitor: () => ConnectivityMonitor,
    newSerializer: DatabaseId => JsonProtoSerializer,
    randomBytes: Double => Uint8Array,
    useProto3Json: Boolean,
    document: Document_ = null,
    window: Window_ = null
  ): Platform = {
    val __obj = js.Dynamic.literal(atob = js.Any.fromFunction1(atob), base64Available = base64Available.asInstanceOf[js.Any], btoa = js.Any.fromFunction1(btoa), formatJSON = js.Any.fromFunction1(formatJSON), loadConnection = js.Any.fromFunction1(loadConnection), newConnectivityMonitor = js.Any.fromFunction0(newConnectivityMonitor), newSerializer = js.Any.fromFunction1(newSerializer), randomBytes = js.Any.fromFunction1(randomBytes), useProto3Json = useProto3Json.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform]
  }
}

