package it.develhope.primi_passi_first.API_04;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

@RestController
@RequestMapping("/api")
public class HeaderController{
    @GetMapping("/headers")
    public InetSocketAddress getHeader(@RequestHeader HttpHeaders headers){
        return headers.getHost();
    }
}
