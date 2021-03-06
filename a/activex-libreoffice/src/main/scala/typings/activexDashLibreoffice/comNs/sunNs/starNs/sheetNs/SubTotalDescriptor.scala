package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how subtotals are created.
  *
  * The descriptor contains properties and a collection of subtotal fields which control the behavior of operation.
  */
trait SubTotalDescriptor
  extends XEnumerationAccess
     with XSubTotalDescriptor
     with XIndexAccess
     with XPropertySet {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: Boolean
  /** specifies if the contents of the fields will be sorted to groups while performing a subtotal operation. */
  var EnableSort: Boolean
  /** specifies if a user defined sorting list is used. */
  var EnableUserSortList: Boolean
  /** specifies if page breaks are inserted after each group change. */
  var InsertPageBreaks: Boolean
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean
  /**
    * returns the maximum number of subtotal fields the descriptor can hold.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: Double
  /** specifies the sorting order if {@link SubTotalDescriptor.EnableSort} is set to `TRUE` . */
  var SortAscending: Boolean
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used if {@link SubTotalDescriptor.EnableUserSortList} is `TRUE` .
    */
  var UserSortListIndex: Double
}

object SubTotalDescriptor {
  @scala.inline
  def apply(
    BindFormatsToContent: Boolean,
    Count: Double,
    ElementType: `type`,
    EnableSort: Boolean,
    EnableUserSortList: Boolean,
    InsertPageBreaks: Boolean,
    IsCaseSensitive: Boolean,
    MaxFieldCount: Double,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    UserSortListIndex: Double,
    acquire: () => Unit,
    addNew: (SeqEquiv[SubTotalColumn], Double) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    clear: () => Unit,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SubTotalDescriptor = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent, Count = Count, ElementType = ElementType, EnableSort = EnableSort, EnableUserSortList = EnableUserSortList, InsertPageBreaks = InsertPageBreaks, IsCaseSensitive = IsCaseSensitive, MaxFieldCount = MaxFieldCount, PropertySetInfo = PropertySetInfo, SortAscending = SortAscending, UserSortListIndex = UserSortListIndex, acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), clear = js.Any.fromFunction0(clear), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SubTotalDescriptor]
  }
}

