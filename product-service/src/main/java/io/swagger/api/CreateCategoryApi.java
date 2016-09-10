package io.swagger.api;

import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-10T09:53:45.928Z")

@Api(value = "createCategory", description = "the createCategory API")
public interface CreateCategoryApi {

    @ApiOperation(value = "Create Category", notes = "Create Category", response = Integer.class, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Category Created", response = Integer.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Integer.class) })
    @RequestMapping(value = "/createCategory",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Integer> createCategoryPut(@ApiParam(value = "Create category with Name", required = true) @RequestParam(value = "vendorId", required = true) Integer vendorId



,@ApiParam(value = "Create category", required = true) @RequestParam(value = "category", required = true) Integer category



);

}
