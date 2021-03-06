package typings.awsSdkClientCodecommitNode.typesTipsDivergenceExceededExceptionMod

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipsDivergenceExceededException
  extends ServiceException[TipsDivergenceExceededExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_TipsDivergenceExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipsDivergenceExceededException
}

object TipsDivergenceExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TipsDivergenceExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipsDivergenceExceededException,
    stack: String = null
  ): TipsDivergenceExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipsDivergenceExceededException]
  }
}

