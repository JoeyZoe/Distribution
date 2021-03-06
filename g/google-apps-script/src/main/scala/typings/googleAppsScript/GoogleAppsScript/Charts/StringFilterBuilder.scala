package typings.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for string filter controls.
  *
  * A string filter is a simple text input field that lets the user filter data via string
  * matching. Given a column of type string and matching options, this control filters out the rows
  * that don't match the term that's in the input field.
  *
  * For more details, see the Gviz
  * documentation.
  */
trait StringFilterBuilder extends js.Object {
  def setCaseSensitive(caseSensitive: Boolean): StringFilterBuilder
  def setMatchType(matchType: MatchType): StringFilterBuilder
  def setRealtimeTrigger(realtimeTrigger: Boolean): StringFilterBuilder
}

object StringFilterBuilder {
  @scala.inline
  def apply(
    setCaseSensitive: Boolean => StringFilterBuilder,
    setMatchType: MatchType => StringFilterBuilder,
    setRealtimeTrigger: Boolean => StringFilterBuilder
  ): StringFilterBuilder = {
    val __obj = js.Dynamic.literal(setCaseSensitive = js.Any.fromFunction1(setCaseSensitive), setMatchType = js.Any.fromFunction1(setMatchType), setRealtimeTrigger = js.Any.fromFunction1(setRealtimeTrigger))
  
    __obj.asInstanceOf[StringFilterBuilder]
  }
}

