package typings.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geocoder_ extends js.Object {
  def getURL(): String
  /**
  			 * Queries the geocoder with a query string, and returns its result, if any.
  			 */
  def query(queryString: String, callback: js.Function): js.Any
  def queryURL(url: String): String
  /**
  			 * Queries the geocoder with a location, and returns its result, if any.
  			 */
  def reverseQuery(location: js.Any, callback: js.Function): js.Any
  def setID(id: String): js.Any
  def setTileJSON(tilejson: js.Any): js.Any
  def setURL(url: String): js.Any
}

object Geocoder_ {
  @scala.inline
  def apply(
    getURL: () => String,
    query: (String, js.Function) => js.Any,
    queryURL: String => String,
    reverseQuery: (js.Any, js.Function) => js.Any,
    setID: String => js.Any,
    setTileJSON: js.Any => js.Any,
    setURL: String => js.Any
  ): Geocoder_ = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction0(getURL), query = js.Any.fromFunction2(query), queryURL = js.Any.fromFunction1(queryURL), reverseQuery = js.Any.fromFunction2(reverseQuery), setID = js.Any.fromFunction1(setID), setTileJSON = js.Any.fromFunction1(setTileJSON), setURL = js.Any.fromFunction1(setURL))
  
    __obj.asInstanceOf[Geocoder_]
  }
}

