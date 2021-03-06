package typings.fundamentalReact.buttonMod

import typings.fundamentalReact.fundamentalReactStrings.`additions text`
import typings.fundamentalReact.fundamentalReactStrings.`inline`
import typings.fundamentalReact.fundamentalReactStrings.additions
import typings.fundamentalReact.fundamentalReactStrings.all
import typings.fundamentalReact.fundamentalReactStrings.ascending
import typings.fundamentalReact.fundamentalReactStrings.assertive
import typings.fundamentalReact.fundamentalReactStrings.both
import typings.fundamentalReact.fundamentalReactStrings.button_
import typings.fundamentalReact.fundamentalReactStrings.copy
import typings.fundamentalReact.fundamentalReactStrings.date
import typings.fundamentalReact.fundamentalReactStrings.decimal
import typings.fundamentalReact.fundamentalReactStrings.descending
import typings.fundamentalReact.fundamentalReactStrings.dialog
import typings.fundamentalReact.fundamentalReactStrings.email
import typings.fundamentalReact.fundamentalReactStrings.execute
import typings.fundamentalReact.fundamentalReactStrings.grammar
import typings.fundamentalReact.fundamentalReactStrings.grid
import typings.fundamentalReact.fundamentalReactStrings.horizontal
import typings.fundamentalReact.fundamentalReactStrings.inherit
import typings.fundamentalReact.fundamentalReactStrings.link_
import typings.fundamentalReact.fundamentalReactStrings.list_
import typings.fundamentalReact.fundamentalReactStrings.listbox
import typings.fundamentalReact.fundamentalReactStrings.location
import typings.fundamentalReact.fundamentalReactStrings.menu_
import typings.fundamentalReact.fundamentalReactStrings.mixed
import typings.fundamentalReact.fundamentalReactStrings.move
import typings.fundamentalReact.fundamentalReactStrings.no
import typings.fundamentalReact.fundamentalReactStrings.none
import typings.fundamentalReact.fundamentalReactStrings.numeric
import typings.fundamentalReact.fundamentalReactStrings.off
import typings.fundamentalReact.fundamentalReactStrings.on
import typings.fundamentalReact.fundamentalReactStrings.other
import typings.fundamentalReact.fundamentalReactStrings.page
import typings.fundamentalReact.fundamentalReactStrings.polite
import typings.fundamentalReact.fundamentalReactStrings.popup
import typings.fundamentalReact.fundamentalReactStrings.removals
import typings.fundamentalReact.fundamentalReactStrings.reset
import typings.fundamentalReact.fundamentalReactStrings.search
import typings.fundamentalReact.fundamentalReactStrings.spelling
import typings.fundamentalReact.fundamentalReactStrings.step
import typings.fundamentalReact.fundamentalReactStrings.submit
import typings.fundamentalReact.fundamentalReactStrings.tel
import typings.fundamentalReact.fundamentalReactStrings.text
import typings.fundamentalReact.fundamentalReactStrings.time_
import typings.fundamentalReact.fundamentalReactStrings.tree
import typings.fundamentalReact.fundamentalReactStrings.url
import typings.fundamentalReact.fundamentalReactStrings.vertical
import typings.fundamentalReact.fundamentalReactStrings.yes
import typings.react.AnonHtml
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  className ? :string,   compact ? :boolean,   disabled ? :boolean,   disableStyles ? :boolean,   glyph ? :string,   option ? :fundamental-react.fundamental-react/lib/Button/Button.ButtonOptions,   ref ? :react.react.RefObject<std.HTMLButtonElement>,   selected ? :boolean,   type ? :fundamental-react.fundamental-react/lib/Button/Button.ButtonTypes,   typeAttr ? :'submit' | 'reset' | 'button', onClick ? (event : react.react.MouseEvent<std.HTMLButtonElement, std.MouseEvent>): void} & react.react.HTMLAttributes<std.HTMLButtonElement> */
@js.native
trait ButtonProps extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list_ | both] = js.native
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.native
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.native
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time_] = js.native
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.native
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.native
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link_ | move | popup] = js.native
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.native
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.native
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu_ | listbox | tree | grid | dialog] = js.native
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.native
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.native
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.native
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.native
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.native
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.native
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.native
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var datatype: js.UndefOr[String] = js.native
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var glyph: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onClick: js.UndefOr[
    (js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]) | MouseEventHandler[HTMLButtonElement]
  ] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.native
  var option: js.UndefOr[ButtonOptions] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  var ref: js.UndefOr[RefObject[HTMLButtonElement]] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var `type`: js.UndefOr[ButtonTypes] = js.native
  var typeAttr: js.UndefOr[submit | reset | button_] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var vocab: js.UndefOr[String] = js.native
}

