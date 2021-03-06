package typings.grunt.grunt

import typings.grunt.grunt.config.ConfigModule
import typings.grunt.grunt.config.IProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Grunt module mixins.
  */
@js.native
trait IConfigComponents extends ConfigModule {
  /**
    * An alias
    * @see grunt.config.ConfigModule.init
    */
  def initConfig(config: IProjectConfig): Unit = js.native
}

