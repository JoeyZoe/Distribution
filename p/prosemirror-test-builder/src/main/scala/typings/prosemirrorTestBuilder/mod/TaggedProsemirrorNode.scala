package typings.prosemirrorTestBuilder.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedProsemirrorNode[S /* <: Schema[_, _] */]
  extends Node[js.Any]
     with TaggedFlatObject[S]

