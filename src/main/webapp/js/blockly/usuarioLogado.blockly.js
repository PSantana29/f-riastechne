window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.UsuarioLogado = window.blockly.js.blockly.UsuarioLogado || {};

/**
 * @function usuarioLogado
 *
 *
 *
 *
 * @author Paulo Pinto Santana
 * @since 23/06/2023, 11:30:27
 *
 */
window.blockly.js.blockly.UsuarioLogado.usuarioLogadoArgs = [];
window.blockly.js.blockly.UsuarioLogado.usuarioLogado = async function() {

  //
  this.cronapi.screen.changeValueOfField("SolicitarFerias.active.nomeFuncionario", this.cronapi.util.getUser());
}
