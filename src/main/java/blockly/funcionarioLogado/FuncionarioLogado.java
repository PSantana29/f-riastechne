package blockly.funcionarioLogado;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FuncionarioLogado {

public static final int TIMEOUT = 300;

/**
 *
 * @author Paulo Pinto Santana
 * @since 19/06/2023, 17:29:02
 *
 */
public static Var funcionarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.util.Operations.getCurrentUserName();
    return item;
   }
 }.call();
}

}

