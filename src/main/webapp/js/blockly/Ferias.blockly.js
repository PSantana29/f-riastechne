window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Ferias = window.blockly.js.blockly.Ferias || {};

/**
 * @function solicitarFerias
 *
 *
 *
 *
 * @author Paulo Pinto Santana
 * @since 30/06/2023, 00:38:16
 *
 */
window.blockly.js.blockly.Ferias.solicitarFeriasArgs = [];
window.blockly.js.blockly.Ferias.solicitarFerias = async function() {

  //
  try {
     //
    (await this.cronapi.client('cronapi.screen.post').run("SolicitarFerias"));
   } catch (null_exception) {
        null = null_exception;
     //
    this.cronapi.util.throwException(this.cronapi.util.createException('Solicitação de Férias Com Erro'));
   }
  //
  this.cronapi.screen.hideModal("modalFerias");
  //
  this.cronapi.screen.notify('success','Férias solicitada com sucesso!');
}
