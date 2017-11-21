import Dependencies._

name := "rekognition-demo"

lazy val root = (project in file("."))
  .settings(
    Commons.settings,
    libraryDependencies ++= commonDependencies
  )