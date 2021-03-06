package typings.semanticUiReact.listListMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.listItemMod.ListItemProps
import typings.semanticUiReact.semanticUiReactStrings.very
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictListProps extends js.Object {
  /** A list can animate to set the current item apart from the list. */
  var animated: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A list can mark items with a bullet. */
  var bulleted: js.UndefOr[Boolean] = js.undefined
  /** A list can divide its items into cells. */
  var celled: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A list can show divisions between content. */
  var divided: js.UndefOr[Boolean] = js.undefined
  /** An list can be floated left or right. */
  var floated: js.UndefOr[SemanticFLOATS] = js.undefined
  /** A list can be formatted to have items appear horizontally. */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /** A list can be inverted to appear on a dark background. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Shorthand array of props for ListItem. */
  var items: js.UndefOr[SemanticShorthandCollection[ListItemProps]] = js.undefined
  /** A list can be specially formatted for navigation links. */
  var link: js.UndefOr[Boolean] = js.undefined
  /**
    * onClick handler for ListItem. Mutually exclusive with children.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All item props.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ ListItemProps, 
      Unit
    ]
  ] = js.undefined
  /** A list can be ordered numerically. */
  var ordered: js.UndefOr[Boolean] = js.undefined
  /** A list can relax its padding to provide more negative space. */
  var relaxed: js.UndefOr[Boolean | very] = js.undefined
  /** A selection list formats list items as possible choices. */
  var selection: js.UndefOr[Boolean] = js.undefined
  /** A list can vary in size. */
  var size: js.UndefOr[SemanticSIZES] = js.undefined
  /** An element inside a list can be vertically aligned. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictListProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    bulleted: js.UndefOr[Boolean] = js.undefined,
    celled: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    divided: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[ListItemProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    onItemClick: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ListItemProps) => Unit = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    relaxed: Boolean | very = null,
    selection: js.UndefOr[Boolean] = js.undefined,
    size: SemanticSIZES = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
  ): StrictListProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(bulleted)) __obj.updateDynamic("bulleted")(bulleted.asInstanceOf[js.Any])
    if (!js.isUndefined(celled)) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (!js.isUndefined(selection)) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictListProps]
  }
}

