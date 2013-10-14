import sbt._
import Keys._

object InstalleraBuild extends Build {
  override val settings = super.settings ++ Seq(
    scalaVersion := "2.10.3"
  )

  lazy val core = Project("installera-core", file("installera-core"))
  lazy val demo = Project("installera-demo", file("installera-demo")) dependsOn core
  lazy val root = Project("installera", file(".")) aggregate(core, demo)
}