package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Sessions")
@js.native
class ResourceProjectsAgentSessions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var contexts: ResourceProjectsAgentSessionsContexts = js.native
  var entityTypes: ResourceProjectsAgentSessionsEntitytypes = js.native
  /**
    * dialogflow.projects.agent.sessions.deleteContexts
    * @desc Deletes all active contexts in the specified session.
    * @alias dialogflow.projects.agent.sessions.deleteContexts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the session to delete all contexts from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteContexts(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteContexts(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def deleteContexts(params: ParamsResourceProjectsAgentSessionsDeletecontexts): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsResourceProjectsAgentSessionsDeletecontexts,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(
    params: ParamsResourceProjectsAgentSessionsDeletecontexts,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(params: ParamsResourceProjectsAgentSessionsDeletecontexts, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsResourceProjectsAgentSessionsDeletecontexts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.sessions.detectIntent
    * @desc Processes a natural language query and returns structured,
    * actionable data as a result. This method is not idempotent, because it
    * may cause contexts and session entity types to be updated, which in turn
    * might affect results of future queries.
    * @alias dialogflow.projects.agent.sessions.detectIntent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The name of the session this query is sent to. Format: `projects/<Project ID>/agent/sessions/<Session ID>`, or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we are using "-". It’s up to the API caller to choose an appropriate `Session ID` and `User Id`. They can be a random numbers or some type of user and session identifiers (preferably hashed). The length of the `Session ID` and `User ID` must not exceed 36 characters.
    * @param {().GoogleCloudDialogflowV2beta1DetectIntentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detectIntent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse]): Unit = js.native
  def detectIntent(params: ParamsResourceProjectsAgentSessionsDetectintent): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsResourceProjectsAgentSessionsDetectintent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsResourceProjectsAgentSessionsDetectintent,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(params: ParamsResourceProjectsAgentSessionsDetectintent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsResourceProjectsAgentSessionsDetectintent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
}

