package typings.jestReporters

import typings.jestTestResult.typesMod.AssertionResult
import typings.jestTestResult.typesMod.Suite
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/verbose_reporter", JSImport.Namespace)
@js.native
object verboseReporterMod extends js.Object {
  @js.native
  trait VerboseReporter
    extends typings.jestReporters.defaultReporterMod.default {
    var _getIcon: js.Any = js.native
    var _logLine: js.Any = js.native
    var _logSuite: js.Any = js.native
    var _logTest: js.Any = js.native
    var _logTestResults: js.Any = js.native
    var _logTests: js.Any = js.native
    var _logTodoOrPendingTest: js.Any = js.native
  }
  
  @js.native
  class default protected () extends VerboseReporter {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = js.native
    def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = js.native
  }
  
}

