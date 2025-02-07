package brightlogic.numberclassification.service;

import brightlogic.numberclassification.dto.NumberPropertiesRequest;
import brightlogic.numberclassification.model.NumberProperties;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NumberPropertiesServiceImpl implements NumberPropertiesService{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public NumberPropertiesRequest getClassifyNumber(int number) {
        NumberProperties properties = new NumberProperties();

        properties.setNumber(number);
        properties.setPrime(isPrime(number));
        properties.isPerfect(isPerfect(number));
        properties.setProperties(getProperties(number));
        properties.setDigitSum(digitSum(number));
        properties.setFunFact(getFunFact(number));

//        System.out.println("Fun fact in service "+ properties.getFunFact());

        return modelMapper.map(properties, NumberPropertiesRequest.class);
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int index = 2; index < Math.sqrt(number) ; index++) {
            if (number % index == 0) return false;
        }
        return true;
    }

    private boolean isPerfect(int number) {
        int sumOfDivisors = 0;
        for (int index = 1; index < number ; index++) {
            if (number % index == 0) sumOfDivisors += index;
        }
        return sumOfDivisors == number;
    }

    private int digitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private List<String> getProperties(int number) {
        if (number % 2 != 0) return List.of("Armstrong", "odd");
        return List.of();
    }

    private String getFunFact(int number) {
        String url = "http://numbersapi.com/" +number+"/math";
        ResponseEntity<String> responseEntity =  restTemplate.getForEntity(url, String.class);
        System.out.println("Response is this "+ responseEntity.getBody());
        return responseEntity.getBody();
    }

}
