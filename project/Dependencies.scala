import sbt._

object Dependencies {

  val awsRekognitionSdkVersion = "1.11.233"

  val awsRekognitionSdk: ModuleID = "com.amazonaws" % "aws-java-sdk-rekognition" % awsRekognitionSdkVersion

  lazy val commonDependencies: Seq[ModuleID] = Seq(
    awsRekognitionSdk
  )

}
