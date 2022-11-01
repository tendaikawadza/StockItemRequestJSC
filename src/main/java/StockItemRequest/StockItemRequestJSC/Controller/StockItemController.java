package StockItemRequest.StockItemRequestJSC.Controller;

import StockItemRequest.StockItemRequestJSC.Service.StockItemRequestService;
import StockItemRequest.StockItemRequestJSC.model.StockItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class StockItemController {

    @Autowired
    private StockItemRequestService stockItemRequestService;

    @PostMapping("/create")
    public StockItemRequest createStockItemRequest(@RequestBody StockItemRequest stockItemRequest) {
        System.out.println("coming stockItemRequest from client is : " + stockItemRequest);
        StockItemRequest createdStockItemRequest = stockItemRequestService.createStockItemRequest(stockItemRequest);

        return createdStockItemRequest;


    }
    @GetMapping("/get/{productCode}")
    public StockItemRequest getProductCode(@PathVariable("productCode")  Integer productCode ){

        StockItemRequest stockItemRequest= stockItemRequestService.getProductCode(productCode);
        return stockItemRequest;
    }


    @GetMapping("/check-stock/{productCode}")
    public boolean checkStockByProductCode(@PathVariable("productCode")  Integer productCode ){
        boolean isProductInStock= stockItemRequestService.isProductCodeInStock(productCode);
        return isProductInStock;
    }

































}
