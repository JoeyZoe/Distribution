package typings.nivoPie

import typings.nivoCore.mod.Dimensions
import typings.nivoPie.mod.PieCanvasProps
import typings.nivoPie.mod.PieSvgProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoPieComponents extends nivoPieProps {
  @scala.inline
  def Pie: ComponentType[PieSvgProps with Dimensions] = js.constructorOf[typings.nivoPie.mod.Pie].asInstanceOf[typings.react.mod.ComponentType[typings.nivoPie.mod.PieSvgProps with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def PieCanvas: ComponentType[PieCanvasProps with Dimensions] = js.constructorOf[typings.nivoPie.mod.PieCanvas].asInstanceOf[typings.react.mod.ComponentType[typings.nivoPie.mod.PieCanvasProps with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def ResponsivePie: ComponentType[ResponsivePieProps] = js.constructorOf[typings.nivoPie.mod.ResponsivePie].asInstanceOf[typings.react.mod.ComponentType[ResponsivePieProps]]
  @scala.inline
  def ResponsivePieCanvas: ComponentType[ResponsivePieCanvasProps] = js.constructorOf[typings.nivoPie.mod.ResponsivePieCanvas].asInstanceOf[typings.react.mod.ComponentType[ResponsivePieCanvasProps]]
}

