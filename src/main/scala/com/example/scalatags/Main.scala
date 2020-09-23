package com.example.scalatags

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    ScalatagsServer.stream[IO].compile.drain.as(ExitCode.Success)
}