package typings.petitDom

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.Key
import typings.petitDom.petitDomStrings.a
import typings.petitDom.petitDomStrings.encrypted
import typings.petitDom.petitDomStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typings.std.Animation
import typings.std.AnimationEvent
import typings.std.Attr
import typings.std.AudioTrackList
import typings.std.Blob
import typings.std.CSSStyleDeclaration
import typings.std.CanPlayTypeResult
import typings.std.ChildNode
import typings.std.ClipboardEvent
import typings.std.DOMRect
import typings.std.DOMRectList
import typings.std.DOMStringMap
import typings.std.DOMTokenList
import typings.std.Document_
import typings.std.DragEvent
import typings.std.Element
import typings.std.Error
import typings.std.EventTarget
import typings.std.Event_
import typings.std.FocusEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.KeyboardEvent
import typings.std.Keyframe
import typings.std.MSGraphicsTrust
import typings.std.MSMediaKeyNeededEvent
import typings.std.MSMediaKeys
import typings.std.MediaEncryptedEvent
import typings.std.MediaError
import typings.std.MediaKeys
import typings.std.MediaSource
import typings.std.MediaStream
import typings.std.MouseEvent
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeListOf
import typings.std.OnErrorEventHandler
import typings.std.ParentNode
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.ShadowRoot
import typings.std.ShadowRootInit
import typings.std.TextTrack
import typings.std.TextTrackKind
import typings.std.TextTrackList
import typings.std.TimeRanges
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.VideoTrackList
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined petit-dom.petit-dom.PetitDom.Props<std.HTMLAudioElement> & {  content ? :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content>} */
trait PropsHTMLAudioElementcont extends js.Object {
  var ATTRIBUTE_NODE: js.UndefOr[Double] = js.undefined
  var CDATA_SECTION_NODE: js.UndefOr[Double] = js.undefined
  var COMMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_FRAGMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_NODE: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_CONTAINED_BY: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_CONTAINS: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_DISCONNECTED: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_FOLLOWING: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.UndefOr[Double] = js.undefined
  var DOCUMENT_POSITION_PRECEDING: js.UndefOr[Double] = js.undefined
  var DOCUMENT_TYPE_NODE: js.UndefOr[Double] = js.undefined
  var ELEMENT_NODE: js.UndefOr[Double] = js.undefined
  var ENTITY_NODE: js.UndefOr[Double] = js.undefined
  var ENTITY_REFERENCE_NODE: js.UndefOr[Double] = js.undefined
  var HAVE_CURRENT_DATA: js.UndefOr[Double] = js.undefined
  var HAVE_ENOUGH_DATA: js.UndefOr[Double] = js.undefined
  var HAVE_FUTURE_DATA: js.UndefOr[Double] = js.undefined
  var HAVE_METADATA: js.UndefOr[Double] = js.undefined
  var HAVE_NOTHING: js.UndefOr[Double] = js.undefined
  var NETWORK_EMPTY: js.UndefOr[Double] = js.undefined
  var NETWORK_IDLE: js.UndefOr[Double] = js.undefined
  var NETWORK_LOADING: js.UndefOr[Double] = js.undefined
  var NETWORK_NO_SOURCE: js.UndefOr[Double] = js.undefined
  var NOTATION_NODE: js.UndefOr[Double] = js.undefined
  var PROCESSING_INSTRUCTION_NODE: js.UndefOr[Double] = js.undefined
  var TEXT_NODE: js.UndefOr[Double] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var accessKeyLabel: js.UndefOr[String] = js.undefined
  var addEventListener: js.UndefOr[
    js.Function2[
      encrypted, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _], 
      Unit
    ]
  ] = js.undefined
  var addTextTrack: js.UndefOr[js.Function1[/* kind */ TextTrackKind, TextTrack]] = js.undefined
  var after: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var animate: js.UndefOr[js.Function1[/* keyframes */ js.Array[Keyframe], Animation]] = js.undefined
  var append: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var appendChild: js.UndefOr[js.Function1[/* newChild */ Node, Node]] = js.undefined
  var assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  var attachShadow: js.UndefOr[js.Function1[/* init */ ShadowRootInit, ShadowRoot]] = js.undefined
  var attributes: js.UndefOr[NamedNodeMap] = js.undefined
  var audioTracks: js.UndefOr[AudioTrackList] = js.undefined
  var autocapitalize: js.UndefOr[String] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var baseURI: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var buffered: js.UndefOr[TimeRanges] = js.undefined
  var canPlayType: js.UndefOr[js.Function1[/* type */ String, CanPlayTypeResult]] = js.undefined
  var childElementCount: js.UndefOr[Double] = js.undefined
  var childNodes: js.UndefOr[NodeListOf[ChildNode]] = js.undefined
  var children: js.UndefOr[HTMLCollection] = js.undefined
  var classList: js.UndefOr[DOMTokenList] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var clientHeight: js.UndefOr[Double] = js.undefined
  var clientLeft: js.UndefOr[Double] = js.undefined
  var clientTop: js.UndefOr[Double] = js.undefined
  var clientWidth: js.UndefOr[Double] = js.undefined
  var cloneNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var closest: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var compareDocumentPosition: js.UndefOr[js.Function1[/* other */ Node, Double]] = js.undefined
  var contains: js.UndefOr[js.Function1[/* other */ Node, Boolean]] = js.undefined
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  var contentEditable: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var currentSrc: js.UndefOr[String] = js.undefined
  var currentTime: js.UndefOr[Double] = js.undefined
  var dataset: js.UndefOr[DOMStringMap] = js.undefined
  var defaultMuted: js.UndefOr[Boolean] = js.undefined
  var defaultPlaybackRate: js.UndefOr[Double] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dispatchEvent: js.UndefOr[js.Function1[/* event */ Event_, Boolean]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var ended: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[MediaError] = js.undefined
  var firstChild: js.UndefOr[ChildNode] = js.undefined
  var firstElementChild: js.UndefOr[Element] = js.undefined
  var focus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getAnimations: js.UndefOr[js.Function0[js.Array[Animation]]] = js.undefined
  var getAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, String | Null]] = js.undefined
  var getAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, String | Null]] = js.undefined
  var getAttributeNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
  var getAttributeNode: js.UndefOr[js.Function1[/* name */ String, Attr | Null]] = js.undefined
  var getAttributeNodeNS: js.UndefOr[js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]] = js.undefined
  var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
  var getClientRects: js.UndefOr[js.Function0[DOMRectList]] = js.undefined
  var getElementsByClassName: js.UndefOr[js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]] = js.undefined
  var getElementsByTagName: js.UndefOr[js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]] = js.undefined
  var getElementsByTagNameNS: js.UndefOr[
    js.Function2[
      httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
      /* localName */ String, 
      HTMLCollectionOf[HTMLElement]
    ]
  ] = js.undefined
  var getRootNode: js.UndefOr[js.Function0[Node]] = js.undefined
  var hasAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var hasAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Boolean]] = js.undefined
  var hasAttributes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Boolean]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var innerHTML: js.UndefOr[String] = js.undefined
  var innerText: js.UndefOr[String] = js.undefined
  var inputMode: js.UndefOr[String] = js.undefined
  var insertAdjacentElement: js.UndefOr[
    js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  ] = js.undefined
  var insertAdjacentHTML: js.UndefOr[js.Function2[/* where */ InsertPosition, /* html */ String, Unit]] = js.undefined
  var insertAdjacentText: js.UndefOr[js.Function2[/* where */ InsertPosition, /* text */ String, Unit]] = js.undefined
  var insertBefore: js.UndefOr[js.Function2[/* newChild */ Node, /* refChild */ Node, Node]] = js.undefined
  var isConnected: js.UndefOr[Boolean] = js.undefined
  var isContentEditable: js.UndefOr[Boolean] = js.undefined
  var isDefaultNamespace: js.UndefOr[js.Function1[/* namespace */ String, Boolean]] = js.undefined
  var isEqualNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var isSameNode: js.UndefOr[js.Function1[/* otherNode */ Node, Boolean]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var lastChild: js.UndefOr[ChildNode] = js.undefined
  var lastElementChild: js.UndefOr[Element] = js.undefined
  var load: js.UndefOr[js.Function0[Unit]] = js.undefined
  var localName: js.UndefOr[String] = js.undefined
  var lookupNamespaceURI: js.UndefOr[js.Function1[/* prefix */ String, String | Null]] = js.undefined
  var lookupPrefix: js.UndefOr[js.Function1[/* namespace */ String, String | Null]] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var matches: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
  var mediaKeys: js.UndefOr[MediaKeys] = js.undefined
  var msAudioCategory: js.UndefOr[String] = js.undefined
  var msAudioDeviceType: js.UndefOr[String] = js.undefined
  var msClearEffects: js.UndefOr[js.Function0[Unit]] = js.undefined
  var msGetAsCastingSource: js.UndefOr[js.Function0[_]] = js.undefined
  var msGetRegionContent: js.UndefOr[js.Function0[_]] = js.undefined
  var msGraphicsTrustStatus: js.UndefOr[MSGraphicsTrust] = js.undefined
  var msInsertAudioEffect: js.UndefOr[
    js.Function2[/* activatableClassId */ String, /* effectRequired */ Boolean, Unit]
  ] = js.undefined
  var msKeys: js.UndefOr[MSMediaKeys] = js.undefined
  var msPlayToDisabled: js.UndefOr[Boolean] = js.undefined
  var msPlayToPreferredSourceUri: js.UndefOr[String] = js.undefined
  var msPlayToPrimary: js.UndefOr[Boolean] = js.undefined
  var msPlayToSource: js.UndefOr[js.Any] = js.undefined
  var msRealTime: js.UndefOr[Boolean] = js.undefined
  var msSetMediaKeys: js.UndefOr[js.Function1[/* mediaKeys */ MSMediaKeys, Unit]] = js.undefined
  var msSetMediaProtectionManager: js.UndefOr[js.Function0[Unit]] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var namespaceURI: js.UndefOr[String] = js.undefined
  var networkState: js.UndefOr[Double] = js.undefined
  var nextElementSibling: js.UndefOr[Element] = js.undefined
  var nextSibling: js.UndefOr[ChildNode] = js.undefined
  var nodeName: js.UndefOr[String] = js.undefined
  var nodeType: js.UndefOr[Double] = js.undefined
  var nodeValue: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var offsetHeight: js.UndefOr[Double] = js.undefined
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetParent: js.UndefOr[Element] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var offsetWidth: js.UndefOr[Double] = js.undefined
  var onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  var onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  var ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onencrypted: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]] = js.undefined
  var onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onerror: js.UndefOr[OnErrorEventHandler] = js.undefined
  var onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  var onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  var onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  var onmsneedkey: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MSMediaKeyNeededEvent, _]] = js.undefined
  var onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  var onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  var onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  var onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.undefined
  var onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  var ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  var onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onwaitingforkey: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  var outerHTML: js.UndefOr[String] = js.undefined
  var ownerDocument: js.UndefOr[Document_] = js.undefined
  var parentElement: js.UndefOr[HTMLElement] = js.undefined
  var parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var play: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var played: js.UndefOr[TimeRanges] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var prepend: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var previousElementSibling: js.UndefOr[Element] = js.undefined
  var previousSibling: js.UndefOr[ChildNode] = js.undefined
  var querySelector: js.UndefOr[js.Function1[a, HTMLAnchorElement | Null]] = js.undefined
  var querySelectorAll: js.UndefOr[js.Function1[a, NodeListOf[HTMLAnchorElement]]] = js.undefined
  var readyState: js.UndefOr[Double] = js.undefined
  var releasePointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Unit]] = js.undefined
  var removeAttributeNS: js.UndefOr[js.Function2[/* namespace */ String, /* localName */ String, Unit]] = js.undefined
  var removeAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr]] = js.undefined
  var removeChild: js.UndefOr[js.Function1[/* oldChild */ Node, Node]] = js.undefined
  var removeEventListener: js.UndefOr[
    js.Function2[
      encrypted, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _], 
      Unit
    ]
  ] = js.undefined
  var replaceChild: js.UndefOr[js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]] = js.undefined
  var replaceWith: js.UndefOr[js.Function1[/* repeated */ Node | String, Unit]] = js.undefined
  var requestFullscreen: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var requestPointerLock: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollBy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollHeight: js.UndefOr[Double] = js.undefined
  var scrollIntoView: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
  var scrollWidth: js.UndefOr[Double] = js.undefined
  var seekable: js.UndefOr[TimeRanges] = js.undefined
  var seeking: js.UndefOr[Boolean] = js.undefined
  var setAttribute: js.UndefOr[js.Function2[/* qualifiedName */ String, /* value */ String, Unit]] = js.undefined
  var setAttributeNS: js.UndefOr[
    js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  ] = js.undefined
  var setAttributeNode: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setAttributeNodeNS: js.UndefOr[js.Function1[/* attr */ Attr, Attr | Null]] = js.undefined
  var setMediaKeys: js.UndefOr[js.Function1[/* mediaKeys */ MediaKeys, js.Promise[Unit]]] = js.undefined
  var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
  var shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcObject: js.UndefOr[MediaStream | MediaSource | Blob] = js.undefined
  var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var textTracks: js.UndefOr[TextTrackList] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toggleAttribute: js.UndefOr[js.Function1[/* qualifiedName */ String, Boolean]] = js.undefined
  var translate: js.UndefOr[Boolean] = js.undefined
  var videoTracks: js.UndefOr[VideoTrackList] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var webkitMatchesSelector: js.UndefOr[js.Function1[/* selectors */ String, Boolean]] = js.undefined
}

