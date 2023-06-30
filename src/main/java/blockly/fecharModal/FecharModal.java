package blockly.fecharModal;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FecharModal {

public static final int TIMEOUT = 300;

/**
 *
 * @author Paulo Pinto Santana
 * @since 19/06/2023, 15:04:56
 *
 */
public static Var fecharModal() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
Var.valueOf(fecharModal());
   }
 }.call();
}

}

