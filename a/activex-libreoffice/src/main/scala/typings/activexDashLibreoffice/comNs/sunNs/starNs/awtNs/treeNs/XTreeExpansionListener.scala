package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.treeNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface can get notifications from a {@link TreeControl} when nodes are expanded or collapsed.
  * @see XTreeControl.addTreeExpansionListener
  * @see XTreeControl.removeTreeExpansionListener
  */
trait XTreeExpansionListener extends XEventListener {
  /**
    * Invoked when a node with children on demand is about to be expanded.
    *
    * This event is invoked before the {@link treeExpanding()} event.
    */
  def requestChildNodes(Event: TreeExpansionEvent): Unit
  /** Called whenever a node in the tree has been successfully collapsed. */
  def treeCollapsed(Event: TreeExpansionEvent): Unit
  /**
    * Invoked whenever a node in the tree is about to be collapsed.
    * @throws ExpandVetoException to notify the calling {@link XTreeControl} that collapsing {@link TreeExpansionEvent.Node} should fail.
    */
  def treeCollapsing(Event: TreeExpansionEvent): Unit
  /** Called whenever a node in the tree has been successfully expanded. */
  def treeExpanded(Event: TreeExpansionEvent): Unit
  /**
    * Invoked whenever a node in the tree is about to be expanded.
    * @throws ExpandVetoException to notify the calling {@link XTreeControl} that expanding {@link TreeExpansionEvent.Node} should fail.
    */
  def treeExpanding(Event: TreeExpansionEvent): Unit
}

object XTreeExpansionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestChildNodes: TreeExpansionEvent => Unit,
    treeCollapsed: TreeExpansionEvent => Unit,
    treeCollapsing: TreeExpansionEvent => Unit,
    treeExpanded: TreeExpansionEvent => Unit,
    treeExpanding: TreeExpansionEvent => Unit
  ): XTreeExpansionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestChildNodes = js.Any.fromFunction1(requestChildNodes), treeCollapsed = js.Any.fromFunction1(treeCollapsed), treeCollapsing = js.Any.fromFunction1(treeCollapsing), treeExpanded = js.Any.fromFunction1(treeExpanded), treeExpanding = js.Any.fromFunction1(treeExpanding))
  
    __obj.asInstanceOf[XTreeExpansionListener]
  }
}

