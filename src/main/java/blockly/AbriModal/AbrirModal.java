package blockly.AbriModal;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AbrirModal {

public static final int TIMEOUT = 300;

/**
 *
 * @author Paulo Pinto Santana
 * @since 19/06/2023, 15:30:59
 *
 */
public static Var abrirModal() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
Var.valueOf(abrirModal());
   }
 }.call();
}

}

