package typings.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStreamInput extends InputTypesUnion {
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
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has registered consumers, the call to <code>DeleteStream</code> fails with a <code>ResourceInUseException</code>. </p>
    */
  var EnforceConsumerDeletion: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The name of the stream to delete.</p>
    */
  var StreamName: String
}

object DeleteStreamInput {
  @scala.inline
  def apply(
    StreamName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    EnforceConsumerDeletion: js.UndefOr[Boolean] = js.undefined
  ): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(EnforceConsumerDeletion)) __obj.updateDynamic("EnforceConsumerDeletion")(EnforceConsumerDeletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
}

