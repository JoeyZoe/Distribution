package typings.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.AnonDirectory
import typings.pacote.AnonEmail
import typings.pacote.pacoteBooleans.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest_
  extends CommonMetadata
     with // Non-standard properties from package.json may also appear.
/* key */ StringDictionary[js.Any] {
  var _id: js.UndefOr[String] = js.undefined
  var _nodeVersion: js.UndefOr[String] = js.undefined
  var _npmUser: js.UndefOr[Person] = js.undefined
  var _npmVersion: js.UndefOr[String] = js.undefined
  var bin: js.UndefOr[Record[String, String]] = js.undefined
  // These properties usually only appear when fullMetadata = true.
  var browser: js.UndefOr[String] = js.undefined
  var bundledDependencies: js.UndefOr[`false` | js.Array[String]] = js.undefined
  var config: js.UndefOr[Record[String, _]] = js.undefined
  var cpu: js.UndefOr[js.Array[String]] = js.undefined
  // These properties usually appear in all requests.
  var dependencies: js.UndefOr[Record[String, String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var directories: js.UndefOr[Record[String, String]] = js.undefined
  var dist: PackageDist
  var engines: js.UndefOr[Record[String, String]] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var main: js.UndefOr[String] = js.undefined
  var man: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: String
  var optionalDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var os: js.UndefOr[js.Array[String]] = js.undefined
  var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
  var publishConfig: js.UndefOr[Record[String, _]] = js.undefined
  var scripts: js.UndefOr[Record[String, String]] = js.undefined
  var version: String
}

object Manifest_ {
  @scala.inline
  def apply(
    dist: PackageDist,
    name: String,
    version: String,
    StringDictionary: // Non-standard properties from package.json may also appear.
  /* key */ StringDictionary[js.Any] = null,
    _id: String = null,
    _nodeVersion: String = null,
    _npmUser: Person = null,
    _npmVersion: String = null,
    author: Person = null,
    bin: Record[String, String] = null,
    browser: String = null,
    bugs: AnonEmail = null,
    bundledDependencies: `false` | js.Array[String] = null,
    config: Record[String, _] = null,
    contributors: js.Array[Person] = null,
    cpu: js.Array[String] = null,
    dependencies: Record[String, String] = null,
    description: String = null,
    devDependencies: Record[String, String] = null,
    directories: Record[String, String] = null,
    engines: Record[String, String] = null,
    files: js.Array[String] = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    main: String = null,
    maintainers: js.Array[Person] = null,
    man: String | js.Array[String] = null,
    optionalDependencies: Record[String, String] = null,
    os: js.Array[String] = null,
    peerDependencies: Record[String, String] = null,
    publishConfig: Record[String, _] = null,
    readme: String = null,
    readmeFilename: String = null,
    repository: AnonDirectory = null,
    scripts: Record[String, String] = null,
    users: Record[String, Boolean] = null
  ): Manifest_ = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_nodeVersion != null) __obj.updateDynamic("_nodeVersion")(_nodeVersion.asInstanceOf[js.Any])
    if (_npmUser != null) __obj.updateDynamic("_npmUser")(_npmUser.asInstanceOf[js.Any])
    if (_npmVersion != null) __obj.updateDynamic("_npmVersion")(_npmVersion.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundledDependencies != null) __obj.updateDynamic("bundledDependencies")(bundledDependencies.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (man != null) __obj.updateDynamic("man")(man.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies.asInstanceOf[js.Any])
    if (publishConfig != null) __obj.updateDynamic("publishConfig")(publishConfig.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (readmeFilename != null) __obj.updateDynamic("readmeFilename")(readmeFilename.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest_]
  }
}

