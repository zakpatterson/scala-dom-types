package com.raquo.domtypes.generic.defs.tags

import com.raquo.domtypes.generic.builders.HtmlTagBuilder

/**
  * Contains HTML tags which are used less frequently. These are generally
  * imported individually as needed.
  */
trait MiscTags[T[_ <: DomHtmlElement], DomHtmlElement, HtmlTitle <: DomHtmlElement, HtmlStyle <: DomHtmlElement, HtmlElement <: DomHtmlElement, HtmlQuote <: DomHtmlElement, HtmlProgress <: DomHtmlElement, HtmlMenu <: DomHtmlElement] {
  this: HtmlTagBuilder[T, DomHtmlElement] =>

  // Document Metadata

  /**
    * Defines the title of the document, shown in a browser's title bar or on the
    * page's tab. It can only contain text and any contained tags are not
    * interpreted.
    *
    * MDN
    */
  @inline def titleTag: T[HtmlTitle] = htmlTag("title")

  /**
    * Used to write inline CSS.
    *
    *  MDN
    */
  @inline def styleTag: T[HtmlStyle] = htmlTag("style")

  // Sections

  /**
    * Represents a generic section of a document, i.e., a thematic grouping of
    * content, typically with a heading.
    *
    *  MDN
    */
  @inline def section: T[HtmlElement] = htmlTag("section")

  /**
    * Represents a section of a page that links to other pages or to parts within
    * the page: a section with navigation links.
    *
    *  MDN
    */
  @inline def nav: T[HtmlElement] = htmlTag("nav")

  /**
    * Defines self-contained content that could exist independently of the rest
    * of the content.
    *
    *  MDN
    */
  @inline def article: T[HtmlElement] = htmlTag("article")

  /**
    * Defines some content loosely related to the page content. If it is removed,
    * the remaining content still makes sense.
    *
    *  MDN
    */
  @inline def aside: T[HtmlElement] = htmlTag("aside")

  /**
    * Defines a section containing contact information.
    *
    *  MDN
    */
  @inline def address: T[HtmlElement] = htmlTag("address")

  /**
    * Defines the main or important content in the document. There is only one
    * main element in the document.
    *
    *  MDN
    */
  @inline def main: T[HtmlElement] = htmlTag("main")

  // Text level semantics

  /**
    * An inline quotation.
    *
    *  MDN
    */
  @inline def q: T[HtmlQuote] = htmlTag("q")

  /**
    * Represents a term whose definition is contained in its nearest ancestor
    * content.
    *
    *  MDN
    */
  @inline def dfn: T[HtmlElement] = htmlTag("dfn")

  /**
    * An abbreviation or acronym; the expansion of the abbreviation can be
    * represented in the title attribute.
    *
    *  MDN
    */
  @inline def abbr: T[HtmlElement] = htmlTag("abbr")

  /**
    * Associates to its content a machine-readable equivalent.
    *
    *  MDN
    */
  @inline def dataTag: T[HtmlElement] = htmlTag("data")

  /**
    * Represents a date and time value; the machine-readable equivalent can be
    * represented in the datetime attribute
    *
    *  MDN
    */
  @inline def time: T[HtmlElement] = htmlTag("time")

  /**
    * Represents a variable.
    *
    *  MDN
    */
  @inline def `var`: T[HtmlElement] = htmlTag("var")

  /**
    * Represents the output of a program or a computer.
    *
    *  MDN
    */
  @inline def samp: T[HtmlElement] = htmlTag("samp")

  /**
    * Represents user input, often from a keyboard, but not necessarily.
    *
    *  MDN
    */
  @inline def kbd: T[HtmlElement] = htmlTag("kbd")

  /**
    * Defines a mathematical formula.
    *
    *  MDN
    */
  @inline def math: T[HtmlElement] = htmlTag("math")

  /**
    * Represents text highlighted for reference purposes, that is for its
    * relevance in another context.
    *
    *  MDN
    */
  @inline def mark: T[HtmlElement] = htmlTag("mark")

  /**
    * Represents content to be marked with ruby annotations, short runs of text
    * presented alongside the text. This is often used in conjunction with East
    * Asian language where the annotations act as a guide for pronunciation, like
    * the Japanese furigana .
    *
    *  MDN
    */
  @inline def ruby: T[HtmlElement] = htmlTag("ruby")

  /**
    * Represents the text of a ruby annotation.
    *
    *  MDN
    */
  @inline def rt: T[HtmlElement] = htmlTag("rt")

  /**
    * Represents parenthesis around a ruby annotation, used to display the
    * annotation in an alternate way by browsers not supporting the standard
    * display for annotations.
    *
    *  MDN
    */
  @inline def rp: T[HtmlElement] = htmlTag("rp")

  /**
    * Represents text that must be isolated from its surrounding for bidirectional
    * text formatting. It allows embedding a span of text with a different, or
    * unknown, directionality.
    *
    *  MDN
    */
  @inline def bdi: T[HtmlElement] = htmlTag("bdi")

  /**
    * Represents the directionality of its children, in order to explicitly
    * override the Unicode bidirectional algorithm.
    *
    *  MDN
    */
  @inline def bdo: T[HtmlElement] = htmlTag("bdo")

  // Forms

  /**
    * A key-pair generator control.
    *
    *  MDN
    */
  @inline def keyGen: T[HtmlElement] = htmlTag("keygen")

  /**
    * The result of a calculation
    *
    *  MDN
    */
  @inline def output: T[HtmlElement] = htmlTag("output")

  /**
    * A progress completion bar
    *
    *  MDN
    */
  @inline def progress: T[HtmlProgress] = htmlTag("progress")

  /**
    * A scalar measurement within a known range.
    *
    *  MDN
    */
  @inline def meter: T[HtmlElement] = htmlTag("meter")

  // Interactive elements

  /**
    * A widget from which the user can obtain additional information
    * or controls.
    *
    *  MDN
    */
  @inline def details: T[HtmlElement] = htmlTag("details")

  /**
    * A summary, caption, or legend for a given details.
    *
    *  MDN
    */
  @inline def summary: T[HtmlElement] = htmlTag("summary")

  /**
    * A command that the user can invoke.
    *
    *  MDN
    */
  @inline def command: T[HtmlElement] = htmlTag("command")

  /**
    * A list of commands
    *
    *  MDN
    */
  @inline def menu: T[HtmlMenu] = htmlTag("menu")
}
