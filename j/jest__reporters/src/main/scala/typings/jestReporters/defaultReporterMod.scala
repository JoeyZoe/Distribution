package typings.jestReporters

import typings.jestReporters.baseReporterMod.BaseReporter
import typings.jestReporters.typesMod.Context
import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestReporters.typesMod.Test
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/default_reporter", JSImport.Namespace)
@js.native
object defaultReporterMod extends js.Object {
  @js.native
  trait DefaultReporter extends BaseReporter {
    var _bufferedOutput: js.Any = js.native
    var _clear: js.Any = js.native
    var _clearStatus: js.Any = js.native
    var _err: js.Any = js.native
    var _globalConfig: GlobalConfig = js.native
    var _out: js.Any = js.native
    var _printStatus: js.Any = js.native
    var _status: js.Any = js.native
    var _wrapStdio: js.Any = js.native
    def forceFlushBufferedOutput(): Unit = js.native
    def printTestFileFailureMessage(_testPath: Path, _config: ProjectConfig, result: TestResult): Unit = js.native
    def printTestFileHeader(_testPath: Path, config: ProjectConfig, result: TestResult): Unit = js.native
    def testFinished(config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
  }
  
  @js.native
  class default protected () extends DefaultReporter {
    def this(globalConfig: GlobalConfig) = this()
    /* CompleteClass */
    override def getLastError(): Error | Unit = js.native
    /* CompleteClass */
    override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
  }
  
}

