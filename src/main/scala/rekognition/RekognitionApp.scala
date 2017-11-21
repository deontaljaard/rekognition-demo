package rekognition

import com.amazonaws.services.rekognition.model.CompareFacesResult
import rekognition.RekognitionHelper._

object RekognitionApp extends App {

  val sourceImage = getRekognitionImageFromPath("/image1.jpeg")
  val targetImage = getRekognitionImageFromPath("/image2.jpeg")
  val similarityThreshold = 80f

  val compareFacesRequest = buildCompareFacesRequest(sourceImage, targetImage, similarityThreshold)

  private val result: CompareFacesResult = rekognitionClient.compareFaces(compareFacesRequest)

  if(result.getUnmatchedFaces.isEmpty) {
    println(s"Match found!\n${result.getFaceMatches}")
  } else {
    println(s"No match found!\n${result.getUnmatchedFaces}")
  }
}
