package typings.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "setdiff1dAsync")
@js.native
object setdiff1dAsync
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* y */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        js.Promise[
          js.Tuple2[
            Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
            Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
          ]
        ]
      ]
    ]

