package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.dao.ProductCategoryDAO;
import io.swagger.model.ProductCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Controller
public class CreateProductCategoryApiController implements
		CreateProductCategoryApi {

	@Autowired
	private ProductCategoryDAO productCategoryDAO;

	public ResponseEntity<Integer> createProductCategoryPut(

			@ApiParam(value = "Create category", required = true) @RequestParam(value = "category", required = true) String category) {

		ProductCategory productCategory = new ProductCategory();

		productCategory.setCategoryName(category);

		productCategoryDAO.create(productCategory);

		return new ResponseEntity<Integer>(productCategory.getCategoryId(),
				HttpStatus.OK);
	}

}
