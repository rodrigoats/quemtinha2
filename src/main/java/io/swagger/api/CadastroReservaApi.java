package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Reserva;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-31T00:32:03.324Z")

@Api(value = "cadastroReserva", description = "the cadastroReserva API")
public interface CadastroReservaApi {

    @ApiOperation(value = "", notes = "Cria uma requisiÃ§Ã£o de cadastro de reserva", response = Reserva.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "reserva response", response = Reserva.class),
        @ApiResponse(code = 200, message = "Erro inesperado", response = Reserva.class) })
    @RequestMapping(value = "/cadastroReserva",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Reserva> addReserva(@ApiParam(value = "Reserva hÃ¡ ser cadastrado" ,required=true ) @RequestBody Reserva reserva);

}
