package com.raquo.domtypes.generic

package object codecs {

  // @TODO[Performance] Which of those methods could benefit from @inline annotation? We typically use those values typed as just `Codec`

  // String Codecs

  object StringAsIsCodec extends AsIsCodec[String]

  // Int Codecs

  object IntAsIsCodec extends AsIsCodec[Int]

  object IntAsStringCodec extends Codec[Int, String] {
    @inline override def decode(domValue: String): Int = domValue.toInt // @TODO this can throw exception. How do we handle this?
    @inline override def encode(scalaValue: Int): String = scalaValue.toString
  }

  // Double Codecs

  object DoubleAsIsCodec extends AsIsCodec[Double]

  object DoubleAsStringCodec extends Codec[Double, String] {
    @inline override def decode(domValue: String): Double = domValue.toDouble// @TODO this can throw exception. How do we handle this?
    @inline override def encode(scalaValue: Double): String = scalaValue.toString
  }

  // Boolean Codecs

  object BooleanAsIsCodec extends AsIsCodec[Boolean]

  object BooleanAsAttrPresenceCodec extends Codec[Boolean, String] {
    @inline override def decode(domValue: String): Boolean = domValue != null
    @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "" else null
  }

  object BooleanAsTrueFalseStringCodec extends Codec[Boolean, String] {
    @inline override def decode(domValue: String): Boolean = domValue == "true"
    @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "true" else "false"
  }

  object BooleanAsYesNoStringCodec extends Codec[Boolean, String] {
    @inline override def decode(domValue: String): Boolean = domValue == "yes"
    @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "yes" else "no"
  }

  object BooleanAsOnOffStringCodec extends Codec[Boolean, String] {
    @inline override def decode(domValue: String): Boolean = domValue == "on"
    @inline override def encode(scalaValue: Boolean): String = if (scalaValue) "on" else "off"
  }

  // Iterable Codecs

  object IterableAsSpaceSeparatedStringCodec extends Codec[Iterable[String], String] { // use for e.g. className
    @inline override def decode(domValue: String): Iterable[String] = if (domValue == "") Nil else domValue.split(' ')
    @inline override def encode(scalaValue: Iterable[String]): String = scalaValue.mkString(" ")
  }

  object IterableAsCommaSeparatedStringCodec extends Codec[Iterable[String], String] { // use for lists of IDs
    @inline override def decode(domValue: String): Iterable[String] = if (domValue == "") Nil else domValue.split(',')
    @inline override def encode(scalaValue: Iterable[String]): String = scalaValue.mkString(",")
  }
}
