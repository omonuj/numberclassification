package brightlogic.numberclassification.service;


import brightlogic.numberclassification.dto.NumberPropertiesRequest;

public interface NumberPropertiesService {

    NumberPropertiesRequest getClassifyNumber(int number);
}
