package typings.awsSdkClientSqsNode.mod

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvableConfiguration
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.httpMod.HttpHandler
import typings.awsSdkTypes.httpMod.HttpOptions
import typings.awsSdkTypes.marshallerMod.RequestSerializer
import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.unmarshallerMod.ResponseParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.DelayDecider
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RetryDecider
import typings.awsSdkTypes.utilMod.UrlParser
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    js.UndefOr[Credentials | Provider[Credentials]], 
    Provider[Credentials], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[
    js.UndefOr[DelayDecider], 
    js.UndefOr[DelayDecider], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    Provider[HttpEndpoint], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Readable]], 
    Terminalware[_, Readable], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Readable, HttpOptions]], 
    HttpHandler[Readable, HttpOptions], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val maxRetries: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    ResponseParser[Readable], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val profile: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    js.UndefOr[String], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    js.UndefOr[String | Provider[String]], 
    Provider[String], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val retryDecider: ConfigurationPropertyDefinition[
    js.UndefOr[RetryDecider], 
    js.UndefOr[RetryDecider], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    Provider[RequestSerializer[Readable]], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[
    js.UndefOr[HashConstructor], 
    HashConstructor, 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val signer: ConfigurationPropertyDefinition[
    js.UndefOr[RequestSigner], 
    RequestSigner, 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val signingName: ConfigurationPropertyDefinition[js.UndefOr[String], String, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[js.UndefOr[Boolean], Boolean, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Readable]], 
    StreamCollector[Readable], 
    SQSResolvableConfiguration, 
    SQSResolvedConfiguration
  ] = js.native
  val urlParser: ConfigurationPropertyDefinition[js.UndefOr[UrlParser], UrlParser, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, SQSResolvableConfiguration, SQSResolvedConfiguration] = js.native
}

