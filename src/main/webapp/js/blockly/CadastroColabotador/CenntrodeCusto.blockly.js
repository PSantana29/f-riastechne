window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CadastroColabotador = window.blockly.js.blockly.CadastroColabotador || {};
window.blockly.js.blockly.CadastroColabotador.CenntrodeCusto = window.blockly.js.blockly.CadastroColabotador.CenntrodeCusto || {};

/**
 * @function linhaNegociocusto
 *
 *
 *
 *
 * @author Paulo Pinto Santana
 * @since 07/07/2023, 15:05:58
 *
 */
window.blockly.js.blockly.CadastroColabotador.CenntrodeCusto.linhaNegociocustoArgs = [];
window.blockly.js.blockly.CadastroColabotador.CenntrodeCusto.linhaNegociocusto = async function() {

  //
  (await this.cronapi.client('cronapi.screen.post').run("Linha_Negocio_Custo"));
  //
  this.cronapi.screen.notify('success','Cadastrado Colaborador com sucesso!');
}
