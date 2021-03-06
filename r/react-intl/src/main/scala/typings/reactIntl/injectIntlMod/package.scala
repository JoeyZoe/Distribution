package typings.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object injectIntlMod {
  type WithIntlProps[P] = (typings.reactIntl.typesMod.Omit[P, java.lang.String]) with typings.reactIntl.AnonForwardedRef
  type WrappedComponentProps[IntlPropName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/lib/types.IntlShape}
    */ typings.reactIntl.reactIntlStrings.WrappedComponentProps with js.Any
}
