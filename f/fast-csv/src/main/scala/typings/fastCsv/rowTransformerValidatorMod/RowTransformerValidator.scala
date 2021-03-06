package typings.fastCsv.rowTransformerValidatorMod

import typings.fastCsv.parserTypesMod.Row
import typings.fastCsv.parserTypesMod.RowTransformFunction
import typings.fastCsv.parserTypesMod.RowValidate
import typings.fastCsv.parserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowTransformerValidator extends js.Object {
  var _rowTransform: js.Any
  var _rowValidator: js.Any
  var callTransformer: js.Any
  var callValidator: js.Any
  def rowTransform(transformFunction: RowTransformFunction): js.Any
  def rowValidator(validateFunction: RowValidate): js.Any
  def transformAndValidate(row: Row, cb: RowValidatorCallback): Unit
}

object RowTransformerValidator {
  @scala.inline
  def apply(
    _rowTransform: js.Any,
    _rowValidator: js.Any,
    callTransformer: js.Any,
    callValidator: js.Any,
    rowTransform: RowTransformFunction => js.Any,
    rowValidator: RowValidate => js.Any,
    transformAndValidate: (Row, RowValidatorCallback) => Unit
  ): RowTransformerValidator = {
    val __obj = js.Dynamic.literal(_rowTransform = _rowTransform.asInstanceOf[js.Any], _rowValidator = _rowValidator.asInstanceOf[js.Any], callTransformer = callTransformer.asInstanceOf[js.Any], callValidator = callValidator.asInstanceOf[js.Any], rowTransform = js.Any.fromFunction1(rowTransform), rowValidator = js.Any.fromFunction1(rowValidator), transformAndValidate = js.Any.fromFunction2(transformAndValidate))
  
    __obj.asInstanceOf[RowTransformerValidator]
  }
}

