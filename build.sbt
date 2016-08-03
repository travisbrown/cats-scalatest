name := "cats-scalatest"
organization := "com.ironcorelabs"

scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.10.6", "2.11.8")

com.typesafe.sbt.SbtScalariform.scalariformSettings

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked"
)

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "0.7.0-SNAPSHOT",
  "org.typelevel" %% "cats-macros" % "0.7.0-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "2.2.6"
)
