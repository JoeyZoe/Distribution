package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the members of a label range collection and to insert and remove them.
  * @see com.sun.star.sheet.LabelRanges
  * @see com.sun.star.sheet.LabelRange
  */
trait XLabelRanges extends XIndexAccess {
  /**
    * adds a new label range to the collection.
    * @param aLabelArea the cell range containing the titles of the label range.
    * @param aDataArea the cell range containing the values of the label range.
    */
  def addNew(aLabelArea: CellRangeAddress, aDataArea: CellRangeAddress): Unit
  /** removes a label range from the collection. */
  def removeByIndex(nIndex: Double): Unit
}

object XLabelRanges {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    addNew: (CellRangeAddress, CellRangeAddress) => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XLabelRanges = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
  
    __obj.asInstanceOf[XLabelRanges]
  }
}

