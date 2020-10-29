package com.resources.service;


import com.resources.model.PutOperationResponse;
import com.resources.model.Story;


public interface ServiceApplication {

	public static  PutOperationResponse updateStory (Story storyToUpdate) {
	PutOperationResponse putOperationResponse =  new PutOperationResponse();
	
	return putOperationResponse;
	
	
	
	
	
	
	
	
	}
}
////	//validar campos de body 
//			Integer id;
//			Integer sprint_id;
//			Integer user_id;
//			Integer priority;
//			String name;
//			String description;
//			String aceptance_criteria;
//			Integer story_points;
//			Integer progress;
//			Integer start_date;
//			Integer due_date;
//			Integer create_date;
//			Integer status;
////			
////		
////////     verificar que id existe en la db (Story.id)
//	
//	
//	if (!RepositoryApplication.existsById(id)) {
//		AtResourcesApi2Application.logger.error("trying to find a metric but  did not found an ID");
//		TypeError.httpErrorMessage(HttpStatus.NOT_FOUND, new Exception(), HttpExceptionMessage.IdNotFound404,
//				"/metric/" + id);
//		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//	}else if(RepositoryApplication.findById(id).isPresent()){
//		Story = RepositoryApplication.findById(id).get();
//	}
//	AtResourcesApi2Application.logger.info("Returning metric");
//	return Story;
//
//}
////	
////	if (!id.equals("")) response = false; 
////    else throw new BadRequestException(HttpExceptionMessage.BadRequestEmptyPassword,PathErrorMessage.pathApi,HttpStatus.BAD_REQUEST);	
////return response;
////
////
////	function updateByUsr(req, res){
////    let idusr  = req.params.idusr
////    let update = req.body
////
////    InfoCli.findOneAndUpdate(idusr, update, (err, infocliUpdate) => {
////        if (err) return res.status(500).send({message: 'Error making 
////                                                request: $(err)'})
////
////        if (!idusr) return res.status(404).send({message: 'The client does 
////                                                           not exist '})
////
////        res.status(200).send({infocliente: infocliUpdate})
////    })
//// }
////
////
////
////////            si el id existe hacer update de storyToUpdate
////////            si la operacion fue exitosa PostRequestResponse.StoryId = storyToUpdate.id
////////     No Id en la DB mandar exception 404
//////		
//////		
//	
////	
//}
////
////If the "_ID" is coming in the PUT request, you need to ignore it and keep the current "_ID" that already exists.
////
////If the id is not found, return 404 NOT FOUND exception (custom exceptions).
////
////The response when the story is correctly updated is 200 OK.
