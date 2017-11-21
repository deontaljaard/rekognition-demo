import sbt.Def
import sbt.Keys.{organization, resolvers, scalaVersion, version}

object Commons {
  val appVersion = "1.0"

  val settings: Seq[Def.Setting[_]] = Seq(
    organization := "deontaljaard.github.io",
    version := appVersion,
    scalaVersion := "2.12.4",
    resolvers := Resolvers.rekognitionDemoResolvers
  )
}