object PropsHTMLAudioElementcont {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Int | Double = null,
    CDATA_SECTION_NODE: Int | Double = null,
    COMMENT_NODE: Int | Double = null,
    DOCUMENT_FRAGMENT_NODE: Int | Double = null,
    DOCUMENT_NODE: Int | Double = null,
    DOCUMENT_POSITION_CONTAINED_BY: Int | Double = null,
    DOCUMENT_POSITION_CONTAINS: Int | Double = null,
    DOCUMENT_POSITION_DISCONNECTED: Int | Double = null,
    DOCUMENT_POSITION_FOLLOWING: Int | Double = null,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Int | Double = null,
    DOCUMENT_POSITION_PRECEDING: Int | Double = null,
    DOCUMENT_TYPE_NODE: Int | Double = null,
    ELEMENT_NODE: Int | Double = null,
    ENTITY_NODE: Int | Double = null,
    ENTITY_REFERENCE_NODE: Int | Double = null,
    HAVE_CURRENT_DATA: Int | Double = null,
    HAVE_ENOUGH_DATA: Int | Double = null,
    HAVE_FUTURE_DATA: Int | Double = null,
    HAVE_METADATA: Int | Double = null,
    HAVE_NOTHING: Int | Double = null,
    NETWORK_EMPTY: Int | Double = null,
    NETWORK_IDLE: Int | Double = null,
    NETWORK_LOADING: Int | Double = null,
    NETWORK_NO_SOURCE: Int | Double = null,
    NOTATION_NODE: Int | Double = null,
    PROCESSING_INSTRUCTION_NODE: Int | Double = null,
    TEXT_NODE: Int | Double = null,
    accessKey: String = null,
    accessKeyLabel: String = null,
    addEventListener: (encrypted, /* listener */ js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MediaEncryptedEvent, _]) => Unit = null,
    addTextTrack: /* kind */ TextTrackKind => TextTrack = null,
    after: /* repeated */ Node | String => Unit = null,
    animate: /* keyframes */ js.Array[Keyframe] => Animation = null,
    append: /* repeated */ Node | String => Unit = null,
    appendChild: /* newChild */ Node => Node = null,
    assignedSlot: HTMLSlotElement = null,
    attachShadow: /* init */ ShadowRootInit => ShadowRoot = null,
    attributes: NamedNodeMap = null,
    audioTracks: AudioTrackList = null,
    autocapitalize: String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    baseURI: String = null,
    before: /* repeated */ Node | String => Unit = null,
    blur: () => Unit = null,
    buffered: TimeRanges = null,
    canPlayType: /* type */ String => CanPlayTypeResult = null,
    childElementCount: Int | Double = null,
    childNodes: NodeListOf[ChildNode] = null,
    children: HTMLCollection = null,
    classList: DOMTokenList = null,
    className: String = null,
    click: () => Unit = null,
    clientHeight: Int | Double = null,
    clientLeft: Int | Double = null,
    clientTop: Int | Double = null,
    clientWidth: Int | Double = null,
    cloneNode: () => Node = null,
    closest: a => HTMLAnchorElement | Null = null,
    compareDocumentPosition: /* other */ Node => Double = null,
    contains: /* other */ Node => Boolean = null,
    content: Content | js.Array[Content] = null,
    contentEditable: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String = null,
    currentSrc: String = null,
    currentTime: Int | Double = null,
    dataset: DOMStringMap = null,
    defaultMuted: js.UndefOr[Boolean] = js.undefined,
    defaultPlaybackRate: Int | Double = null,
    dir: String = null,
    dispatchEvent: /* event */ Event_ => Boolean = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    ended: js.UndefOr[Boolean] = js.undefined,
    error: MediaError = null,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
    focus: () => Unit = null,
    getAnimations: () => js.Array[Animation] = null,
    getAttribute: /* qualifiedName */ String => String | Null = null,
    getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null = null,
    getAttributeNames: () => js.Array[String] = null,
    getAttributeNode: /* name */ String => Attr | Null = null,
    getAttributeNodeNS: (/* namespaceURI */ String, /* localName */ String) => Attr | Null = null,
    getBoundingClientRect: () => DOMRect = null,
    getClientRects: () => DOMRectList = null,
    getElementsByClassName: /* classNames */ String => HTMLCollectionOf[Element] = null,
    getElementsByTagName: a => HTMLCollectionOf[HTMLAnchorElement] = null,
    getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement] = null,
    getRootNode: () => Node = null,
    hasAttribute: /* qualifiedName */ String => Boolean = null,
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => Boolean = null,
    hasAttributes: () => Boolean = null,
    hasChildNodes: () => Boolean = null,
    hasPointerCapture: /* pointerId */ Double => Boolean = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    innerHTML: String = null,
    innerText: String = null,
    inputMode: String = null,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null = null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Unit = null,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Unit = null,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => Node = null,
    isConnected: js.UndefOr[Boolean] = js.undefined,
    isContentEditable: js.UndefOr[Boolean] = js.undefined,
    isDefaultNamespace: /* namespace */ String => Boolean = null,
    isEqualNode: /* otherNode */ Node => Boolean = null,
    isSameNode: /* otherNode */ Node => Boolean = null,
    key: Key = null,
    lang: String = null,
    lastChild: ChildNode = null,
    lastElementChild: Element = null,
    load: () => Unit = null,
    localName: String = null,
    lookupNamespaceURI: /* prefix */ String => String | Null = null,
    lookupPrefix: /* namespace */ String => String | Null = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    matches: /* selectors */ String => Boolean = null,
    mediaKeys: MediaKeys = null,
    msAudioCategory: String = null,
    msAudioDeviceType: String = null,
    msClearEffects: () => Unit = null,
    msGetAsCastingSource: () => _ = null,
    msGetRegionContent: () => _ = null,
    msGraphicsTrustStatus: MSGraphicsTrust = null,
    msInsertAudioEffect: (/* activatableClassId */ String, /* effectRequired */ Boolean) => Unit = null,
    msKeys: MSMediaKeys = null,
    msPlayToDisabled: js.UndefOr[Boolean] = js.undefined,
    msPlayToPreferredSourceUri: String = null,
    msPlayToPrimary: js.UndefOr[Boolean] = js.undefined,
    msPlayToSource: js.Any = null,
    msRealTime: js.UndefOr[Boolean] = js.undefined,
    msSetMediaKeys: /* mediaKeys */ MSMediaKeys => Unit = null,
    msSetMediaProtectionManager: () => Unit = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    namespaceURI: String = null,
    networkState: Int | Double = null,
    nextElementSibling: Element = null,
    nextSibling: ChildNode = null,
    nodeName: String = null,
    nodeType: Int | Double = null,
    nodeValue: String = null,
    nonce: String = null,
    normalize: () => Unit = null,
    offsetHeight: Int | Double = null,
    offsetLeft: Int | Double = null,
    offsetParent: Element = null,
    offsetTop: Int | Double = null,
    offsetWidth: Int | Double = null,
    onabort: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    oncanplay: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    oncanplaythrough: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onchange: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onclick: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    oncontextmenu: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    oncopy: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    oncut: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    ondragleave: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onemptied: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onencrypted: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MediaEncryptedEvent, _] = null,
    onended: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onerror: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any = null,
    onfocus: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ FocusEvent, _] = null,
    onfullscreenchange: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    ongotpointercapture: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    oninvalid: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onkeydown: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onloadeddata: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onloadedmetadata: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onloadstart: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onlostpointercapture: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MouseEvent, _] = null,
    onmsneedkey: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ MSMediaKeyNeededEvent, _] = null,
    onpaste: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onplay: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onplaying: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onpointercancel: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ ProgressEvent[EventTarget], _] = null,
    onratechange: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onreset: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onresize: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onseeking: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onselect: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onselectionchange: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onselectstart: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onstalled: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onsubmit: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onsuspend: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    ontimeupdate: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    ontoggle: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    ontouchcancel: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ TransitionEvent, _] = null,
    onvolumechange: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onwaiting: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onwaitingforkey: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ Event_, _] = null,
    onwheel: js.ThisFunction1[PropsHTMLAudioElementcont, /* ev */ WheelEvent, _] = null,
    outerHTML: String = null,
    ownerDocument: Document_ = null,
    parentElement: HTMLElement = null,
    parentNode: Node with ParentNode = null,
    pause: () => Unit = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    play: () => js.Promise[Unit] = null,
    playbackRate: Int | Double = null,
    played: TimeRanges = null,
    prefix: String = null
  ): PropsHTMLAudioElementcont = {
    val __obj = js.Dynamic.literal()
    if (ATTRIBUTE_NODE != null) __obj.updateDynamic("ATTRIBUTE_NODE")(ATTRIBUTE_NODE.asInstanceOf[js.Any])
    if (CDATA_SECTION_NODE != null) __obj.updateDynamic("CDATA_SECTION_NODE")(CDATA_SECTION_NODE.asInstanceOf[js.Any])
    if (COMMENT_NODE != null) __obj.updateDynamic("COMMENT_NODE")(COMMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_FRAGMENT_NODE != null) __obj.updateDynamic("DOCUMENT_FRAGMENT_NODE")(DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_NODE != null) __obj.updateDynamic("DOCUMENT_NODE")(DOCUMENT_NODE.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINED_BY != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINED_BY")(DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_CONTAINS != null) __obj.updateDynamic("DOCUMENT_POSITION_CONTAINS")(DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_DISCONNECTED != null) __obj.updateDynamic("DOCUMENT_POSITION_DISCONNECTED")(DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_FOLLOWING != null) __obj.updateDynamic("DOCUMENT_POSITION_FOLLOWING")(DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC != null) __obj.updateDynamic("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")(DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any])
    if (DOCUMENT_POSITION_PRECEDING != null) __obj.updateDynamic("DOCUMENT_POSITION_PRECEDING")(DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any])
    if (DOCUMENT_TYPE_NODE != null) __obj.updateDynamic("DOCUMENT_TYPE_NODE")(DOCUMENT_TYPE_NODE.asInstanceOf[js.Any])
    if (ELEMENT_NODE != null) __obj.updateDynamic("ELEMENT_NODE")(ELEMENT_NODE.asInstanceOf[js.Any])
    if (ENTITY_NODE != null) __obj.updateDynamic("ENTITY_NODE")(ENTITY_NODE.asInstanceOf[js.Any])
    if (ENTITY_REFERENCE_NODE != null) __obj.updateDynamic("ENTITY_REFERENCE_NODE")(ENTITY_REFERENCE_NODE.asInstanceOf[js.Any])
    if (HAVE_CURRENT_DATA != null) __obj.updateDynamic("HAVE_CURRENT_DATA")(HAVE_CURRENT_DATA.asInstanceOf[js.Any])
    if (HAVE_ENOUGH_DATA != null) __obj.updateDynamic("HAVE_ENOUGH_DATA")(HAVE_ENOUGH_DATA.asInstanceOf[js.Any])
    if (HAVE_FUTURE_DATA != null) __obj.updateDynamic("HAVE_FUTURE_DATA")(HAVE_FUTURE_DATA.asInstanceOf[js.Any])
    if (HAVE_METADATA != null) __obj.updateDynamic("HAVE_METADATA")(HAVE_METADATA.asInstanceOf[js.Any])
    if (HAVE_NOTHING != null) __obj.updateDynamic("HAVE_NOTHING")(HAVE_NOTHING.asInstanceOf[js.Any])
    if (NETWORK_EMPTY != null) __obj.updateDynamic("NETWORK_EMPTY")(NETWORK_EMPTY.asInstanceOf[js.Any])
    if (NETWORK_IDLE != null) __obj.updateDynamic("NETWORK_IDLE")(NETWORK_IDLE.asInstanceOf[js.Any])
    if (NETWORK_LOADING != null) __obj.updateDynamic("NETWORK_LOADING")(NETWORK_LOADING.asInstanceOf[js.Any])
    if (NETWORK_NO_SOURCE != null) __obj.updateDynamic("NETWORK_NO_SOURCE")(NETWORK_NO_SOURCE.asInstanceOf[js.Any])
    if (NOTATION_NODE != null) __obj.updateDynamic("NOTATION_NODE")(NOTATION_NODE.asInstanceOf[js.Any])
    if (PROCESSING_INSTRUCTION_NODE != null) __obj.updateDynamic("PROCESSING_INSTRUCTION_NODE")(PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any])
    if (TEXT_NODE != null) __obj.updateDynamic("TEXT_NODE")(TEXT_NODE.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (accessKeyLabel != null) __obj.updateDynamic("accessKeyLabel")(accessKeyLabel.asInstanceOf[js.Any])
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2(addEventListener))
    if (addTextTrack != null) __obj.updateDynamic("addTextTrack")(js.Any.fromFunction1(addTextTrack))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1(animate))
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction1(append))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (attachShadow != null) __obj.updateDynamic("attachShadow")(js.Any.fromFunction1(attachShadow))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (audioTracks != null) __obj.updateDynamic("audioTracks")(audioTracks.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction0(blur))
    if (buffered != null) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (canPlayType != null) __obj.updateDynamic("canPlayType")(js.Any.fromFunction1(canPlayType))
    if (childElementCount != null) __obj.updateDynamic("childElementCount")(childElementCount.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classList != null) __obj.updateDynamic("classList")(classList.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (clientHeight != null) __obj.updateDynamic("clientHeight")(clientHeight.asInstanceOf[js.Any])
    if (clientLeft != null) __obj.updateDynamic("clientLeft")(clientLeft.asInstanceOf[js.Any])
    if (clientTop != null) __obj.updateDynamic("clientTop")(clientTop.asInstanceOf[js.Any])
    if (clientWidth != null) __obj.updateDynamic("clientWidth")(clientWidth.asInstanceOf[js.Any])
    if (cloneNode != null) __obj.updateDynamic("cloneNode")(js.Any.fromFunction0(cloneNode))
    if (closest != null) __obj.updateDynamic("closest")(js.Any.fromFunction1(closest))
    if (compareDocumentPosition != null) __obj.updateDynamic("compareDocumentPosition")(js.Any.fromFunction1(compareDocumentPosition))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (currentSrc != null) __obj.updateDynamic("currentSrc")(currentSrc.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMuted)) __obj.updateDynamic("defaultMuted")(defaultMuted.asInstanceOf[js.Any])
    if (defaultPlaybackRate != null) __obj.updateDynamic("defaultPlaybackRate")(defaultPlaybackRate.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dispatchEvent != null) __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1(dispatchEvent))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(ended)) __obj.updateDynamic("ended")(ended.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction0(focus))
    if (getAnimations != null) __obj.updateDynamic("getAnimations")(js.Any.fromFunction0(getAnimations))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction1(getAttribute))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2(getAttributeNS))
    if (getAttributeNames != null) __obj.updateDynamic("getAttributeNames")(js.Any.fromFunction0(getAttributeNames))
    if (getAttributeNode != null) __obj.updateDynamic("getAttributeNode")(js.Any.fromFunction1(getAttributeNode))
    if (getAttributeNodeNS != null) __obj.updateDynamic("getAttributeNodeNS")(js.Any.fromFunction2(getAttributeNodeNS))
    if (getBoundingClientRect != null) __obj.updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(getBoundingClientRect))
    if (getClientRects != null) __obj.updateDynamic("getClientRects")(js.Any.fromFunction0(getClientRects))
    if (getElementsByClassName != null) __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1(getElementsByClassName))
    if (getElementsByTagName != null) __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1(getElementsByTagName))
    if (getElementsByTagNameNS != null) __obj.updateDynamic("getElementsByTagNameNS")(js.Any.fromFunction2(getElementsByTagNameNS))
    if (getRootNode != null) __obj.updateDynamic("getRootNode")(js.Any.fromFunction0(getRootNode))
    if (hasAttribute != null) __obj.updateDynamic("hasAttribute")(js.Any.fromFunction1(hasAttribute))
    if (hasAttributeNS != null) __obj.updateDynamic("hasAttributeNS")(js.Any.fromFunction2(hasAttributeNS))
    if (hasAttributes != null) __obj.updateDynamic("hasAttributes")(js.Any.fromFunction0(hasAttributes))
    if (hasChildNodes != null) __obj.updateDynamic("hasChildNodes")(js.Any.fromFunction0(hasChildNodes))
    if (hasPointerCapture != null) __obj.updateDynamic("hasPointerCapture")(js.Any.fromFunction1(hasPointerCapture))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (innerText != null) __obj.updateDynamic("innerText")(innerText.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (insertAdjacentElement != null) __obj.updateDynamic("insertAdjacentElement")(js.Any.fromFunction2(insertAdjacentElement))
    if (insertAdjacentHTML != null) __obj.updateDynamic("insertAdjacentHTML")(js.Any.fromFunction2(insertAdjacentHTML))
    if (insertAdjacentText != null) __obj.updateDynamic("insertAdjacentText")(js.Any.fromFunction2(insertAdjacentText))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2(insertBefore))
    if (!js.isUndefined(isConnected)) __obj.updateDynamic("isConnected")(isConnected.asInstanceOf[js.Any])
    if (!js.isUndefined(isContentEditable)) __obj.updateDynamic("isContentEditable")(isContentEditable.asInstanceOf[js.Any])
    if (isDefaultNamespace != null) __obj.updateDynamic("isDefaultNamespace")(js.Any.fromFunction1(isDefaultNamespace))
    if (isEqualNode != null) __obj.updateDynamic("isEqualNode")(js.Any.fromFunction1(isEqualNode))
    if (isSameNode != null) __obj.updateDynamic("isSameNode")(js.Any.fromFunction1(isSameNode))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction0(load))
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (lookupNamespaceURI != null) __obj.updateDynamic("lookupNamespaceURI")(js.Any.fromFunction1(lookupNamespaceURI))
    if (lookupPrefix != null) __obj.updateDynamic("lookupPrefix")(js.Any.fromFunction1(lookupPrefix))
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(js.Any.fromFunction1(matches))
    if (mediaKeys != null) __obj.updateDynamic("mediaKeys")(mediaKeys.asInstanceOf[js.Any])
    if (msAudioCategory != null) __obj.updateDynamic("msAudioCategory")(msAudioCategory.asInstanceOf[js.Any])
    if (msAudioDeviceType != null) __obj.updateDynamic("msAudioDeviceType")(msAudioDeviceType.asInstanceOf[js.Any])
    if (msClearEffects != null) __obj.updateDynamic("msClearEffects")(js.Any.fromFunction0(msClearEffects))
    if (msGetAsCastingSource != null) __obj.updateDynamic("msGetAsCastingSource")(js.Any.fromFunction0(msGetAsCastingSource))
    if (msGetRegionContent != null) __obj.updateDynamic("msGetRegionContent")(js.Any.fromFunction0(msGetRegionContent))
    if (msGraphicsTrustStatus != null) __obj.updateDynamic("msGraphicsTrustStatus")(msGraphicsTrustStatus.asInstanceOf[js.Any])
    if (msInsertAudioEffect != null) __obj.updateDynamic("msInsertAudioEffect")(js.Any.fromFunction2(msInsertAudioEffect))
    if (msKeys != null) __obj.updateDynamic("msKeys")(msKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(msPlayToDisabled)) __obj.updateDynamic("msPlayToDisabled")(msPlayToDisabled.asInstanceOf[js.Any])
    if (msPlayToPreferredSourceUri != null) __obj.updateDynamic("msPlayToPreferredSourceUri")(msPlayToPreferredSourceUri.asInstanceOf[js.Any])
    if (!js.isUndefined(msPlayToPrimary)) __obj.updateDynamic("msPlayToPrimary")(msPlayToPrimary.asInstanceOf[js.Any])
    if (msPlayToSource != null) __obj.updateDynamic("msPlayToSource")(msPlayToSource.asInstanceOf[js.Any])
    if (!js.isUndefined(msRealTime)) __obj.updateDynamic("msRealTime")(msRealTime.asInstanceOf[js.Any])
    if (msSetMediaKeys != null) __obj.updateDynamic("msSetMediaKeys")(js.Any.fromFunction1(msSetMediaKeys))
    if (msSetMediaProtectionManager != null) __obj.updateDynamic("msSetMediaProtectionManager")(js.Any.fromFunction0(msSetMediaProtectionManager))
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (networkState != null) __obj.updateDynamic("networkState")(networkState.asInstanceOf[js.Any])
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction0(normalize))
    if (offsetHeight != null) __obj.updateDynamic("offsetHeight")(offsetHeight.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (offsetWidth != null) __obj.updateDynamic("offsetWidth")(offsetWidth.asInstanceOf[js.Any])
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onanimationcancel != null) __obj.updateDynamic("onanimationcancel")(onanimationcancel.asInstanceOf[js.Any])
    if (onanimationend != null) __obj.updateDynamic("onanimationend")(onanimationend.asInstanceOf[js.Any])
    if (onanimationiteration != null) __obj.updateDynamic("onanimationiteration")(onanimationiteration.asInstanceOf[js.Any])
    if (onanimationstart != null) __obj.updateDynamic("onanimationstart")(onanimationstart.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncancel != null) __obj.updateDynamic("oncancel")(oncancel.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncopy != null) __obj.updateDynamic("oncopy")(oncopy.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
    if (oncut != null) __obj.updateDynamic("oncut")(oncut.asInstanceOf[js.Any])
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick.asInstanceOf[js.Any])
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag.asInstanceOf[js.Any])
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend.asInstanceOf[js.Any])
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter.asInstanceOf[js.Any])
    if (ondragexit != null) __obj.updateDynamic("ondragexit")(ondragexit.asInstanceOf[js.Any])
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave.asInstanceOf[js.Any])
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover.asInstanceOf[js.Any])
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart.asInstanceOf[js.Any])
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop.asInstanceOf[js.Any])
    if (ondurationchange != null) __obj.updateDynamic("ondurationchange")(ondurationchange.asInstanceOf[js.Any])
    if (onemptied != null) __obj.updateDynamic("onemptied")(onemptied.asInstanceOf[js.Any])
    if (onencrypted != null) __obj.updateDynamic("onencrypted")(onencrypted.asInstanceOf[js.Any])
    if (onended != null) __obj.updateDynamic("onended")(onended.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction5(onerror))
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (onfullscreenchange != null) __obj.updateDynamic("onfullscreenchange")(onfullscreenchange.asInstanceOf[js.Any])
    if (onfullscreenerror != null) __obj.updateDynamic("onfullscreenerror")(onfullscreenerror.asInstanceOf[js.Any])
    if (ongotpointercapture != null) __obj.updateDynamic("ongotpointercapture")(ongotpointercapture.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onlostpointercapture != null) __obj.updateDynamic("onlostpointercapture")(onlostpointercapture.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
    if (onmsneedkey != null) __obj.updateDynamic("onmsneedkey")(onmsneedkey.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onpause != null) __obj.updateDynamic("onpause")(onpause.asInstanceOf[js.Any])
    if (onplay != null) __obj.updateDynamic("onplay")(onplay.asInstanceOf[js.Any])
    if (onplaying != null) __obj.updateDynamic("onplaying")(onplaying.asInstanceOf[js.Any])
    if (onpointercancel != null) __obj.updateDynamic("onpointercancel")(onpointercancel.asInstanceOf[js.Any])
    if (onpointerdown != null) __obj.updateDynamic("onpointerdown")(onpointerdown.asInstanceOf[js.Any])
    if (onpointerenter != null) __obj.updateDynamic("onpointerenter")(onpointerenter.asInstanceOf[js.Any])
    if (onpointerleave != null) __obj.updateDynamic("onpointerleave")(onpointerleave.asInstanceOf[js.Any])
    if (onpointermove != null) __obj.updateDynamic("onpointermove")(onpointermove.asInstanceOf[js.Any])
    if (onpointerout != null) __obj.updateDynamic("onpointerout")(onpointerout.asInstanceOf[js.Any])
    if (onpointerover != null) __obj.updateDynamic("onpointerover")(onpointerover.asInstanceOf[js.Any])
    if (onpointerup != null) __obj.updateDynamic("onpointerup")(onpointerup.asInstanceOf[js.Any])
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    if (onratechange != null) __obj.updateDynamic("onratechange")(onratechange.asInstanceOf[js.Any])
    if (onreset != null) __obj.updateDynamic("onreset")(onreset.asInstanceOf[js.Any])
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onsecuritypolicyviolation != null) __obj.updateDynamic("onsecuritypolicyviolation")(onsecuritypolicyviolation.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectionchange != null) __obj.updateDynamic("onselectionchange")(onselectionchange.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (ontoggle != null) __obj.updateDynamic("ontoggle")(ontoggle.asInstanceOf[js.Any])
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(ontouchcancel.asInstanceOf[js.Any])
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(ontouchend.asInstanceOf[js.Any])
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(ontouchmove.asInstanceOf[js.Any])
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(ontouchstart.asInstanceOf[js.Any])
    if (ontransitioncancel != null) __obj.updateDynamic("ontransitioncancel")(ontransitioncancel.asInstanceOf[js.Any])
    if (ontransitionend != null) __obj.updateDynamic("ontransitionend")(ontransitionend.asInstanceOf[js.Any])
    if (ontransitionrun != null) __obj.updateDynamic("ontransitionrun")(ontransitionrun.asInstanceOf[js.Any])
    if (ontransitionstart != null) __obj.updateDynamic("ontransitionstart")(ontransitionstart.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    if (onwaitingforkey != null) __obj.updateDynamic("onwaitingforkey")(onwaitingforkey.asInstanceOf[js.Any])
    if (onwheel != null) __obj.updateDynamic("onwheel")(onwheel.asInstanceOf[js.Any])
    if (outerHTML != null) __obj.updateDynamic("outerHTML")(outerHTML.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction0(pause))
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (play != null) __obj.updateDynamic("play")(js.Any.fromFunction0(play))
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (played != null) __obj.updateDynamic("played")(played.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsHTMLAudioElementcont]
  }
}

