package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the navigation on a table of data. A {@link com.sun.star.sdbc.ResultSet} object is usually generated by executing a {@link
  * com.sun.star.sdbc.Statement} .
  *
  * A {@link ResultSet} maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row. The "next" method
  * moves the cursor to the next row.
  */
trait XResultSet extends XInterface {
  /**
    * retrieves the current row number. The first row is number 1, the second number 2, and so on.
    * @returns the current position
    * @throws SQLException if a database access error occurs.
    */
  val Row: Double
  /**
    * returns the {@link Statement} that produced this {@link com.sun.star.sdbc.ResultSet} object. If the result set was generated some other way, such as
    * by an {@link com.sun.star.sdbc.XDatabaseMetaData} method, this method returns `NULL` .
    * @returns the statement object
    * @throws SQLException if a database access error occurs.
    */
  val Statement: XInterface
  /**
    * moves the cursor to the given row number in the result set.
    *
    * If the row number is positive, the cursor moves to the given row number with respect to the beginning of the result set. The first row is row 1, the
    * second is row 2, and so on.
    *
    * If the given row number is negative, the cursor moves to an absolute row position with respect to the end of the result set. For example, calling
    * `absolute(-1)` positions the cursor on the last row, `absolute(-2)` indicates the next-to-last row, and so on.
    *
    * An attempt to position the cursor beyond the first/last row in the result set leaves the cursor before/after the first/last row, respectively.
    *
    * Note: Calling `absolute(1)` is the same as calling {@link com.sun.star.sdbc.XResultSet.first()} . Calling `moveToPosition(-1)` is the same as calling
    * `moveToLast()` .
    */
  def absolute(row: Double): Boolean
  /**
    * moves the cursor to the end of the result set, just after the last row. Has no effect if the result set contains no rows.
    * @throws SQLException if a database access error occurs.
    */
  def afterLast(): Unit
  /**
    * moves the cursor to the front of the result set, just before the first row. Has no effect if the result set contains no rows.
    * @throws SQLException if a database access error occurs.
    */
  def beforeFirst(): Unit
  /**
    * moves the cursor to the first row in the result set.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def first(): Boolean
  /**
    * retrieves the current row number. The first row is number 1, the second number 2, and so on.
    * @returns the current position
    * @throws SQLException if a database access error occurs.
    */
  def getRow(): Double
  /**
    * returns the {@link Statement} that produced this {@link com.sun.star.sdbc.ResultSet} object. If the result set was generated some other way, such as
    * by an {@link com.sun.star.sdbc.XDatabaseMetaData} method, this method returns `NULL` .
    * @returns the statement object
    * @throws SQLException if a database access error occurs.
    */
  def getStatement(): XInterface
  /**
    * indicates whether the cursor is after the last row in the result set.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isAfterLast(): Boolean
  /**
    * indicates whether the cursor is before the first row in the result set.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isBeforeFirst(): Boolean
  /**
    * indicates whether the cursor is on the first row of the result set.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isFirst(): Boolean
  /**
    * indicates whether the cursor is on the last row of the result set.
    *
    * ** Note: ** Calling the method `isAtLast` may be expensive because the SDBC driver might need to fetch ahead one row in order to determine whether the
    * current row is the last row in the result set.
    * @returns `TRUE` if so
    * @throws SQLException if a database access error occurs.
    */
  def isLast(): Boolean
  /**
    * moves the cursor to the last row in the result set.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def last(): Boolean
  /**
    * moves the cursor down one row from its current position.
    *
    * A {@link ResultSet} cursor is initially positioned before the first row; the first call to next makes the first row the current row; the second call
    * makes the second row the current row, and so on.
    *
    * If an input stream is open for the current row, a call to the method `next` will implicitly close it. The {@link ResultSet} 's warning chain is
    * cleared when a new row is read.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def next(): Boolean
  /**
    * moves the cursor to the previous row in the result set.
    *
    * Note: `previous()` is not the same as `relative(-1)` because it makes sense to call `previous()` when there is no current row.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def previous(): Boolean
  /**
    * refreshes the current row with its most recent value in the database. Cannot be called when on the insert row. The `refreshRow` method provides a way
    * for an application to explicitly tell the SDBC driver to refetch a row(s) from the database. An application may want to call `refreshRow` when caching
    * or prefetching is being done by the SDBC driver to fetch the latest value of a row from the database. The SDBC driver may actually refresh multiple
    * rows at once if the fetch size is greater than one. All values are refetched subject to the transaction isolation level and cursor sensitivity. If
    * `refreshRow` is called after calling `updateXXX` , but before calling com::sun::star::sdbc::XResultSet::updateRow() , then the updates made to the row
    * are lost. Calling the method `refreshRow` frequently will likely slow performance.
    * @throws SQLException if a database access error occurs.
    */
  def refreshRow(): Unit
  /**
    * moves the cursor a relative number of rows, either positive or negative.
    *
    * Attempting to move beyond the first/last row in the result set positions the cursor before/after the first/last row. Calling `relative(0)` is valid,
    * but does not change the cursor position.
    *
    * Note: Calling `relative(1)` is different from calling {@link com.sun.star.sdbc.XResultSet.next()} because is makes sense to call `next()` when there
    * is no current row, for example, when the cursor is positioned before the first row or after the last row of the result set.
    * @param rows how many rows should be moved relative to the current row
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def relative(rows: Double): Boolean
  /**
    * indicates whether a row has been deleted. A deleted row may leave a visible "hole" in a result set. This method can be used to detect holes in a
    * result set. The value returned depends on whether or not the result set can detect deletions.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def rowDeleted(): Boolean
  /**
    * indicates whether the current row has had an insertion. The value returned depends on whether or not the result set can detect visible inserts.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def rowInserted(): Boolean
  /**
    * indicates whether the current row has been updated. The value returned depends on whether or not the result set can detect updates.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def rowUpdated(): Boolean
}

object XResultSet {
  @scala.inline
  def apply(
    Row: Double,
    Statement: XInterface,
    absolute: Double => Boolean,
    acquire: () => Unit,
    afterLast: () => Unit,
    beforeFirst: () => Unit,
    first: () => Boolean,
    getRow: () => Double,
    getStatement: () => XInterface,
    isAfterLast: () => Boolean,
    isBeforeFirst: () => Boolean,
    isFirst: () => Boolean,
    isLast: () => Boolean,
    last: () => Boolean,
    next: () => Boolean,
    previous: () => Boolean,
    queryInterface: `type` => js.Any,
    refreshRow: () => Unit,
    relative: Double => Boolean,
    release: () => Unit,
    rowDeleted: () => Boolean,
    rowInserted: () => Boolean,
    rowUpdated: () => Boolean
  ): XResultSet = {
    val __obj = js.Dynamic.literal(Row = Row, Statement = Statement, absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), first = js.Any.fromFunction0(first), getRow = js.Any.fromFunction0(getRow), getStatement = js.Any.fromFunction0(getStatement), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated))
  
    __obj.asInstanceOf[XResultSet]
  }
}

