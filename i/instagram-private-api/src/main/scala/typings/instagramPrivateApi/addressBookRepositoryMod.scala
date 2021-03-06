package typings.instagramPrivateApi

import typings.instagramPrivateApi.addressBookRepositoryLinkResponseMod.AddressBookRepositoryLinkResponseRootObject
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/address-book.repository", JSImport.Namespace)
@js.native
object addressBookRepositoryMod extends js.Object {
  @js.native
  class AddressBookRepository () extends Repository {
    def acquireOwnerContacts(me: AnonFirstname): js.Promise[StatusResponse] = js.native
    def link(contacts: js.Array[AnonEmailaddresses]): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
    def link(contacts: js.Array[AnonEmailaddresses], module: IgAppModule): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
  }
  
}

