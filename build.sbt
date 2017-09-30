lazy val root = (project in file("."))
  .settings(
    name := "scala-workshop",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % Test
    )
  )