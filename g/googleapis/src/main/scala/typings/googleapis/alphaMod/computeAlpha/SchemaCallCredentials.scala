package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gRPC call credentials to access the SDS server.
  */
@js.native
trait SchemaCallCredentials extends js.Object {
  /**
    * The access token that is used as call credential for the SDS server. This
    * field is used only if callCredentialType is ACCESS_TOKEN.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * The type of call credentials to use for GRPC requests to the SDS server.
    * This field can be set to one of the following: ACCESS_TOKEN: An access
    * token is used as call credentials for the SDS server. GCE_VM: The local
    * GCE VM service account credentials are used to access the SDS server.
    * JWT_SERVICE_TOKEN: The user provisioned service account credentials are
    * used to access the SDS server. FROM_PLUGIN: Custom authenticator
    * credentials are used to access the SDS server.
    */
  var callCredentialType: js.UndefOr[String] = js.native
  /**
    * Custom authenticator credentials.
    */
  var fromPlugin: js.UndefOr[SchemaMetadataCredentialsFromPlugin] = js.native
  /**
    * This service account credentials are used as call credentials for the SDS
    * server. This field is used only if callCredentialType is
    * JWT_SERVICE_ACCOUNT.
    */
  var jwtServiceAccount: js.UndefOr[SchemaServiceAccountJwtAccessCredentials] = js.native
}

object SchemaCallCredentials {
  @scala.inline
  def apply(
    accessToken: String = null,
    callCredentialType: String = null,
    fromPlugin: SchemaMetadataCredentialsFromPlugin = null,
    jwtServiceAccount: SchemaServiceAccountJwtAccessCredentials = null
  ): SchemaCallCredentials = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (callCredentialType != null) __obj.updateDynamic("callCredentialType")(callCredentialType.asInstanceOf[js.Any])
    if (fromPlugin != null) __obj.updateDynamic("fromPlugin")(fromPlugin.asInstanceOf[js.Any])
    if (jwtServiceAccount != null) __obj.updateDynamic("jwtServiceAccount")(jwtServiceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCallCredentials]
  }
}

