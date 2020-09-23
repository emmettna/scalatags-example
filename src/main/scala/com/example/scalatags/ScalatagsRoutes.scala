package com.example.scalatags

import cats.effect.Sync
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl
import org.http4s.scalatags._
import scalatags.Text.all._
import scalatags.Text.tags2.{title => mainTitle}

object ScalatagsRoutes {

  def helloWorldRoutes[F[_]: Sync]: HttpRoutes[F] = {
    val dsl = new Http4sDsl[F]{}
    import dsl._
    HttpRoutes.of[F] {
      case GET -> Root =>
        val helloWorldInScalaTags = html(mainTitle("ScalaTags Playground"),body(p("Hello World!")))
        Ok(helloWorldInScalaTags)
    }
  }
}