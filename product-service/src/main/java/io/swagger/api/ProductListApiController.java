package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-10T08:10:22.071Z")
@Controller
public class ProductListApiController implements ProductListApi {

	public ResponseEntity<List<Product>> productListGet(
			@ApiParam(value = "vendor name", required = true) @RequestParam(value = "vendorName", required = true) String vendorName,
			@ApiParam(value = "product category", required = true) @RequestParam(value = "category", required = true) String category) {

		Map<String, Map<String, List<Product>>> productMap = new ConcurrentHashMap<String, Map<String, List<Product>>>();
		Map<String, List<Product>> amazonCategoryProductMap = new ConcurrentHashMap<String, List<Product>>();
		Map<String, List<Product>> flipkartCategoryProductMap = new ConcurrentHashMap<String, List<Product>>();
		Map<String, List<Product>> snapDealCategoryProductMap = new ConcurrentHashMap<String, List<Product>>();

		List<Product> amazonElectronicsList = new ArrayList<Product>();

		Product electronicsTv = new Product();
		electronicsTv.setProductId(1000);
		electronicsTv.setDescription("43Inch LED TV");
		electronicsTv.setDisplayName("LG43LED");

		amazonElectronicsList.add(electronicsTv);

		Product electronicsWashingMachine = new Product();
		Product electronicsIron = new Product();

		amazonCategoryProductMap.put("Electronics", amazonElectronicsList);
		productMap.put("Amazon", amazonCategoryProductMap);

		return new ResponseEntity<List<Product>>(productMap.get(vendorName)
				.get(category), HttpStatus.OK);
	}

}
