package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by a view or window that supports drag operations and will be received as part of a {@link DragGestureEvent} through a
  * {@link com.sun.star.datatransfer.dnd.XDragGestureListener.dragGestureRecognized()} callback.
  *
  * Differently to Java, the association between view and interface is fixed and can not be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a real performance issue.
  */
trait XDragSource extends XInterface {
  /**
    * To get the default cursor for a specified drag action.
    * @param dragAction A drag action as specified in {@link DNDConstants} .
    * @returns The default drag cursor for the specified drag action. The returned value may be used as parameter for the method {@link com.sun.star.datatransfe
    */
  def getDefaultCursor(dragAction: Double): Double
  /**
    * In order to query if drag image support is available.
    * @returns A boolean indicating whether or not drag image support is available on the underlying platform.
    */
  def isDragImageSupported(): Boolean
  /**
    * Starts the drag operation.
    *
    * Note: this call does **not** block until the drag and drop operation ends. If the Drag and Drop system is unable to initiate a drag operation or if
    * the user attempts to start a drag while an existing drag operation is still executing, the action fails immediately. This is indicated by calling
    * {@link com.sun.star.datatransfer.dnd.XDragSourceListener.dragDropEnd()} on the parameter listener with a {@link DragSourceDragEvent} showing a
    * failure.
    * @param trigger The {@link DragGestureEvent} that initiated the drag.
    * @param sourceActions The action or actions supported for this transferable as defined in {@link DNDConstants} .
    * @param cursor The initial drag cursor id or 0 as default.
    * @param image The initial drag image id or 0 as default.
    * @param trans The transferable object dragged.
    * @param listener The {@link XDragSourceListener} .
    * @see com.sun.star.datatransfer.XTransferable
    */
  def startDrag(
    trigger: DragGestureEvent,
    sourceActions: Double,
    cursor: Double,
    image: Double,
    trans: XTransferable,
    listener: XDragSourceListener
  ): Unit
}

object XDragSource {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDefaultCursor: Double => Double,
    isDragImageSupported: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startDrag: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Unit
  ): XDragSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), isDragImageSupported = js.Any.fromFunction0(isDragImageSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startDrag = js.Any.fromFunction6(startDrag))
  
    __obj.asInstanceOf[XDragSource]
  }
}

