package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Product;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-10T09:53:45.928Z")

@Controller
public class CreateProductApiController implements CreateProductApi {

    public ResponseEntity<Integer> placeOrder(

@ApiParam(value = "Create aproduct"  ) @RequestBody Product body

) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

}
