package typings.storybookComponents

import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Event_
import typings.std.HTMLSelectElement
import typings.storybookComponents.inputMod.Alignments
import typings.storybookComponents.inputMod.Sizes
import typings.storybookComponents.inputMod.ValidationStates
import typings.storybookComponents.storybookComponentsStrings.`additions text`
import typings.storybookComponents.storybookComponentsStrings.`inline`
import typings.storybookComponents.storybookComponentsStrings.additions
import typings.storybookComponents.storybookComponentsStrings.all
import typings.storybookComponents.storybookComponentsStrings.ascending
import typings.storybookComponents.storybookComponentsStrings.assertive
import typings.storybookComponents.storybookComponentsStrings.both
import typings.storybookComponents.storybookComponentsStrings.copy
import typings.storybookComponents.storybookComponentsStrings.date
import typings.storybookComponents.storybookComponentsStrings.decimal
import typings.storybookComponents.storybookComponentsStrings.descending
import typings.storybookComponents.storybookComponentsStrings.dialog
import typings.storybookComponents.storybookComponentsStrings.email
import typings.storybookComponents.storybookComponentsStrings.execute
import typings.storybookComponents.storybookComponentsStrings.grammar
import typings.storybookComponents.storybookComponentsStrings.grid
import typings.storybookComponents.storybookComponentsStrings.horizontal
import typings.storybookComponents.storybookComponentsStrings.inherit
import typings.storybookComponents.storybookComponentsStrings.link
import typings.storybookComponents.storybookComponentsStrings.list
import typings.storybookComponents.storybookComponentsStrings.listbox
import typings.storybookComponents.storybookComponentsStrings.location
import typings.storybookComponents.storybookComponentsStrings.menu
import typings.storybookComponents.storybookComponentsStrings.mixed
import typings.storybookComponents.storybookComponentsStrings.move
import typings.storybookComponents.storybookComponentsStrings.no
import typings.storybookComponents.storybookComponentsStrings.none
import typings.storybookComponents.storybookComponentsStrings.numeric
import typings.storybookComponents.storybookComponentsStrings.off
import typings.storybookComponents.storybookComponentsStrings.on
import typings.storybookComponents.storybookComponentsStrings.other
import typings.storybookComponents.storybookComponentsStrings.page
import typings.storybookComponents.storybookComponentsStrings.polite
import typings.storybookComponents.storybookComponentsStrings.popup
import typings.storybookComponents.storybookComponentsStrings.removals
import typings.storybookComponents.storybookComponentsStrings.search
import typings.storybookComponents.storybookComponentsStrings.spelling
import typings.storybookComponents.storybookComponentsStrings.step
import typings.storybookComponents.storybookComponentsStrings.tel
import typings.storybookComponents.storybookComponentsStrings.text
import typings.storybookComponents.storybookComponentsStrings.time
import typings.storybookComponents.storybookComponentsStrings.tree
import typings.storybookComponents.storybookComponentsStrings.url
import typings.storybookComponents.storybookComponentsStrings.vertical
import typings.storybookComponents.storybookComponentsStrings.yes
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any> & std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & @emotion/styled-base.AnonThemeTheme<@storybook/theming.@storybook/theming.Theme>> */
@js.native
trait PartialPickSelectHTMLAttr extends js.Object {
  var about: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var align: js.UndefOr[Alignments] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var form: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var lang: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onAbortCapture: js.UndefOr[js.Any] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.native
  var onAnimationEndCapture: js.UndefOr[js.Any] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.native
  var onAnimationIterationCapture: js.UndefOr[js.Any] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.native
  var onAnimationStartCapture: js.UndefOr[js.Any] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onAuxClickCapture: js.UndefOr[js.Any] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
  var onBeforeInputCapture: js.UndefOr[js.Any] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.native
  var onBlurCapture: js.UndefOr[js.Any] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onCanPlayCapture: js.UndefOr[js.Any] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[js.Any] = js.native
  var onChange: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.native
  var onChangeCapture: js.UndefOr[js.Any] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onClickCapture: js.UndefOr[js.Any] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.native
  var onCompositionEndCapture: js.UndefOr[js.Any] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.native
  var onCompositionStartCapture: js.UndefOr[js.Any] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[js.Any] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onContextMenuCapture: js.UndefOr[js.Any] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.native
  var onCopyCapture: js.UndefOr[js.Any] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.native
  var onCutCapture: js.UndefOr[js.Any] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onDoubleClickCapture: js.UndefOr[js.Any] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDragCapture: js.UndefOr[js.Any] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDragEndCapture: js.UndefOr[js.Any] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDragEnterCapture: js.UndefOr[js.Any] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDragExitCapture: js.UndefOr[js.Any] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDragLeaveCapture: js.UndefOr[js.Any] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDragOverCapture: js.UndefOr[js.Any] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDragStartCapture: js.UndefOr[js.Any] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
  var onDropCapture: js.UndefOr[js.Any] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onDurationChangeCapture: js.UndefOr[js.Any] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onEmptiedCapture: js.UndefOr[js.Any] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onEncryptedCapture: js.UndefOr[js.Any] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onEndedCapture: js.UndefOr[js.Any] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onErrorCapture: js.UndefOr[js.Any] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.native
  var onFocusCapture: js.UndefOr[js.Any] = js.native
  var onGotPointerCapture: js.UndefOr[js.Any] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
  var onInputCapture: js.UndefOr[js.Any] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
  var onInvalidCapture: js.UndefOr[js.Any] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.native
  var onKeyDownCapture: js.UndefOr[js.Any] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.native
  var onKeyPressCapture: js.UndefOr[js.Any] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.native
  var onKeyUpCapture: js.UndefOr[js.Any] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onLoadCapture: js.UndefOr[js.Any] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onLoadStartCapture: js.UndefOr[js.Any] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onLoadedDataCapture: js.UndefOr[js.Any] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[js.Any] = js.native
  var onLostPointerCapture: js.UndefOr[js.Any] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onMouseDownCapture: js.UndefOr[js.Any] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onMouseMoveCapture: js.UndefOr[js.Any] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onMouseOutCapture: js.UndefOr[js.Any] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onMouseOverCapture: js.UndefOr[js.Any] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
  var onMouseUpCapture: js.UndefOr[js.Any] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.native
  var onPasteCapture: js.UndefOr[js.Any] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onPauseCapture: js.UndefOr[js.Any] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onPlayCapture: js.UndefOr[js.Any] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onPlayingCapture: js.UndefOr[js.Any] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerCancelCapture: js.UndefOr[js.Any] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerDownCapture: js.UndefOr[js.Any] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerEnterCapture: js.UndefOr[js.Any] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerLeaveCapture: js.UndefOr[js.Any] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerMoveCapture: js.UndefOr[js.Any] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerOutCapture: js.UndefOr[js.Any] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerOverCapture: js.UndefOr[js.Any] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
  var onPointerUpCapture: js.UndefOr[js.Any] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onProgressCapture: js.UndefOr[js.Any] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onRateChangeCapture: js.UndefOr[js.Any] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
  var onResetCapture: js.UndefOr[js.Any] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLSelectElement]] = js.native
  var onScrollCapture: js.UndefOr[js.Any] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onSeekedCapture: js.UndefOr[js.Any] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onSeekingCapture: js.UndefOr[js.Any] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onSelectCapture: js.UndefOr[js.Any] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onStalledCapture: js.UndefOr[js.Any] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
  var onSubmitCapture: js.UndefOr[js.Any] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onSuspendCapture: js.UndefOr[js.Any] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onTimeUpdateCapture: js.UndefOr[js.Any] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Any] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
  var onTouchStartCapture: js.UndefOr[js.Any] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLSelectElement]] = js.native
  var onTransitionEndCapture: js.UndefOr[js.Any] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onVolumeChangeCapture: js.UndefOr[js.Any] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
  var onWaitingCapture: js.UndefOr[js.Any] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLSelectElement]] = js.native
  var onWheelCapture: js.UndefOr[js.Any] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var size: js.UndefOr[Sizes] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var valid: js.UndefOr[ValidationStates] = js.native
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var vocab: js.UndefOr[String] = js.native
}

