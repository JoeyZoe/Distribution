package typings.rtpParser

import typings.rtpParser.rtpParserNumbers.`1`
import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.DVI4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon15 extends js.Object {
  var channels: `1`
  var clockRate: `8000`
  var mediaType: A
  var name: DVI4
}

object Anon15 {
  @scala.inline
  def apply(channels: `1`, clockRate: `8000`, mediaType: A, name: DVI4): Anon15 = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon15]
  }
}

