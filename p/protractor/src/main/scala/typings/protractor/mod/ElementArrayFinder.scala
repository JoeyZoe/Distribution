package typings.protractor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementArrayFinder")
@js.native
class ElementArrayFinder protected ()
  extends typings.protractor.elementMod.ElementArrayFinder {
  def this(browser_ : typings.protractor.browserMod.ProtractorBrowser) = this()
  def this(
    browser_ : typings.protractor.browserMod.ProtractorBrowser,
    getWebElements: js.Function0[js.Promise[js.Array[typings.seleniumWebdriver.mod.WebElement]]]
  ) = this()
  def this(
    browser_ : typings.protractor.browserMod.ProtractorBrowser,
    getWebElements: js.Function0[js.Promise[js.Array[typings.seleniumWebdriver.mod.WebElement]]],
    locator_ : js.Any
  ) = this()
  def this(
    browser_ : typings.protractor.browserMod.ProtractorBrowser,
    getWebElements: js.Function0[js.Promise[js.Array[typings.seleniumWebdriver.mod.WebElement]]],
    locator_ : js.Any,
    actionResults_ : js.Promise[_]
  ) = this()
}