object PartialPickSelectHTMLAttr {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    align: Alignments = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    css: js.Any = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    key: Key = null,
    lang: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onAbort: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onAbortCapture: js.Any = null,
    onAnimationEnd: AnimationEvent[HTMLSelectElement] => Unit = null,
    onAnimationEndCapture: js.Any = null,
    onAnimationIteration: AnimationEvent[HTMLSelectElement] => Unit = null,
    onAnimationIterationCapture: js.Any = null,
    onAnimationStart: AnimationEvent[HTMLSelectElement] => Unit = null,
    onAnimationStartCapture: js.Any = null,
    onAuxClick: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onAuxClickCapture: js.Any = null,
    onBeforeInput: FormEvent[HTMLSelectElement] => Unit = null,
    onBeforeInputCapture: js.Any = null,
    onBlur: FocusEvent[HTMLSelectElement] => Unit = null,
    onBlurCapture: js.Any = null,
    onCanPlay: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onCanPlayCapture: js.Any = null,
    onCanPlayThrough: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onCanPlayThroughCapture: js.Any = null,
    onChange: ChangeEvent[HTMLSelectElement] => Unit = null,
    onChangeCapture: js.Any = null,
    onClick: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onClickCapture: js.Any = null,
    onCompositionEnd: CompositionEvent[HTMLSelectElement] => Unit = null,
    onCompositionEndCapture: js.Any = null,
    onCompositionStart: CompositionEvent[HTMLSelectElement] => Unit = null,
    onCompositionStartCapture: js.Any = null,
    onCompositionUpdate: CompositionEvent[HTMLSelectElement] => Unit = null,
    onCompositionUpdateCapture: js.Any = null,
    onContextMenu: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onContextMenuCapture: js.Any = null,
    onCopy: ClipboardEvent[HTMLSelectElement] => Unit = null,
    onCopyCapture: js.Any = null,
    onCut: ClipboardEvent[HTMLSelectElement] => Unit = null,
    onCutCapture: js.Any = null,
    onDoubleClick: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onDoubleClickCapture: js.Any = null,
    onDrag: DragEvent[HTMLSelectElement] => Unit = null,
    onDragCapture: js.Any = null,
    onDragEnd: DragEvent[HTMLSelectElement] => Unit = null,
    onDragEndCapture: js.Any = null,
    onDragEnter: DragEvent[HTMLSelectElement] => Unit = null,
    onDragEnterCapture: js.Any = null,
    onDragExit: DragEvent[HTMLSelectElement] => Unit = null,
    onDragExitCapture: js.Any = null,
    onDragLeave: DragEvent[HTMLSelectElement] => Unit = null,
    onDragLeaveCapture: js.Any = null,
    onDragOver: DragEvent[HTMLSelectElement] => Unit = null,
    onDragOverCapture: js.Any = null,
    onDragStart: DragEvent[HTMLSelectElement] => Unit = null,
    onDragStartCapture: js.Any = null,
    onDrop: DragEvent[HTMLSelectElement] => Unit = null,
    onDropCapture: js.Any = null,
    onDurationChange: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onDurationChangeCapture: js.Any = null,
    onEmptied: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onEmptiedCapture: js.Any = null,
    onEncrypted: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onEncryptedCapture: js.Any = null,
    onEnded: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onEndedCapture: js.Any = null,
    onError: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onErrorCapture: js.Any = null,
    onFocus: FocusEvent[HTMLSelectElement] => Unit = null,
    onFocusCapture: js.Any = null,
    onGotPointerCapture: js.Any = null,
    onGotPointerCaptureCapture: js.Any = null,
    onInput: FormEvent[HTMLSelectElement] => Unit = null,
    onInputCapture: js.Any = null,
    onInvalid: FormEvent[HTMLSelectElement] => Unit = null,
    onInvalidCapture: js.Any = null,
    onKeyDown: KeyboardEvent[HTMLSelectElement] => Unit = null,
    onKeyDownCapture: js.Any = null,
    onKeyPress: KeyboardEvent[HTMLSelectElement] => Unit = null,
    onKeyPressCapture: js.Any = null,
    onKeyUp: KeyboardEvent[HTMLSelectElement] => Unit = null,
    onKeyUpCapture: js.Any = null,
    onLoad: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onLoadCapture: js.Any = null,
    onLoadStart: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onLoadStartCapture: js.Any = null,
    onLoadedData: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onLoadedDataCapture: js.Any = null,
    onLoadedMetadata: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onLoadedMetadataCapture: js.Any = null,
    onLostPointerCapture: js.Any = null,
    onLostPointerCaptureCapture: js.Any = null,
    onMouseDown: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onMouseDownCapture: js.Any = null,
    onMouseEnter: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onMouseMoveCapture: js.Any = null,
    onMouseOut: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onMouseOutCapture: js.Any = null,
    onMouseOver: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onMouseOverCapture: js.Any = null,
    onMouseUp: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit = null,
    onMouseUpCapture: js.Any = null,
    onPaste: ClipboardEvent[HTMLSelectElement] => Unit = null,
    onPasteCapture: js.Any = null,
    onPause: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onPauseCapture: js.Any = null,
    onPlay: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onPlayCapture: js.Any = null,
    onPlaying: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onPlayingCapture: js.Any = null,
    onPointerCancel: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerCancelCapture: js.Any = null,
    onPointerDown: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerDownCapture: js.Any = null,
    onPointerEnter: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerEnterCapture: js.Any = null,
    onPointerLeave: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerLeaveCapture: js.Any = null,
    onPointerMove: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerMoveCapture: js.Any = null,
    onPointerOut: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerOutCapture: js.Any = null,
    onPointerOver: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerOverCapture: js.Any = null,
    onPointerUp: PointerEvent[HTMLSelectElement] => Unit = null,
    onPointerUpCapture: js.Any = null,
    onProgress: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onProgressCapture: js.Any = null,
    onRateChange: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onRateChangeCapture: js.Any = null,
    onReset: FormEvent[HTMLSelectElement] => Unit = null,
    onResetCapture: js.Any = null,
    onScroll: UIEvent[HTMLSelectElement, NativeUIEvent] => Unit = null,
    onScrollCapture: js.Any = null,
    onSeeked: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onSeekedCapture: js.Any = null,
    onSeeking: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onSeekingCapture: js.Any = null,
    onSelect: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onSelectCapture: js.Any = null,
    onStalled: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onStalledCapture: js.Any = null,
    onSubmit: FormEvent[HTMLSelectElement] => Unit = null,
    onSubmitCapture: js.Any = null,
    onSuspend: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onSuspendCapture: js.Any = null,
    onTimeUpdate: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onTimeUpdateCapture: js.Any = null,
    onTouchCancel: TouchEvent[HTMLSelectElement] => Unit = null,
    onTouchCancelCapture: js.Any = null,
    onTouchEnd: TouchEvent[HTMLSelectElement] => Unit = null,
    onTouchEndCapture: js.Any = null,
    onTouchMove: TouchEvent[HTMLSelectElement] => Unit = null,
    onTouchMoveCapture: js.Any = null,
    onTouchStart: TouchEvent[HTMLSelectElement] => Unit = null,
    onTouchStartCapture: js.Any = null,
    onTransitionEnd: TransitionEvent[HTMLSelectElement] => Unit = null,
    onTransitionEndCapture: js.Any = null,
    onVolumeChange: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onVolumeChangeCapture: js.Any = null,
    onWaiting: SyntheticEvent[HTMLSelectElement, Event_] => Unit = null,
    onWaitingCapture: js.Any = null,
    onWheel: WheelEvent[HTMLSelectElement] => Unit = null,
    onWheelCapture: js.Any = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    ref: Ref[_] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null
  ): PartialPickSelectHTMLAttr = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(onAbortCapture.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(onAnimationEndCapture.asInstanceOf[js.Any])
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(onAnimationIterationCapture.asInstanceOf[js.Any])
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(onAnimationStartCapture.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(onAuxClickCapture.asInstanceOf[js.Any])
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(onBeforeInputCapture.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(onBlurCapture.asInstanceOf[js.Any])
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(onCanPlayCapture.asInstanceOf[js.Any])
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(onCanPlayThroughCapture.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(onChangeCapture.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(onClickCapture.asInstanceOf[js.Any])
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(onCompositionEndCapture.asInstanceOf[js.Any])
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(onCompositionStartCapture.asInstanceOf[js.Any])
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(onCompositionUpdateCapture.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(onContextMenuCapture.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(onCopyCapture.asInstanceOf[js.Any])
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(onCutCapture.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(onDoubleClickCapture.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(onDragCapture.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(onDragEndCapture.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(onDragEnterCapture.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(onDragExitCapture.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(onDragLeaveCapture.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(onDragOverCapture.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(onDragStartCapture.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(onDropCapture.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(onDurationChangeCapture.asInstanceOf[js.Any])
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(onEmptiedCapture.asInstanceOf[js.Any])
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(onEncryptedCapture.asInstanceOf[js.Any])
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(onEndedCapture.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(onFocusCapture.asInstanceOf[js.Any])
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(onGotPointerCapture.asInstanceOf[js.Any])
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(onGotPointerCaptureCapture.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(onInputCapture.asInstanceOf[js.Any])
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(onInvalidCapture.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(onKeyDownCapture.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(onKeyPressCapture.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(onKeyUpCapture.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(onLoadCapture.asInstanceOf[js.Any])
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(onLoadStartCapture.asInstanceOf[js.Any])
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(onLoadedDataCapture.asInstanceOf[js.Any])
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(onLoadedMetadataCapture.asInstanceOf[js.Any])
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(onLostPointerCapture.asInstanceOf[js.Any])
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(onLostPointerCaptureCapture.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(onMouseDownCapture.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(onMouseMoveCapture.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(onMouseOutCapture.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(onMouseOverCapture.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(onMouseUpCapture.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(onPasteCapture.asInstanceOf[js.Any])
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(onPauseCapture.asInstanceOf[js.Any])
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(onPlayCapture.asInstanceOf[js.Any])
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(onPlayingCapture.asInstanceOf[js.Any])
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(onPointerCancelCapture.asInstanceOf[js.Any])
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(onPointerDownCapture.asInstanceOf[js.Any])
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(onPointerEnterCapture.asInstanceOf[js.Any])
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(onPointerLeaveCapture.asInstanceOf[js.Any])
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(onPointerMoveCapture.asInstanceOf[js.Any])
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(onPointerOutCapture.asInstanceOf[js.Any])
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(onPointerOverCapture.asInstanceOf[js.Any])
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(onPointerUpCapture.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(onProgressCapture.asInstanceOf[js.Any])
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(onRateChangeCapture.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(onResetCapture.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(onScrollCapture.asInstanceOf[js.Any])
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(onSeekedCapture.asInstanceOf[js.Any])
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(onSeekingCapture.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(onSelectCapture.asInstanceOf[js.Any])
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(onStalledCapture.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(onSubmitCapture.asInstanceOf[js.Any])
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(onSuspendCapture.asInstanceOf[js.Any])
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(onTimeUpdateCapture.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(onTouchCancelCapture.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(onTouchMoveCapture.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(onTouchStartCapture.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(onTransitionEndCapture.asInstanceOf[js.Any])
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(onVolumeChangeCapture.asInstanceOf[js.Any])
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(onWaitingCapture.asInstanceOf[js.Any])
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(onWheelCapture.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickSelectHTMLAttr]
  }
}

