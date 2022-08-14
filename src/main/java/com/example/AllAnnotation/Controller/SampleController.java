package com.example.AllAnnotation.Controller;

import com.example.AllAnnotation.Service.ServiceInterface;
import com.example.AllAnnotation.config.DbConfig;
import com.example.AllAnnotation.config.MailProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:custom.properties")
@Scope("singleton")
@RequestMapping("/SampleController")
public class SampleController {


    public SampleController() {

        System.out.println("controller object created ");
    }

    @Autowired
    private DbConfig dbConfig;
    @Autowired
    private MailProps mailProps;

  @Value("${mail.from}")
    private String from ;
    @Value("${mail.host}")
  private String host ;
    @Value("${mail.port}")
  private String port ;

    @Value("${message}")
    private String message ;

    @Autowired
    //@Qualifier("serviceInterfaceImpl")
   private ServiceInterface serviceInterface;


    @GetMapping("/getService")
    public void getService(){
        serviceInterface.disp();
    }

    @GetMapping("/getValues")
    public void getValues(){
        System.out.println("loading using @Value annotation "
        +from+""+host+""+port+"");
        System.out.println("loading using @Value annotation "
                +message+"");
    }

    @GetMapping("/getValuesFromMailProps")
    public void getValuesFromMailProps(){
        System.out.println("mail props"+mailProps);
    }

    @GetMapping("/getValuesDbConfig")
    public void getValuesDbConfig(){
        System.out.println("db config" +dbConfig.dataSourceProps());
    }



}
