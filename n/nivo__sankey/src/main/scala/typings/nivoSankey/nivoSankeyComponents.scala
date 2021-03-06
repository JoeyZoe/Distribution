package typings.nivoSankey

import typings.nivoSankey.mod.Data
import typings.nivoSankey.mod.Dimensions
import typings.nivoSankey.mod.SankeyProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoSankeyComponents extends nivoSankeyProps {
  @scala.inline
  def ResponsiveSankey: ComponentType[Data with SankeyProps] = js.constructorOf[typings.nivoSankey.mod.ResponsiveSankey].asInstanceOf[typings.react.mod.ComponentType[typings.nivoSankey.mod.Data with typings.nivoSankey.mod.SankeyProps]]
  @scala.inline
  def Sankey: ComponentType[Data with SankeyProps with Dimensions] = js.constructorOf[typings.nivoSankey.mod.Sankey].asInstanceOf[typings.react.mod.ComponentType[
  typings.nivoSankey.mod.Data with typings.nivoSankey.mod.SankeyProps with typings.nivoSankey.mod.Dimensions]]
}

