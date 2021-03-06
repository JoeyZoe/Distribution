package typings.awsSdkClientLambdaNode.typesInvokeInputMod

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.DryRun
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Event
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.None
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestResponse
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Tail
import typings.awsSdkClientLambdaNode.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you are invoking. You can then process the client information in your Lambda function as you choose through the context variable. For an example of a <code>ClientContext</code> JSON, see <a href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.</p> <p>The ClientContext JSON must be base64-encoded and has a maximum size of 3583 bytes.</p> <note> <p> <code>ClientContext</code> information is returned only if you use the synchronous (<code>RequestResponse</code>) invocation type.</p> </note>
    */
  var ClientContext: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
    */
  var FunctionName: String
  /**
    * <p>Choose from the following options.</p> <ul> <li> <p> <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the function returns a response or times out.</p> </li> <li> <p> <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's dead-letter queue (if configured).</p> </li> <li> <p> <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the function.</p> </li> </ul>
    */
  var InvocationType: js.UndefOr[Event | RequestResponse | DryRun | String] = js.undefined
  /**
    * <p>You can set this optional parameter to <code>Tail</code> in the request only if you specify the <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code> header. </p>
    */
  var LogType: js.UndefOr[None | Tail | String] = js.undefined
  /**
    * <p>JSON that you want to provide to your Lambda function as input.</p>
    */
  var Payload: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
  /**
    * <p>Specify a version or alias to invoke a published version of the function.</p>
    */
  var Qualifier: js.UndefOr[String] = js.undefined
}

object InvokeInput {
  @scala.inline
  def apply(
    FunctionName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    ClientContext: String = null,
    InvocationType: Event | RequestResponse | DryRun | String = null,
    LogType: None | Tail | String = null,
    Payload: ArrayBuffer | ArrayBufferView | String = null,
    Qualifier: String = null
  ): InvokeInput = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (ClientContext != null) __obj.updateDynamic("ClientContext")(ClientContext.asInstanceOf[js.Any])
    if (InvocationType != null) __obj.updateDynamic("InvocationType")(InvocationType.asInstanceOf[js.Any])
    if (LogType != null) __obj.updateDynamic("LogType")(LogType.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeInput]
  }
}

