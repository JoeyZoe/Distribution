package typings.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateVaultLockOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The lock ID, which is used to complete the vault locking process.</p>
    */
  var lockId: js.UndefOr[String] = js.undefined
}

object InitiateVaultLockOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, lockId: String = null): InitiateVaultLockOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (lockId != null) __obj.updateDynamic("lockId")(lockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateVaultLockOutput]
  }
}

