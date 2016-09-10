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

@Api(value = "vendorList", description = "the vendorList API")
public interface VendorListApi {

    @ApiOperation(value = "Get List Of all available Vendors", notes = "Get List Of all available Vendors", response = String.class, responseContainer = "List", tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all available vendors", response = String.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = String.class) })
    @RequestMapping(value = "/vendorList",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> vendorListGet();

}
