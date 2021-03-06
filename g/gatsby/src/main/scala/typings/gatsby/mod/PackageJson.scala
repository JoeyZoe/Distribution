package typings.gatsby.mod

import typings.gatsby.AnonEmail
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJson extends js.Object {
  var author: js.UndefOr[String | AnonEmail] = js.undefined
  var bundledDependencies: js.UndefOr[js.Array[String]] = js.undefined
  var dependencies: js.UndefOr[Record[String, String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var license: js.UndefOr[String] = js.undefined
  var main: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var optionalDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object PackageJson {
  @scala.inline
  def apply(
    author: String | AnonEmail = null,
    bundledDependencies: js.Array[String] = null,
    dependencies: Record[String, String] = null,
    description: String = null,
    devDependencies: Record[String, String] = null,
    keywords: js.Array[String] = null,
    license: String = null,
    main: String = null,
    name: String = null,
    optionalDependencies: Record[String, String] = null,
    peerDependencies: Record[String, String] = null,
    version: String = null
  ): PackageJson = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bundledDependencies != null) __obj.updateDynamic("bundledDependencies")(bundledDependencies.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson]
  }
}

