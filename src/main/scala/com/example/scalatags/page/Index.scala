package com.example.scalatags.page

import scalatags.Text.all._
import scalatags.Text.tags2.{title => mainTitle}

object Index {
  val main = html(mainTitle("ScalaTags Playground"),body(p("Hello World!")))
}
