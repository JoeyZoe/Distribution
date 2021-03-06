package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStageResponse extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typings.awsSdk.apigatewayv2Mod.AccessLogSettings] = js.native
  /**
    * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage is managed by API Gateway. You can't modify the $default stage.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[boolean] = js.native
  /**
    * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.native
  /**
    * The timestamp when the stage was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * Default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.native
  /**
    * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
    */
  var LastDeploymentStatusMessage: js.UndefOr[string] = js.native
  /**
    * The timestamp when the stage was last updated.
    */
  var LastUpdatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * Route settings for the stage, by routeKey.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.native
  /**
    * The name of the stage.
    */
  var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object CreateStageResponse {
  @scala.inline
  def apply(
    AccessLogSettings: AccessLogSettings = null,
    ApiGatewayManaged: js.UndefOr[Boolean] = js.undefined,
    AutoDeploy: js.UndefOr[Boolean] = js.undefined,
    ClientCertificateId: Id = null,
    CreatedDate: timestampIso8601 = null,
    DefaultRouteSettings: RouteSettings = null,
    DeploymentId: Id = null,
    Description: StringWithLengthBetween0And1024 = null,
    LastDeploymentStatusMessage: string = null,
    LastUpdatedDate: timestampIso8601 = null,
    RouteSettings: RouteSettingsMap = null,
    StageName: StringWithLengthBetween1And128 = null,
    StageVariables: StageVariablesMap = null,
    Tags: Tags = null
  ): CreateStageResponse = {
    val __obj = js.Dynamic.literal()
    if (AccessLogSettings != null) __obj.updateDynamic("AccessLogSettings")(AccessLogSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ApiGatewayManaged)) __obj.updateDynamic("ApiGatewayManaged")(ApiGatewayManaged.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoDeploy)) __obj.updateDynamic("AutoDeploy")(AutoDeploy.asInstanceOf[js.Any])
    if (ClientCertificateId != null) __obj.updateDynamic("ClientCertificateId")(ClientCertificateId.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DefaultRouteSettings != null) __obj.updateDynamic("DefaultRouteSettings")(DefaultRouteSettings.asInstanceOf[js.Any])
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastDeploymentStatusMessage != null) __obj.updateDynamic("LastDeploymentStatusMessage")(LastDeploymentStatusMessage.asInstanceOf[js.Any])
    if (LastUpdatedDate != null) __obj.updateDynamic("LastUpdatedDate")(LastUpdatedDate.asInstanceOf[js.Any])
    if (RouteSettings != null) __obj.updateDynamic("RouteSettings")(RouteSettings.asInstanceOf[js.Any])
    if (StageName != null) __obj.updateDynamic("StageName")(StageName.asInstanceOf[js.Any])
    if (StageVariables != null) __obj.updateDynamic("StageVariables")(StageVariables.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStageResponse]
  }
}

