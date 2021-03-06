package typings.couchbase.mod.SearchQuery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighlightStyle extends js.Object

/**
  * Enumeration for specifying FTS highlight styling.
  */
@JSImport("couchbase", "SearchQuery.HighlightStyle")
@js.native
object HighlightStyle extends js.Object {
  /**
    * This causes hits to be highlighted with ANSI character codes.
    */
  @js.native
  sealed trait ANSI extends HighlightStyle
  
  /**
    * This causes hits to be highlighted using the default style.
    */
  @js.native
  sealed trait DEFAULT extends HighlightStyle
  
  /**
    * This causes hits to be highlighted using HTML tags.
    */
  @js.native
  sealed trait HTML extends HighlightStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HighlightStyle with Double] = js.native
  /* 2 */ @js.native
  object ANSI extends TopLevel[ANSI with Double]
  
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 1 */ @js.native
  object HTML extends TopLevel[HTML with Double]
  
}

