package typings.pluralsCldr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plurals-cldr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  @JSName("ordinal")
  var ordinal_Original: Plural = js.native
  def apply(locale: String, number: String): Form | Null = js.native
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    * 	trailing zeroes.
    */
  def apply(locale: String, number: Double): Form | Null = js.native
  /**
    * Returns an array of available forms for the given locale. If the
    * locale is not supported, returns `null`.
    *
    * @param locale The locale code.
    */
  def forms(locale: String): js.Array[Form] | Null = js.native
  def indexOf(locale: String, number: String): Double = js.native
  /**
    * Returns the index of the form for a given number. If the locale is
    * not supported, returns `-1`.
    *
    * This is convenient for implementing a lookup from a compact, ordered
    * list. The order of forms for all locales is `zero`, `one`, `two`,
    * `few`, `many`, `other`. Remove the forms not used by a locale to get
    * the indices of each.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    * 	trailing zeroes.
    */
  def indexOf(locale: String, number: Double): Double = js.native
  def ordinal(locale: String, number: String): Form | Null = js.native
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    * 	trailing zeroes.
    */
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  def ordinal(locale: String, number: Double): Form | Null = js.native
}

