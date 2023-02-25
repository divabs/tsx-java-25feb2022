package com.tsk_java.webhook;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhook")
public class WebhookController {

    @PostMapping //http:/localhost:8080/api/webhook
    public ResponseEntity<String> display(@RequestBody String request){
        System.out.println("Webhook : "+request);
        return new ResponseEntity<String>(request,HttpStatus.OK);
    }
}
