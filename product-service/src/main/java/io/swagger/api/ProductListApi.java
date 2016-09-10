package io.swagger.api;

import io.swagger.model.Product;
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

@Api(value = "productList", description = "the productList API")
public interface ProductListApi {

    @ApiOperation(value = "Get Product List by Category", notes = "Get alal products for agiven category", response = Product.class, responseContainer = "List", tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of price estimates by product", response = Product.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Product.class) })
    @RequestMapping(value = "/productList",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> productListGet(@ApiParam(value = "vendor name", required = true) @RequestParam(value = "vendorName", required = true) String vendorName



,@ApiParam(value = "product category", required = true) @RequestParam(value = "category", required = true) String category



);

}
