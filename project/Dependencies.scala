import sbt._

object Dependencies {
  lazy val scalaTest = "3.2.0"

  lazy val backendDeps = Seq(
    "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )
}
