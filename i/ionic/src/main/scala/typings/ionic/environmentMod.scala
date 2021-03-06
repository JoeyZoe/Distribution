package typings.ionic

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.InfoItem
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptValueOther
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/environment", JSImport.Namespace)
@js.native
object environmentMod extends js.Object {
  @js.native
  class Environment protected () extends IonicEnvironment {
    def this(hasClientConfigFlagsGetInfoLogCtxPromptSessionShell: EnvironmentDeps) = this()
  }
  
  @js.native
  trait EnvironmentDeps extends js.Object {
    val client: IClient = js.native
    val config: IConfig = js.native
    val ctx: IonicContext = js.native
    val flags: IonicEnvironmentFlags = js.native
    val log: ILogger = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    val session: ISession = js.native
    val shell: IShell = js.native
    def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
  }
  
}

