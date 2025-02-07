package brightlogic.numberclassification.service;


import brightlogic.numberclassification.dto.NumberPropertiesRequest;
import brightlogic.numberclassification.dto.NumberPropertiesResponse;

public interface NumberPropertiesService {
//    NumberPropertiesResponse classifyNumber(int number);
    NumberPropertiesRequest getClassifyNumber(int number);
}
