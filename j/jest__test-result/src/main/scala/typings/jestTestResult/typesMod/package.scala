package typings.jestTestResult

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Bytes = scala.Double
  type CodeCoverageFormatter = js.Function2[
    /* coverage */ js.UndefOr[typings.istanbulLibCoverage.mod.CoverageMapData | scala.Null], 
    /* reporter */ typings.jestTestResult.typesMod.CodeCoverageReporter, 
    js.UndefOr[(typings.std.Record[java.lang.String, js.Any]) | scala.Null]
  ]
  type CodeCoverageReporter = js.Any
  type Milliseconds = scala.Double
}
