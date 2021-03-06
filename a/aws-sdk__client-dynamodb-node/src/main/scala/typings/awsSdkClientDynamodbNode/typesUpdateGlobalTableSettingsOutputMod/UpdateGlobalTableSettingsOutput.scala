package typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesReplicaSettingsDescriptionMod.UnmarshalledReplicaSettingsDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGlobalTableSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The name of the global table.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The region specific settings for the global table.</p>
    */
  var ReplicaSettings: js.UndefOr[js.Array[UnmarshalledReplicaSettingsDescription]] = js.undefined
}

object UpdateGlobalTableSettingsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    GlobalTableName: String = null,
    ReplicaSettings: js.Array[UnmarshalledReplicaSettingsDescription] = null
  ): UpdateGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (ReplicaSettings != null) __obj.updateDynamic("ReplicaSettings")(ReplicaSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableSettingsOutput]
  }
}

