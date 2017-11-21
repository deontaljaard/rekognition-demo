# rekognition-demo
Tinkering with the AWS Rekogniton Service to compare faces.

# Usage
Add your images to the src/main/resources folder. In RekognitionHelper.scala, change the paths for sourceImage and targetImage to the names of the image files you place in the aforementioned folder.

Run the entry point of the app; RekognitionApp and wait a couple of seconds for the output.

# Remember
You need a user (say rekognition-client) with an access and secret key. Copy the values of these keys into the BasicAWSCredentials constructor in RekognitionHelper.scala.
