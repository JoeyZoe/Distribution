package typings.cesium.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "JulianDate")
@js.native
class JulianDate () extends js.Object {
  def this(julianDayNumber: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double) = this()
  def this(julianDayNumber: Double, secondsOfDay: Double, timeStandard: TimeStandard) = this()
  var dayNumber: Double = js.native
  var secondsOfDay: Double = js.native
  def clone(result: JulianDate): JulianDate = js.native
  def equals(): Boolean = js.native
  def equals(right: JulianDate): Boolean = js.native
  def equalsEpsilon(right: JulianDate, epsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "JulianDate")
@js.native
object JulianDate extends js.Object {
  var leapSeconds: js.Array[LeapSecond] = js.native
  def addDays(julianDate: JulianDate, days: Double, result: JulianDate): JulianDate = js.native
  def addHours(julianDate: JulianDate, hours: Double, result: JulianDate): JulianDate = js.native
  def addMinutes(julianDate: JulianDate, minutes: Double, result: JulianDate): JulianDate = js.native
  def addSeconds(julianDate: JulianDate, seconds: Double, result: JulianDate): JulianDate = js.native
  def clone(julianDate: JulianDate): JulianDate = js.native
  def clone(julianDate: JulianDate, result: JulianDate): JulianDate = js.native
  def compare(left: JulianDate, right: JulianDate): Double = js.native
  def computeTaiMinusUtc(julianDate: JulianDate): Double = js.native
  def daysDifference(left: JulianDate, right: JulianDate): Double = js.native
  def equals(): Boolean = js.native
  def equals(left: JulianDate): Boolean = js.native
  def equals(left: JulianDate, right: JulianDate): Boolean = js.native
  def equalsEpsilon(left: JulianDate, right: JulianDate, epsilon: Double): Boolean = js.native
  def fromDate(date: Date): JulianDate = js.native
  def fromDate(date: Date, result: JulianDate): JulianDate = js.native
  def fromIso8601(iso8601String: String): JulianDate = js.native
  def fromIso8601(iso8601String: String, result: JulianDate): JulianDate = js.native
  def greaterThan(left: JulianDate, right: JulianDate): Boolean = js.native
  def greaterThanOrEquals(left: JulianDate, right: JulianDate): Boolean = js.native
  def lessThan(left: JulianDate, right: JulianDate): Boolean = js.native
  def lessThanOrEquals(left: JulianDate, right: JulianDate): Boolean = js.native
  def now(): JulianDate = js.native
  def now(result: JulianDate): JulianDate = js.native
  def secondsDifference(left: JulianDate, right: JulianDate): Double = js.native
  def toDate(julianDate: JulianDate): Date = js.native
  def toGregorianDate(julianDate: JulianDate): GregorianDate = js.native
  def toGregorianDate(julianDate: JulianDate, result: GregorianDate): GregorianDate = js.native
  def toIso8601(julianDate: JulianDate): String = js.native
  def toIso8601(julianDate: JulianDate, precision: Double): String = js.native
  def totalDays(julianDate: JulianDate): Double = js.native
}

