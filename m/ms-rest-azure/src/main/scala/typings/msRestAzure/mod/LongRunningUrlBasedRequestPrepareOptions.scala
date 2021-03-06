package typings.msRestAzure.mod

import org.scalablytyped.runtime.StringDictionary
import typings.msRest.mod.Mapper
import typings.msRest.mod.UrlBasedRequestPrepareOptions
import typings.msRest.mod.UrlParameterValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongRunningUrlBasedRequestPrepareOptions extends UrlBasedRequestPrepareOptions {
  var deserializationMapperForTerminalResponse: js.UndefOr[Mapper] = js.undefined
}

object LongRunningUrlBasedRequestPrepareOptions {
  @scala.inline
  def apply(
    deserializationMapper: Mapper,
    method: String,
    serializationMapper: Mapper,
    url: String,
    baseUrl: String = null,
    body: js.Any = null,
    bodyIsStream: js.UndefOr[Boolean] = js.undefined,
    deserializationMapperForTerminalResponse: Mapper = null,
    disableClientRequestId: js.UndefOr[Boolean] = js.undefined,
    disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.undefined,
    formData: StringDictionary[js.Any] = null,
    headers: StringDictionary[js.Any] = null,
    pathParameters: StringDictionary[js.Any | UrlParameterValue] = null,
    queryParameters: StringDictionary[js.Any | UrlParameterValue] = null
  ): LongRunningUrlBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyIsStream)) __obj.updateDynamic("bodyIsStream")(bodyIsStream.asInstanceOf[js.Any])
    if (deserializationMapperForTerminalResponse != null) __obj.updateDynamic("deserializationMapperForTerminalResponse")(deserializationMapperForTerminalResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClientRequestId)) __obj.updateDynamic("disableClientRequestId")(disableClientRequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(disableJsonStringifyOnBody)) __obj.updateDynamic("disableJsonStringifyOnBody")(disableJsonStringifyOnBody.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRunningUrlBasedRequestPrepareOptions]
  }
}

