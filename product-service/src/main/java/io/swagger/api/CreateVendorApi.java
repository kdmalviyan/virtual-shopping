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

@Api(value = "createVendor", description = "the createVendor API")
public interface CreateVendorApi {

    @ApiOperation(value = "Create Vendor", notes = "Create Vendor", response = Integer.class, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Vendor Created", response = Integer.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Integer.class) })
    @RequestMapping(value = "/createVendor",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Integer> createVendorPut(@ApiParam(value = "Create Vendor with Name", required = true) @RequestParam(value = "vendorName", required = true) String vendorName



);

}
