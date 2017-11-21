package rekognition

import java.nio.ByteBuffer
import java.nio.file.{Files, Paths}

import com.amazonaws.auth.{AWSStaticCredentialsProvider, BasicAWSCredentials}
import com.amazonaws.regions.Regions
import com.amazonaws.services.rekognition.model.{CompareFacesRequest, Image}
import com.amazonaws.services.rekognition.{AmazonRekognition, AmazonRekognitionClientBuilder}

object RekognitionHelper {

  val accessKeyId = "access-key"
  val secretAccessKey = "secret-key"

  private val basicAWSCredentials = new BasicAWSCredentials(accessKeyId, secretAccessKey)
  private val awsStaticCredentialsProvider = new AWSStaticCredentialsProvider(basicAWSCredentials)

  val rekognitionClient: AmazonRekognition = AmazonRekognitionClientBuilder.standard()
    .withRegion(Regions.EU_WEST_1)
    .withCredentials(awsStaticCredentialsProvider)
    .build()

  def buildCompareFacesRequest(sourceImage: Image, targetImage: Image, thresholdSimilarity: Float): CompareFacesRequest = {
    val compareFacesRequest = new CompareFacesRequest()
    compareFacesRequest.setSourceImage(sourceImage)
    compareFacesRequest.setTargetImage(targetImage)
    compareFacesRequest.setSimilarityThreshold(thresholdSimilarity)
    compareFacesRequest
  }

  def getRekognitionImageFromPath(pathToImage: String): Image = {
    val imagePath = Paths.get(getClass.getResource(pathToImage).getPath)
    val image = new Image()
    image.setBytes(ByteBuffer.wrap(Files.readAllBytes(imagePath)))
    image
  }


}
