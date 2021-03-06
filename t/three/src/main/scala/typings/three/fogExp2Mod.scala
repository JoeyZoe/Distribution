package typings.three

import typings.three.colorMod.Color
import typings.three.fogMod.IFog
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/FogExp2", JSImport.Namespace)
@js.native
object fogExp2Mod extends js.Object {
  @js.native
  class FogExp2 protected () extends IFog {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: String, density: Double) = this()
    def this(hex: Double, density: Double) = this()
    /* CompleteClass */
    override var color: Color = js.native
    /**
    	 * Defines how fast the fog will grow dense.
    	 * Default is 0.00025.
    	 */
    var density: Double = js.native
    val isFogExp2: `true` = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
}

