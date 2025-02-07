package brightlogic.numberclassification.controller;

import brightlogic.numberclassification.dto.NumberPropertiesRequest;
import brightlogic.numberclassification.service.NumberPropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "*")
public class NumberPropertiesController {

    @Autowired
    private NumberPropertiesService numberService;


    @GetMapping("/classify-number")
    public ResponseEntity<NumberPropertiesRequest> classifyNumber(@RequestParam int number) {
        NumberPropertiesRequest propertiesRequest = numberService.getClassifyNumber(number);
        return new ResponseEntity<>(propertiesRequest, HttpStatus.OK);
    }


}
