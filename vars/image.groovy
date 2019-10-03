import groovy.json.JsonSlurperClassic
def call(Component)
{
// Get all images with tags as JSON, the --filter is very important to get only images that have a tag
def cmd = ""
System.out.println(Component);
if(Component.equals("Clustering Core")){
  cmd = "aws ecr list-images --repository-name webapp --filter tagStatus=TAGGED --region ap-south-1"
}else if(Component.equals("Location Service")){
  cmd = "aws ecr list-images --repository-name location_service --filter tagStatus=TAGGED --region ap-south-1"
}else if(Component.equals("OSRM")){
  cmd = "aws ecr list-images --repository-name osrm --filter tagStatus=TAGGED --region ap-south-1"
}else if(Component.equals("Web")){
  cmd = "aws ecr list-images --repository-name webapp --filter tagStatus=TAGGED --region ap-south-1"
}
else{
  throw new IllegalArgumentException("Unknown Component.");
}

def ecr_images_json = cmd.execute()

// Parse JSON into Groovy object
def data = new JsonSlurperClassic().parseText(ecr_images_json.text)

// Prepare the results list
def ecr_images = [];

// Add all tags
data.imageIds.each { ecr_images.push(it.imageTag) } 

// Return the list for Jenkins "select-box"
return ecr_images
}
