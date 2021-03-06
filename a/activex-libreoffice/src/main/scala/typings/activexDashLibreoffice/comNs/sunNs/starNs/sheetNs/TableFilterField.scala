package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single condition in a filter descriptor.
  * @see SheetFilterDescriptor
  */
trait TableFilterField extends js.Object {
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection
  /** specifies which field (column) is used for the condition. */
  var Field: Double
  /** selects whether the {@link TableFilterField.NumericValue} or the {@link TableFilterField.StringValue} is used. */
  var IsNumeric: Boolean
  /** specifies a numeric value for the condition. */
  var NumericValue: Double
  /** specifies the type of the condition. */
  var Operator: FilterOperator
  /** specifies a string value for the condition. */
  var StringValue: String
}

object TableFilterField {
  @scala.inline
  def apply(
    Connection: FilterConnection,
    Field: Double,
    IsNumeric: Boolean,
    NumericValue: Double,
    Operator: FilterOperator,
    StringValue: String
  ): TableFilterField = {
    val __obj = js.Dynamic.literal(Connection = Connection, Field = Field, IsNumeric = IsNumeric, NumericValue = NumericValue, Operator = Operator, StringValue = StringValue)
  
    __obj.asInstanceOf[TableFilterField]
  }
}

