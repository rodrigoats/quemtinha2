package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Reserva;

import io.swagger.annotations.*;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

import java.util.List;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-31T00:32:03.324Z")

@Controller
public class CadastroReservaApiController implements CadastroReservaApi {

    public ResponseEntity<Reserva> addReserva(@ApiParam(value = "Reserva hÃ¡ ser cadastrado" ,required=true ) @RequestBody Reserva reserva) {
        // do some magic!
    	
    	
     	try {

			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");

			//Create connection.
			Connection connection = factory.createConnection();
			
			// Start the connection
			connection.start();

			// Create a session which is non transactional
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			// Create Destination queue
			Destination queue = session.createQueue("reservas");

			// Create a producer
			MessageProducer producer = session.createProducer(queue);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			Gson gson = new Gson();
			String msg = gson.toJson(reserva);
			
			// insert message
			TextMessage message = session.createTextMessage(msg);
			System.out.println("Producer Sent: " + msg);
			producer.send(message);

			session.close();
			connection.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return new ResponseEntity<Reserva>(HttpStatus.OK);
    }

}
