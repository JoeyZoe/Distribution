package typings.apolloEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type Body = typings.apolloEnv.fetchFetchMod.Body
  type BodyInit = typings.nodeFetch.mod.BodyInit
  type Headers = typings.apolloEnv.fetchFetchMod.Headers
  type HeadersInit = typings.nodeFetch.mod.HeadersInit
  type ReferrerPolicy = typings.apolloEnv.fetchFetchMod.ReferrerPolicy
  type Request = typings.apolloEnv.fetchFetchMod.Request
  type RequestAgent = typings.apolloEnv.fetchFetchMod.RequestAgent
  type RequestCache = typings.nodeFetch.mod.RequestCache
  type RequestCredentials = typings.nodeFetch.mod.RequestCredentials
  type RequestInfo = typings.nodeFetch.mod.RequestInfo
  type RequestInit = typings.nodeFetch.mod.RequestInit
  type RequestMode = typings.nodeFetch.mod.RequestMode
  type RequestRedirect = typings.nodeFetch.mod.RequestRedirect
  type Response = typings.apolloEnv.fetchFetchMod.Response
  type ResponseInit = typings.nodeFetch.mod.ResponseInit
  type URLSearchParams = typings.apolloEnv.urlMod.URLSearchParams
  type URLSearchParamsInit = typings.apolloEnv.urlMod.URLSearchParamsInit
}

