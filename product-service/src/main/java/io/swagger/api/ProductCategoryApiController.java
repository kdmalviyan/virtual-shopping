package io.swagger.api;

import io.swagger.annotations.ApiParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-10T07:33:11.471Z")
@Controller
public class ProductCategoryApiController implements ProductCategoryApi {

	public ResponseEntity<List<String>> productCategoryGet(
			@ApiParam(value = "Vendor supports product category.", required = true) @RequestParam(value = "vendorName", required = true) String vendorName) {

		Map<String, List<String>> vendorCategoryMap = new ConcurrentHashMap<String, List<String>>();
		List<String> amazonProductCategory = new ArrayList<String>();
		List<String> flipkartProductCategory = new ArrayList<String>();
		List<String> snapDealProductCategory = new ArrayList<String>();

		amazonProductCategory.add("Electronics");
		amazonProductCategory.add("Mobile");
		amazonProductCategory.add("Clothes");
		amazonProductCategory.add("Shoes");
		amazonProductCategory.add("Books");

		flipkartProductCategory.add("Electronics");
		flipkartProductCategory.add("Mobile");
		flipkartProductCategory.add("Clothes");
		flipkartProductCategory.add("Shoes");
		flipkartProductCategory.add("Books");

		snapDealProductCategory.add("Electronics");
		snapDealProductCategory.add("Mobile");

		vendorCategoryMap.put("Amazon", amazonProductCategory);
		vendorCategoryMap.put("Flipkart", flipkartProductCategory);
		vendorCategoryMap.put("SnapDeal", snapDealProductCategory);

		return new ResponseEntity<List<String>>(
				vendorCategoryMap.get(vendorName), HttpStatus.OK);
	}

}
