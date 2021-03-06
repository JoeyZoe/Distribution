package typings.jsNacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nacl extends js.Object {
  def crypto_box(msg: Message, nonce: Nonce, rcpt: BoxPublicKey, sender: BoxSecretKey): CipherText
  // crypto_box
  def crypto_box_keypair(): BoxKeyPair
  def crypto_box_keypair_from_raw_sk(seed: Uint8Array): BoxKeyPair
  def crypto_box_open(cipher: CipherText, nonce: Nonce, sender: BoxPublicKey, rcpt: BoxSecretKey): Message
  def crypto_box_open_precomputed(cipher: CipherText, nonce: Nonce, shared: BoxSharedSecret): Message
  def crypto_box_precompute(sender: BoxPublicKey, rcpt: BoxSecretKey): BoxSharedSecret
  def crypto_box_precomputed(msg: Message, nonce: Nonce, shared: BoxSharedSecret): CipherText
  def crypto_box_random_nonce(): Nonce
  def crypto_box_seed_keypair(seed: Uint8Array): BoxKeyPair
  // hash
  def crypto_hash(raw: Uint8Array): Uint8Array
  def crypto_hash_sha256(raw: Uint8Array): Uint8Array
  def crypto_secretbox(msg: Message, nonce: Nonce, key: BoxSecretKey): CipherText
  def crypto_secretbox_open(cipher: CipherText, nonce: Nonce, key: BoxSecretKey): Message
  // crypto_secretbox
  def crypto_secretbox_random_nonce(): Nonce
  def crypto_sign(msg: Message, sk: SignerSecretKey): MessageWithSignature
  def crypto_sign_detached(msg: Message, sk: SignerSecretKey): Signature
  // crypto_sign
  def crypto_sign_keypair(): SignKeyPair
  def crypto_sign_open(packet: MessageWithSignature, pk: SignerPublicKey): Message | Null
  // derived keys
  def crypto_sign_seed_keypair(seed: Uint8Array): SignKeyPair
  def crypto_sign_verify_detached(sig: Signature, msg: Message, pk: SignerPublicKey): Boolean
  def decode_latin1(arr: Uint8Array): String
  def decode_utf8(arr: Uint8Array): String
  def encode_latin1(latin1: String): Uint8Array
  def encode_utf8(utf8: String): Uint8Array
  def from_hex(hex: String): Uint8Array
  // random
  def random_bytes(length: Double): Uint8Array
  // strings vs. binary
  def to_hex(arr: Uint8Array): String
}

object Nacl {
  @scala.inline
  def apply(
    crypto_box: (Message, Nonce, BoxPublicKey, BoxSecretKey) => CipherText,
    crypto_box_keypair: () => BoxKeyPair,
    crypto_box_keypair_from_raw_sk: Uint8Array => BoxKeyPair,
    crypto_box_open: (CipherText, Nonce, BoxPublicKey, BoxSecretKey) => Message,
    crypto_box_open_precomputed: (CipherText, Nonce, BoxSharedSecret) => Message,
    crypto_box_precompute: (BoxPublicKey, BoxSecretKey) => BoxSharedSecret,
    crypto_box_precomputed: (Message, Nonce, BoxSharedSecret) => CipherText,
    crypto_box_random_nonce: () => Nonce,
    crypto_box_seed_keypair: Uint8Array => BoxKeyPair,
    crypto_hash: Uint8Array => Uint8Array,
    crypto_hash_sha256: Uint8Array => Uint8Array,
    crypto_secretbox: (Message, Nonce, BoxSecretKey) => CipherText,
    crypto_secretbox_open: (CipherText, Nonce, BoxSecretKey) => Message,
    crypto_secretbox_random_nonce: () => Nonce,
    crypto_sign: (Message, SignerSecretKey) => MessageWithSignature,
    crypto_sign_detached: (Message, SignerSecretKey) => Signature,
    crypto_sign_keypair: () => SignKeyPair,
    crypto_sign_open: (MessageWithSignature, SignerPublicKey) => Message | Null,
    crypto_sign_seed_keypair: Uint8Array => SignKeyPair,
    crypto_sign_verify_detached: (Signature, Message, SignerPublicKey) => Boolean,
    decode_latin1: Uint8Array => String,
    decode_utf8: Uint8Array => String,
    encode_latin1: String => Uint8Array,
    encode_utf8: String => Uint8Array,
    from_hex: String => Uint8Array,
    random_bytes: Double => Uint8Array,
    to_hex: Uint8Array => String
  ): Nacl = {
    val __obj = js.Dynamic.literal(crypto_box = js.Any.fromFunction4(crypto_box), crypto_box_keypair = js.Any.fromFunction0(crypto_box_keypair), crypto_box_keypair_from_raw_sk = js.Any.fromFunction1(crypto_box_keypair_from_raw_sk), crypto_box_open = js.Any.fromFunction4(crypto_box_open), crypto_box_open_precomputed = js.Any.fromFunction3(crypto_box_open_precomputed), crypto_box_precompute = js.Any.fromFunction2(crypto_box_precompute), crypto_box_precomputed = js.Any.fromFunction3(crypto_box_precomputed), crypto_box_random_nonce = js.Any.fromFunction0(crypto_box_random_nonce), crypto_box_seed_keypair = js.Any.fromFunction1(crypto_box_seed_keypair), crypto_hash = js.Any.fromFunction1(crypto_hash), crypto_hash_sha256 = js.Any.fromFunction1(crypto_hash_sha256), crypto_secretbox = js.Any.fromFunction3(crypto_secretbox), crypto_secretbox_open = js.Any.fromFunction3(crypto_secretbox_open), crypto_secretbox_random_nonce = js.Any.fromFunction0(crypto_secretbox_random_nonce), crypto_sign = js.Any.fromFunction2(crypto_sign), crypto_sign_detached = js.Any.fromFunction2(crypto_sign_detached), crypto_sign_keypair = js.Any.fromFunction0(crypto_sign_keypair), crypto_sign_open = js.Any.fromFunction2(crypto_sign_open), crypto_sign_seed_keypair = js.Any.fromFunction1(crypto_sign_seed_keypair), crypto_sign_verify_detached = js.Any.fromFunction3(crypto_sign_verify_detached), decode_latin1 = js.Any.fromFunction1(decode_latin1), decode_utf8 = js.Any.fromFunction1(decode_utf8), encode_latin1 = js.Any.fromFunction1(encode_latin1), encode_utf8 = js.Any.fromFunction1(encode_utf8), from_hex = js.Any.fromFunction1(from_hex), random_bytes = js.Any.fromFunction1(random_bytes), to_hex = js.Any.fromFunction1(to_hex))
  
    __obj.asInstanceOf[Nacl]
  }
}

