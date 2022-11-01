package StockItemRequest.StockItemRequestJSC.Service;

import StockItemRequest.StockItemRequestJSC.Repo.StockItemRequestRepository;
import StockItemRequest.StockItemRequestJSC.model.StockItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockItemRequestService {


    @Autowired
    StockItemRequestRepository stockItemRequestRepository;

    public  StockItemRequest createStockItemRequest(StockItemRequest stockItemRequestObj){

        StockItemRequest insertedStockItemRequest = stockItemRequestRepository.save(stockItemRequestObj);
        return insertedStockItemRequest;
    }


    public StockItemRequest getProductCode(Integer productCode){

        StockItemRequest stockItemRequestObject = stockItemRequestRepository.findByProductCode(productCode);
        return stockItemRequestObject;
    }


    public boolean isProductCodeInStock(Integer productCode ){

        StockItemRequest stockItemRequestObject = stockItemRequestRepository.findByProductCode(productCode);

        Integer stockItemQuantity =stockItemRequestObject.getQuantity();

        if (stockItemQuantity == 0 ){
            return false;
        }else {
            return true;
        }

    }











}
