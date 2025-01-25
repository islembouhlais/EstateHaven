package project.app.demo.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class clientController {

    private final clientInfoService clientInfoS_ervice;

    public clientController(clientInfoService clientInfoS_ervice) {
        this.clientInfoS_ervice = clientInfoS_ervice;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/add_client")
    public ResponseEntity<Object> insertClient(@RequestBody clientEntity client) {
        clientInfoS_ervice.add_client(client);

        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

}
