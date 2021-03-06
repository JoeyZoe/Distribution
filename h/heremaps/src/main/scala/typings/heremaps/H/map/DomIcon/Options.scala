package typings.heremaps.H.map.DomIcon

import typings.heremaps.H.map.DomMarker
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a DomIcon
  * @property onAttach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked before a clone of the icon's element is appended and displayed on the map.
  * This callback can be used to setup the clone.
  * @property onDetach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked after a clone of the icon's element is removed from the map.
  * This callback can be used to clean up the clone.
  */
trait Options extends js.Object {
  var onAttach: js.UndefOr[
    js.Function3[
      /* el */ Element, 
      /* icon */ typings.heremaps.H.map.DomIcon, 
      /* marker */ DomMarker, 
      Unit
    ]
  ] = js.undefined
  var onDetach: js.UndefOr[
    js.Function3[
      /* el */ Element, 
      /* icon */ typings.heremaps.H.map.DomIcon, 
      /* marker */ DomMarker, 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onAttach: (/* el */ Element, /* icon */ typings.heremaps.H.map.DomIcon, /* marker */ DomMarker) => Unit = null,
    onDetach: (/* el */ Element, /* icon */ typings.heremaps.H.map.DomIcon, /* marker */ DomMarker) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction3(onAttach))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction3(onDetach))
    __obj.asInstanceOf[Options]
  }
}

