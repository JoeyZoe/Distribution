package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/VectorTileRenderType", JSImport.Namespace)
@js.native
object vectorTileRenderTypeMod extends js.Object {
  @js.native
  sealed trait VectorTileRenderType extends js.Object
  
  @js.native
  object VectorTileRenderType extends js.Object {
    @js.native
    sealed trait HYBRID extends VectorTileRenderType
    
    @js.native
    sealed trait IMAGE extends VectorTileRenderType
    
    @js.native
    sealed trait VECTOR extends VectorTileRenderType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "hybrid" */ val HYBRID: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.HYBRID with String = js.native
    /* "image" */ val IMAGE: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.IMAGE with String = js.native
    /* "vector" */ val VECTOR: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.VECTOR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorTileRenderType with String] = js.native
  }
  
}

