package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a rule, for all traditional rule/format pairings.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalFormatRuleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[Boolean] = js.undefined
}

object ConditionalFormatRuleLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    formula: js.UndefOr[Boolean] = js.undefined,
    formulaLocal: js.UndefOr[Boolean] = js.undefined,
    formulaR1C1: js.UndefOr[Boolean] = js.undefined
  ): ConditionalFormatRuleLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(formula)) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (!js.isUndefined(formulaLocal)) __obj.updateDynamic("formulaLocal")(formulaLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(formulaR1C1)) __obj.updateDynamic("formulaR1C1")(formulaR1C1.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormatRuleLoadOptions]
  }
}

