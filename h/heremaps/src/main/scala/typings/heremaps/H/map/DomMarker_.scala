package typings.heremaps.H.map

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.MultiPoint
import typings.heremaps.H.map.DomMarker.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A marker with a visual representation in the form of a full styleable and scripteable DOM element. DomMarker are predestinated if small amounts of markers with dynamic styled and/or
  * scripted icons should be displayed om the map (e.g. animated interactive SVG).
  */
@JSGlobal("H.map.DomMarker")
@js.native
class DomMarker_ protected () extends AbstractMarker {
  /**
    * Constructor
    * @param position {H.geo.IPoint | H.geo.MultiPoint}
    * @param opt_options {H.map.DomMarker.Options=}
    */
  def this(position: IPoint) = this()
  def this(position: MultiPoint) = this()
  def this(position: IPoint, opt_options: Options) = this()
  def this(position: MultiPoint, opt_options: Options) = this()
}

