package com.example.scalatags

import cats.effect.Sync
import com.example.scalatags.page.{About, Index}
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl
import org.http4s.scalatags._


object ScalatagsRoutes {

  def helloWorldRoutes[F[_]: Sync]: HttpRoutes[F] = {
    val dsl = new Http4sDsl[F]{}
    import dsl._
    HttpRoutes.of[F] {
      case GET -> Root =>
        Ok(Index.main)

      case GET -> Root / "about" =>
        Ok(About.main)
    }
  }
}