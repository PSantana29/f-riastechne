package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@RestController
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CalcularDataRetorno {

public static final int TIMEOUT = 300;

/**
 *
 * @author Paulo Pinto Santana
 * @since 21/06/2023, 15:44:21
 *
 */
@RequestMapping(path = "/api/cronapi/rest/CalcularDataRetorno:calcularDataRetorno", method = RequestMethod.GET, consumes = "*/*")
public static Var calcularDataRetorno() throws Exception {
 return new Callable<Var>() {

   private Var obterDiasFerias = Var.VAR_NULL;
   private Var inicioFerias = Var.VAR_NULL;
   private Var dataRetorno = Var.VAR_NULL;

   public Var call() throws Exception {
    obterDiasFerias =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.diasFerias"));
    System.out.println(obterDiasFerias.getObjectAsString());
    inicioFerias =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.dataInicioFerias"));
    System.out.println(inicioFerias.getObjectAsString());
    dataRetorno =
    cronapi.math.Operations.sum(inicioFerias,obterDiasFerias);
    System.out.println(dataRetorno.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.dataRetorno"), dataRetorno);
    System.out.println(dataRetorno.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

